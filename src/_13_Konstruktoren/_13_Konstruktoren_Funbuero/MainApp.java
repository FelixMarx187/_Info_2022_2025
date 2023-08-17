package _13_Konstruktoren._13_Konstruktoren_Funbuero;

import java.util.Scanner;

public class MainApp {
    public static Fundbuero[] fundstueckeListe = new Fundbuero[1000];

    public static Fundbuero[] fundstueckezHinzufuegen(String pFundstueck, String pFundort, String pDatum, String pFinderName, String pFinderAdresse, int pPreis) {
        for (int i = 0; i < fundstueckeListe.length; i++) {
            if (fundstueckeListe[i] == null) {
                Fundbuero s = new Fundbuero(pFundstueck, pFundort, pDatum, pFinderName, pFinderAdresse, pPreis);
                fundstueckeListe[i] = s;
                break;
            }
        }
        return fundstueckeListe;
    }

    public static Fundbuero[] selberFidner(String pFundstueck, int pPreis) {
        int lastidx = -1;
        for (int i = 0; i < fundstueckeListe.length; i++) {
            if (fundstueckeListe[i] == null) {
                Fundbuero i2 = new Fundbuero(pFundstueck, fundstueckeListe[i - 1].Fundort, fundstueckeListe[i - 1].Datum, fundstueckeListe[i - 1].finderName, fundstueckeListe[i - 1].finderAdresse, pPreis);
                fundstueckeListe[i] = i2;
            }
        }
        return fundstueckeListe;
    }

    public static Fundbuero[] anonymHinzufuegen(String pFundstueck, String pFundort, String pDatum, int pPreis) {
        for (int i = 0; i < fundstueckeListe.length; i++) {
            if (fundstueckeListe[i] == null) {
                Fundbuero i2 = new Fundbuero(pFundstueck, pFundort, pDatum, "Anonym", "Anonym", pPreis);
            }
        }
        return fundstueckeListe;
    }

    public static void listeAusgeben() {
        for (Fundbuero s : fundstueckeListe) {
            if (s != null) {
                System.out.println("Fundstück: " + s.Fundstueck + "\n" + "Fundort: " + s.Fundort + "\n" + "Datum: " + s.Datum + "\n" + "Finder Name: " + s.finderName + "\n" + "Finder Adresse: " + s.finderAdresse + "\n" + "Preis: " + s.preisSchaetzung + " €");
                System.out.println("-----------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Fundbüro");
            System.out.println("-----------------------------------------");
            System.out.println("[1] Neues Fundstück | [2] selber Finder | [3] Anonymes Fundstück | [4] Liste Ausgeben");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.print("Fundstück: ");
                scanner.nextLine();
                String funstueck = scanner.nextLine();
                System.out.print("Fundort: ");
                String fundort = scanner.nextLine();
                System.out.print("Datum: ");
                String datum = scanner.nextLine();
                System.out.print("Finder Name: ");
                String finderName = scanner.nextLine();
                System.out.print("Finder Adressen: ");
                String finderAdresse = scanner.nextLine();
                System.out.print("Preis: ");
                int preis = scanner.nextInt();
                fundstueckezHinzufuegen(funstueck, fundort, datum, finderName, finderAdresse, preis);
            } else if (input == 2) {
                System.out.print("Fundstück: ");
                scanner.nextLine();
                String funstueck = scanner.nextLine();
                System.out.print("Preis: ");
                int preis = scanner.nextInt();
                selberFidner(funstueck, preis);
            } else if (input == 3) {
                System.out.print("Fundstück: ");
                scanner.nextLine();
                String funstueck = scanner.nextLine();
                System.out.print("Fundort: ");
                String fundort = scanner.nextLine();
                System.out.print("Datum: ");
                String datum = scanner.nextLine();
                System.out.print("Preis: ");
                int preis = scanner.nextInt();
                anonymHinzufuegen(funstueck, fundort, datum, preis);
            } else if (input == 4) {
                listeAusgeben();
            }
        }
    }
}
