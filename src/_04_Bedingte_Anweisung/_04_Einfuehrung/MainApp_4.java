package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guten Tag!");
        System.out.println("Möchstest du gerne Briefmarken kaufen? (Ja oder Nein)");

        String antwort = scanner.nextLine();

        if (antwort.equals("Ja")) {
            System.out.println("Das macht dann 80 Cent bitte.");
        }
        else if (antwort.equals("Nein")) {
            System.out.println("Schade, vielleicht beim nächsten mal");
        }
        else {
            System.out.println("Entschuldigung! Ich habe dich leider nicht verstanden");
        }

        System.out.println("Vielen Dank und auf Wiedersehen");

    }
}
