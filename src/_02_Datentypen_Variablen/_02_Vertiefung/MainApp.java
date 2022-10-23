package _02_Datentypen_Variablen._02_Vertiefung;

public class MainApp {
    public static void main(String[] args) {

        // Nr.1
        int alter = 17;
        String zahl = "17";
        double sparschwein = 193.80;
        int anzahl = 7;
        double pi = 3.14159; //Fehler ","
        String warnung = "Achtung! Ein Sturm kommt.";
        String frage = "Wie heißt du?";
        char anfangsBuchstabe = 'B';
        double summe = (double) anzahl * sparschwein;
        String endBuchstabe = "L";
        String abc = "ABC"; //Fehler "''"

        //Nr.2
        String word1 = "Brautkleid ";
        String word2 = "bleibt ";
        String word3 = "und ";
        String word4 = "Blaukraut ";
        System.out.println(word1 + word2 + word1 + word3 + word4 + word2 + word4);

        //Nr.3
        int zahl1 = 9; //Dem Integer "zahl2" wird die Zahl 9 zugewiesen.
        int zahl2 = 6; //Dem Integer "zahl2" wird die Zahl 6 zugewiesen.
        System.out.println(zahl1 + " + " + zahl2 + " = " + zahl1 + zahl2);
        //Variablen werden eingesetzt und die vorhandenen Strings dazwischen werden per arithemtischen Operator " + " verbunden/ausgerechnet.

        //Nr.4
        // 21 * 3 + 17 * 4
        int variable1 = 21 * 3;
        int variable2 = 17 * 4;
        System.out.println(variable1 + variable2);

        int variable3 = 21;
        int variable4 = 3;
        int variable5 = 17;
        int variable6 = 4;
        System.out.println(variable3 * variable4 + variable5 * variable6);


        //Nr.5
        int jahre = 20;
        int monate = 3;
        int tage = 7;
        int stunden = 18;
        int minuten = 5;

        System.out.println("Frau Pedant ist " + (jahre * 12 + monate) + " Monate alt.");
        System.out.println("Frau Pedant ist " + (jahre * 365 + 3 * 30 + tage) + " Tage alt.");


        //Nr.6
        int tage_2 = 7993 / 1440;
        int stunden_2 = 7993 % 1440 / 60;
        int minuten_2 = 7993 % 1440 % 60;

        System.out.println(tage_2 + ":" + stunden_2 + ":" + minuten_2);


        //Nr.7
        // Mein erstes Java Program!
        //     public static void start(String[] args) {
        //          print("Hallo Leute! Das ist mein erstes Java Programm!") - syntaktischer Fehler
        //          int stunden am tag = 24;                                 - syntaktischer Fehler
        //          minuten =60;                                             - semantischer Fehler
        //          print("Ein Tag hat" + 24 * 60  + minuten)                - syntaktischer Fehler


        System.out.println("Hallo Leute! Das ist mein erstes Java Programm!");
        int stunden_3 = 24;
        int minuten_3 = 60;
        System.out.println("Ein Tag hat " + stunden_3 * minuten_3  + " minuten");
    }
}
