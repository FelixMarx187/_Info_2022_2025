package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guten Tag!");
        System.out.println("Möchstest du gerne Briefmarken kaufen? (Ja oder Nein)");
        String antwort = scanner.nextLine();

        if (antwort.equals("Ja") || antwort.equals("ja")) {
            System.out.println("Prima wir haben verschiedene Briefmarken. Bitte wähle aus:");
            System.out.println("1: Postkarte für 0,60 €");
            System.out.println("2: Standard Brief bis 20g für 0,80 €");
            System.out.println("3: Kompakt Brief bis 50g für 0,95 €");
            System.out.println("4: Großer Brief bis 500g für 1,55 €");
            System.out.println("5: Maxi Brief bis 1000g für 2,70 €");
            System.out.println("6: Päckchen bis 2000g für 4,50 €");
            System.out.println("Geben sie die Nummer an welche Briefmarke sie benötigen");

            int wahl = scanner.nextInt();
            double kosten = 0.0;
            if (wahl == 1)
                kosten = 0.60;
            else if (wahl == 2)
                kosten = 0.80;
            else if (wahl == 3)
                kosten = 0.95;
            else if (wahl == 4)
                kosten = 1.55;
            else if (wahl == 5)
                kosten = 2.70;
            else if (wahl == 6)
                kosten = 4.50;

            if (kosten > 0.0)
                System.out.println("Das macht dann bitte " + kosten + " €");
            else
                System.out.println("Entschuldigung diese Option gibt es leider nicht.");
        } else if (antwort.equals("Nein") || antwort.equals("nein")) {
            System.out.println("Schade, Vielleicht beim nächsten mal.");
        } else {
            System.out.println("Entschuldigung! Ich habe dich leider nicht verstanden.");
        }

        System.out.println("Vielen Dank auf Wiedersehen");
    }
}
