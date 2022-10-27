package _01_Arbeit;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MainApp_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Level Berechnen || WORLD OF WARCRAFT");
        System.out.println("-------------------------------------");
        System.out.println("Benutzername:");

        String login = scanner.nextLine();

        int bonus = 0;
        if (login.equals("warcraftfan")) {
            System.out.println("Passwort:");

            String pw1 = scanner.nextLine();
            if (pw1.equals("wow")) {
                System.out.println("Fuer welches Level willst du den Bonus berechnen:");
                int level = scanner.nextInt();

                bonus = 0;

                switch (level) {
                    case 5:
                        bonus += 500;
                    case 4:
                        bonus += 350;
                    case 3:
                        bonus += 250;
                    case 2:
                        bonus += 150;
                    case 1:
                        bonus += 100;
                }
            } else {
                System.out.println("Fehler: Falsches Passwort");
            }
        } else {
            System.out.println("Fehler: Unbekannter Benutzername");
        }

        System.out.println("Dein Bonus ist: " + bonus);
    }
}
