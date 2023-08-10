package _12_Wdh_Klassen._12_Wdh_Klassen_Immobilien_Makler;

import java.util.Scanner;

public class Main {
    public static Immobilien[] objektListe() {
        Immobilien[] immobilienArray = new Immobilien[20];

        Immobilien immobilie1 = new Immobilien();
        immobilie1.immobilienName = "A1";
        immobilie1.standort = "Hückelhoven";
        immobilie1.kaufen = true;
        immobilie1.mieten = false;
        immobilie1.erlaubtHaustiere = false;
        immobilie1.preis = 200000;
        immobilie1.flaeche = 200;
        immobilienArray[0] = immobilie1;

        Immobilien immobilie2 = new Immobilien();
        immobilie2.immobilienName = "A2";
        immobilie2.standort = "Heinsberg";
        immobilie2.kaufen = false;
        immobilie2.mieten = true;
        immobilie2.erlaubtHaustiere = false;
        immobilie2.preis = 800;
        immobilie2.flaeche = 40;
        immobilienArray[1] = immobilie2;

        Immobilien immobilie3 = new Immobilien();
        immobilie3.immobilienName = "A3";
        immobilie3.standort = "Hückelhoven";
        immobilie3.kaufen = true;
        immobilie3.mieten = false;
        immobilie3.erlaubtHaustiere = false;
        immobilie3.preis = 200000;
        immobilie3.flaeche = 200;
        immobilienArray[2] = immobilie3;

        Immobilien immobilie4 = new Immobilien();
        immobilie4.immobilienName = "A4";
        immobilie4.standort = "Hückelhoven";
        immobilie4.kaufen = true;
        immobilie4.mieten = false;
        immobilie4.erlaubtHaustiere = false;
        immobilie4.preis = 200000;
        immobilie4.flaeche = 200;
        immobilienArray[3] = immobilie4;

        Immobilien immobilie5 = new Immobilien();
        immobilie5.immobilienName = "A5";
        immobilie5.standort = "Hückelhoven";
        immobilie5.kaufen = true;
        immobilie5.mieten = false;
        immobilie5.erlaubtHaustiere = false;
        immobilie5.preis = 200000;
        immobilie5.flaeche = 200;
        immobilienArray[4] = immobilie5;

        return immobilienArray;
    }
    public static void listeAusgeben(Immobilien[] immobilienArray) {
        for (int i2 = 0; i2 < immobilienArray.length; i2++) {
            Immobilien i = immobilienArray[i2];
            if (i != null) {
                System.out.println("Name: " + i.immobilienName + "\n" + "Standort: " + i.standort + "\n" + "Kaufen: " + i.kaufen + "\n" + "Mieten: " + i.mieten + "\n" + "Haustiere elaubt: " + i.erlaubtHaustiere
                        + "\n" + "Preis: " + i.preis + " €" + "\n" + "Fläche: " + i.flaeche + " m²");
                System.out.println("-------------------------------------------");
            }
        }
    }
    public static int immobilienCounter(Immobilien[] immobilienArray) {
        int counter = 0;
        for (int i = 0; i < immobilienArray.length; i++) {
            Immobilien i2 = immobilienArray[i];
            if (i2 != null) {
                counter++;
            }
        }
        return counter;
    }
    public static int freieSpeicherplaetze(Immobilien[] immobilienArray) {
        int counter = 0;
        for (int i = 0; i < immobilienArray.length; i++) {
            Immobilien i2 = immobilienArray[i];
            if (i2 == null) {
                counter++;
            }
        }
        return  counter;
    }
    public static void detailAnfrage(Immobilien[] immobilienArray, int nummer) {
        if (nummer <= 4) {
            Immobilien i = immobilienArray[nummer];
            int nummerplus = nummer+1;
            System.out.println("Hier Immobielie Nummer: " + nummerplus);
            System.out.println("Name: " + i.immobilienName + "\n" + "Standort: " + i.standort + "\n" + "Kaufen: " + i.kaufen + "\n" + "Mieten: " + i.mieten + "\n" + "Haustiere elaubt: " + i.erlaubtHaustiere + "\n" + "Preis: " + i.preis + " €" + "\n" + "Fläche: " + i.flaeche + " m²");
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("[Error] Nummer ist nicht bekannt");
        }
    }
    public static Immobilien[] objektLoeschen(Immobilien[] immobilienArray, int pNummer){
        immobilienArray[pNummer] = null;
        return immobilienArray;
    }
    public static void aktuallisierteList(Immobilien[] immobilienArray) {
        for (int i2 = 0; i2 < immobilienArray.length; i2++) {
            Immobilien i = immobilienArray[i2];
            if (i != null) {
                System.out.println("Name: " + i.immobilienName + "\n" + "Standort: " + i.standort + "\n" + "Kaufen: " + i.kaufen + "\n" + "Mieten: " + i.mieten + "\n" + "Haustiere elaubt: " + i.erlaubtHaustiere
                        + "\n" + "Preis: " + i.preis + " €" + "\n" + "Fläche: " + i.flaeche + " m²");
                System.out.println("-------------------------------------------");
            }
        }
    }
    public static Immobilien[] immobilienHinzufuegen(Immobilien[] immobilienArray, String name, String standort, boolean kaufen, boolean mieten, boolean haustiereErlaubt, int preis, double flaeche){
        for (int i = 0; i < immobilienArray.length; i++) {
            Immobilien i2 = immobilienArray[i];
            if (i2 == null){
                Immobilien immobilieCustom = new Immobilien();
                immobilieCustom.immobilienName = name;
                immobilieCustom.standort = standort;
                immobilieCustom.kaufen = kaufen;
                immobilieCustom.mieten = mieten;
                immobilieCustom.erlaubtHaustiere = haustiereErlaubt;
                immobilieCustom.preis = preis;
                immobilieCustom.flaeche = flaeche;
                immobilienArray[i] = immobilieCustom;
                break;
            }
        }
        return immobilienArray;
    }
    public static void immobilienHinzugefuegtAktuallisiert(Immobilien[] immobilienArray) {
        for (int i2 = 0; i2 < immobilienArray.length; i2++) {
            Immobilien i = immobilienArray[i2];
            if (i != null) {
                System.out.println("Name: " + i.immobilienName + "\n" + "Standort: " + i.standort + "\n" + "Kaufen: " + i.kaufen + "\n" + "Mieten: " + i.mieten + "\n" + "Haustiere elaubt: " + i.erlaubtHaustiere
                        + "\n" + "Preis: " + i.preis + " €" + "\n" + "Fläche: " + i.flaeche + " m²");
                System.out.println("-------------------------------------------");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Alle Immobilien: " + immobilienCounter(objektListe()));
        listeAusgeben(objektListe());

        System.out.print("Geben sie eine Nummer an für welche Immobilie sie sich Interresieren: ");
        int nummer = new Scanner(System.in).nextInt()-1;
        detailAnfrage(objektListe(),nummer);

        System.out.print("Geben sie eine Nummer um eine Immobilie zu Löschen: ");
        int nummer2 = new Scanner(System.in).nextInt()-1;
        aktuallisierteList(objektLoeschen(objektListe(),nummer2));

        System.out.println("Freie Speicherplätze: ");
        System.out.println(freieSpeicherplaetze(objektLoeschen(objektListe(),nummer2)));

        System.out.print("Name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Standort: ");
        String standort = new Scanner(System.in).nextLine();
        System.out.print("soll es verkauft werden: ");
        boolean kaufen = new Scanner(System.in).nextBoolean();
        System.out.print("Soll es vermietet werden: ");
        boolean mieten = new Scanner(System.in).nextBoolean();
        System.out.print("Sind Haustiere erlaubt: ");
        boolean haustiereErlaubt = new Scanner(System.in).nextBoolean();
        System.out.print("Preis: ");
        int preis = new Scanner(System.in).nextInt();
        System.out.print("Fläche: ");
        int flaeche = new Scanner(System.in).nextInt();
        System.out.println("-------------------------------------------");
        immobilienHinzugefuegtAktuallisiert(immobilienHinzufuegen(objektLoeschen(objektListe(),nummer2),name,standort,kaufen,mieten,haustiereErlaubt,preis,flaeche));
    }
}