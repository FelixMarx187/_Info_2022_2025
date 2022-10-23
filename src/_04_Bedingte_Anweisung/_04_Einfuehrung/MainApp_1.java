package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guten Tag!");
        System.out.println("Möchtest du gerne Briefmarken kaufen? (Ja oder Nein)");
        String antwort = scanner.nextLine();
        System.out.println("Vielen Dank und auf Wiedersehen!");
    }
}
