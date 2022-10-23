package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guten Tag!");
        System.out.println("Möchtest du gerne Briefmarken kaufen? (Ja oder Nein)");
        String antwort = scanner.nextLine();

        if (antwort.equals("Ja") || antwort.equals("ja")) {
            System.out.println("Das macht dann 80 Cent, bitte.");
        }
        else if (antwort.equals("Nein") || antwort.equals("nein")) {
            System.out.println("Schade, vielleicht beim nächsten mal");
        }
        else {
            System.out.println("Entschuldigung! Ich hab dich leider nicht verstanden.");
        }
        System.out.println("Vielen Dank und auf Wiedersehen!");
    }
}
