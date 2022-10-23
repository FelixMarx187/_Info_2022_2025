package _05_Switch_Anweisungen._05_Einfuehrung;

import java.util.Scanner;

public class MainApp_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Herzlich willkommen bei der Bonusberechnung!");

        System.out.println("Für welches Level soll der Bonus berechnet werden [1-5]? ");
        int level = 0;
        if (in.hasNextInt()) {
            level = in.nextInt();
            in.nextLine();  // ignore line break
        }

        int bonus = 0;
        switch (level) {
            case 5:
                bonus += 400;
            case 4:
                bonus += 350;
            case 3:
                bonus += 150;
            case 2:
                bonus += 80;
            case 1:
                bonus += 20;
                break;    // Achtung! Um nicht immer den default-Fall auszuführen, brauchen wir hier ein break
            default:
                System.out.println("Das Level gibt's gar nicht!");
        }

        System.out.println("Dein Bonus ist: " + bonus);
    }
}
