package _15_Konto_Lösungen;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Kontoverwaltung {
    private static Konto[] konten = new Konto[0]; // wird mit Arrays.copyOf erweitert
    private static final Scanner scanner = new Scanner(System.in);

    private Konto kontoInArray(int pKontonummer) {
        Konto gesuchtesKonto = null;
        for (Konto k : konten) {
            if (k.getKontonummer() == pKontonummer) {
                gesuchtesKonto = k;
                break;
            }
        }
        return gesuchtesKonto;
    }

    private Vertrag vertragAnlegen(String pVertragsart) {
        Vertrag vertrag;
        // Kontoführung, Guthabenzinsen, Darlehnszinsen, maxDarlehnssumme, maxAbhebebetrag
        if (pVertragsart.equals("Standard")) {
            vertrag = new Vertrag("Standard", 5.0, 0.005, 0.1, 1000.0, 2000.0);
        } else {
            vertrag = new Vertrag("Junior", 0.0, 0.015, 0.0, 0.0, 500.0);
        }
        return vertrag;
    }

    public void neuesKontoAnlegen() {
        Vertrag gewaehlterVertrag = null;
        System.out.print("Ihr Vor- und Nachname: ");
        String vorUndNachname = scanner.nextLine();
        System.out.print("Welcher Vertrag? (1) Standard, (2) Junior: ");
        String vertragsart = scanner.nextLine();

        boolean wurdeRichtigGewaehlt = false;
        while (!wurdeRichtigGewaehlt) {
            if (vertragsart.equals("1")) {
                gewaehlterVertrag = vertragAnlegen("Standard");
                wurdeRichtigGewaehlt = true;
            } else if (vertragsart.equals("2")) {
                gewaehlterVertrag = vertragAnlegen("Junior");
                wurdeRichtigGewaehlt = true;
            } else {
                System.out.println("Wählen Sie 1 oder 2.");
            }
        }

        // Ein neues Konto anlegen. Die Kontonummer darf noch nicht im Kontenarray vorhanden sein.
        Konto k = new Konto(gewaehlterVertrag, vorUndNachname);
        while (kontoInArray(k.getKontonummer()) != null) { // Wenn das Konto noch nicht im Array ist, ...
            k = new Konto(gewaehlterVertrag, vorUndNachname); // wird es angelegt
        }
        k.setKontostand(0.0);
        k.setIstGesperrt(false);
        konten = Arrays.copyOf(konten, konten.length + 1);
        konten[konten.length - 1] = k; // Konto hinten ans Array anfügen
        System.out.printf("""
                Konto erfolgreich angelegt!
                Ihre neue Kontonummer lautet: %d
                """, konten[konten.length - 1].getKontonummer());
    }

    public void einzahlen(int pKontonummer, double pBetrag) {
        Konto k = kontoInArray(pKontonummer);
        if (k != null) {
            k.einzahlen(pBetrag);
            DecimalFormat df = new DecimalFormat("###,###.00");
            System.out.println("Sie haben " + df.format(pBetrag) + " € eingezahlt.");
            System.out.println("Ihr neuer Kontostand beträgt " + df.format(k.getKontostand()) + " €.");
        } else {
            System.out.println("Konto nicht gefunden.\n");
        }
    }

    public void abheben(int pKontonummer, double pBetrag) {
        Konto k = kontoInArray(pKontonummer);
        if (k != null) {
            if (k.kannAbheben(pBetrag)) {
                k.abheben(pBetrag);
                DecimalFormat df = new DecimalFormat("###,###.00");
                System.out.println("Sie haben " + df.format(pBetrag) + " € abgehoben.");
                System.out.println("Ihr neuer Kontostand beträgt " + df.format(k.getKontostand()) + " €.");
            } else {
                System.out.println("Sie haben versucht, mehr abzuheben als erlaubt. Ihr Konto wird gesperrt.");
                k.setIstGesperrt(true);
            }
        } else {
            System.out.println("Konto nicht gefunden!");
        }
    }

    public void kontodetailsAnzeigen(int pKontonummer) {
        if (kontoInArray(pKontonummer) == null) {
            System.out.println("Konto nicht gefunden");
        } else {
            Konto k = kontoInArray(pKontonummer);
            k.detailsAnzeigen();
        }
    }

    public void gebuehrenBerechnen(int pKontonummer) {
        for (Konto k : konten) {
            if (k.getKontonummer() == pKontonummer) {
                k.gebuehrenErheben();
                DecimalFormat df = new DecimalFormat();
                System.out.println("Ihr neuer Kontostand beträgt " + df.format(k.getKontostand()) + " €.\n");
            }
        }
    }

    public void kontenListeAnzeigen() {
        System.out.println("Es existieren folgende Konten: ");
        for (int i = 0; i < konten.length; i++) {
            System.out.printf("\t[%d]: Kontoinhaber: %s, Kontonummer: %d\n", i, konten[i].getInhaber(), konten[i].getKontonummer());
        }
    }

    // Menü der Kontoverwaltung in der main-Methode
    public static void main(String[] args) {
        Kontoverwaltung kv = new Kontoverwaltung();

        boolean bRun = true;
        while (bRun) {

            String[] menue = {
                    "Konto anlegen",
                    "Einzahlen",
                    "Abheben",
                    "Gebühren berechnen",
                    "Kontodetails anzeigen",
                    "Kontenliste anzeigen",
                    "Ende"};
            for (int i = 0; i < menue.length; i++) {
                System.out.printf("%d. %s \n", i + 1, menue[i]);
            }

            System.out.print("\nWas möchten Sie tun? ");
            String auswahl = scanner.nextLine();

            switch (auswahl) { // Konto anlegen
                case "1" -> kv.neuesKontoAnlegen();
                case "2" -> { // Einzahlen
                    System.out.print("Ihre Kontonummer: ");
                    String kontonummer = scanner.nextLine();
                    System.out.print("Welchen Betrag? ");
                    String betrag = scanner.nextLine();
                    kv.einzahlen(Integer.parseInt(kontonummer), Double.parseDouble(betrag));
                }
                case "3" -> { // Abheben
                    System.out.print("Ihre Kontonummer: ");
                    String kontonummer = scanner.nextLine();
                    System.out.print("Welchen Betrag? ");
                    String betrag = scanner.nextLine();
                    kv.abheben(Integer.parseInt(kontonummer), Double.parseDouble(betrag));
                }
                case "4" -> { // Gebühren berechnen
                    System.out.print("Ihre Kontonummer: ");
                    String kontonummer = scanner.nextLine();
                    kv.gebuehrenBerechnen(Integer.parseInt(kontonummer));
                }
                case "5" -> { // Kontodetails anzeigen
                    System.out.print("Ihre Kontonummer: ");
                    String kontonummer = scanner.nextLine();
                    kv.kontodetailsAnzeigen(Integer.parseInt(kontonummer));
                }
                case "6" -> kv.kontenListeAnzeigen(); // Alle Konten anzeigen
                case "7" -> bRun = false; // Ende
                default -> System.out.println("Falscher Menüpunkt");
            }
        }
    }
}
