package _05_Switch_Anweisungen._05_Einfuehrung;

import java.util.Scanner;

public class MainApp_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Herzlich Willkommen bei der Bonusberechnung!");

        System.out.println("Für welches Level soll der Bonus berechnet werden [1-5]? ");
        int level = 0;
        if (in.hasNextInt()) {
            level = in.nextInt();
            in.nextLine();
        }

        int bonus = 0;
        if (level == 5) {
            bonus = 1000;
        } else if (level == 4) {
            bonus = 600;
        } else if (level == 3) {
            bonus = 250;
        } else if (level == 2) {
            bonus = 100;
        } else if (level == 1) {
            bonus = 20;
        }

        System.out.println("Dein Bonus ist: " + bonus);
    }
}
