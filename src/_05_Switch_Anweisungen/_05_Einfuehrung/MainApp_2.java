package _05_Switch_Anweisungen._05_Einfuehrung;

import java.util.Scanner;

public class MainApp_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Herzlich Willkommen bei der Bonusberechnung!");

        System.out.println("Für welches Level soll der Bonus berechnet werden[1-5] ?");
        int level = 0;
        if (in.hasNextInt()) {
            level = in.nextInt();
            in.nextLine();
        }

        int bonus = 0;
        switch (level) {
            case 5:
                bonus = 1000;
                break;
            case 4:
                bonus = 600;
                break;
            case 3:
                bonus = 250;
                break;
            case 2:
                bonus = 100;
                break;
            case 1:
                bonus = 20;
                break;
        }

        System.out.println("Dein Bonus ist: " + bonus);
    }
}
