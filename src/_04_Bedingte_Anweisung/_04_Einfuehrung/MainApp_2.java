package _04_Bedingte_Anweisung._04_Einfuehrung;

import java.util.Scanner;

public class MainApp_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guten Tag!");
        System.out.println("Möchstest du gerne Briefmarken kaufen");
        String antwort = scanner.nextLine();

        boolean antwortja = antwort.equals("Ja");
        System.out.println("Die Aussage, dass du Ja eingegeben hast, ist:" + antwortja);

        System.out.println("Vielen Dank auf Wiedersehen");
    }
}
