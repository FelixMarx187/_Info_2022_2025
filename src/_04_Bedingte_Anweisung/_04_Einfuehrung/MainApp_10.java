package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_10 {
    public class mainApp10 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Guten Tag!");
            System.out.println("Möchtest du gerne Briefmarken kaufen? (Ja oder Nein)");
            String antwort = scanner.nextLine();

            if (antwort.equals("Ja") || antwort.equals("ja")) {
                System.out.println("Prima. Wir haben verschiedene Briefmarken. Bitte wähle eine aus:");
                System.out.println("1: Postkarte für 0,60 €");
                System.out.println("2: Standard Brief bis 20g für 0,80 €");
                System.out.println("3: Kompakt Brief bis 50g für 0,95 €");
                System.out.println("4: Großer Brief bis 500g für 1,55 €");
                System.out.println("5: Maxi Brief bis 1000g für 2,70 €");
                System.out.println("6: Päckchen bis 2000g für 4,50 €");

                if (!scanner.hasNextInt()) {
                    System.out.println("Entschuldigung, ich habe eine Zahl erwartet.");
                } else {
                    int wahl = scanner.nextInt();
                    if ((wahl <= 0) || (wahl >= 7)) {
                        System.out.println("Entschuldigung, diese Option gibt es leider nicht.");
                    } else {
                        double kosten = 0.0;
                        if (wahl == 1)
                            kosten = 0.6;
                        else if (wahl == 2)
                            kosten = 0.8;
                        else if (wahl == 3)
                            kosten = 0.95;
                        else if (wahl == 4)
                            kosten = 1.55;
                        else if (wahl == 5)
                            kosten = 2.70;
                        else if (wahl == 6)
                            kosten = 4.5;

                        System.out.println("Das macht dann " + kosten + "€");
                    }
                }
            } else if (antwort.equals("Nein") || antwort.equals("nein")) {
                System.out.println("Schade, vielleicht beim nächsten Mal.");
            } else {
                System.out.println("Entschuldigung! Ich habe dich leider nicht verstanden.");
                System.out.println("Vielleicht hast du Lust auf ein kleines Ratespiel?");
                System.out.println("Ich habe mir einen Buchstaben ausgedacht. Welcher könnte es sein?");

                String buchstabe = "P";
                String geratenerBuchstabe = scanner.nextLine();

                int vergleich = buchstabe.compareTo(geratenerBuchstabe);
                if (vergleich == 0) {
                    System.out.println("Super! P wie Post, genau! Wie bist du da nur drauf gekommen?");
                } else if (vergleich < 0) {
                    System.out.println("Leider nein. Dein Buchstabe steht im Alphabet weiter hinten als meiner!");
                } else {
                    System.out.println("Leider nein. Dein Buchstabe steht im Alphabet weiter vorne als meiner!");
                }
            }

        }
    }
}