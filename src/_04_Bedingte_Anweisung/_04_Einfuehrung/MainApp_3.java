package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guten Tag!");
        System.out.println("Möchstest du gerne Briefmarken kaufen? (Ja oder Nein)");

        String antwort = scanner.nextLine();

        if (antwort.equals("Ja")) {
            System.out.println("Das macht dan bitte 80 cent.");
        }
        System.out.println("Vielen Dank und auf Wiedersehen!");
    }
}
