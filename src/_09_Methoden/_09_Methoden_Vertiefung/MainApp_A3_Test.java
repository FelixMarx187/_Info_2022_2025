package _09_Methoden._09_Methoden_Vertiefung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_A3_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        String[] bilder = {"7", "8", "9", "10", "Bauer", "Dame", "König", "As"};
        boolean run = true;
        while (run) {
            int tmp = 0;
            boolean runin = true;
            while (runin) {
                System.out.println("------------------------------------");
                System.out.println("17 + 4");
                System.out.println("------------------------------------");
                System.out.println("Ziehen [1] | Stopp! [2]");
                int antwort = scanner.nextInt();
                if (antwort == 1) {
                    int farbrand = random.nextInt(0, 4);
                    int bilderrand = random.nextInt(0, 8);
                    System.out.println("Zahl: " + farben[farbrand] + " " + bilder[bilderrand]);
                    int value;
                    if (bilder[bilderrand].equals("Bauer") || bilder[bilderrand].equals("Dame") || bilder[bilderrand].equals("König")) {
                        value = 10;
                    } else if (bilder[bilderrand].equals("As")) {
                        value = 11;
                    } else {
                        value = Integer.parseInt(bilder[bilderrand]);
                    }
                    tmp += value;
                    System.out.println("Gesamt Wert: " + tmp);
                    System.out.println("------------------------------------");
                    if (tmp > 21) {
                        System.out.println("Du hast Verloren!");
                        break;
                    } else if (tmp == 21) {
                        System.out.println("Du hast Gewonnen! WOW");
                        break;
                    }
                } else {
                    break;
                }
            }
            System.out.println("Willst du noch mal Spielen?");
            System.out.println("------------------------------------");
            System.out.println("Ja [1] | Nein [2]");
            int end = scanner.nextInt();
            if (end == 1) {
                run = true;
            } else if (end == 2) {
                run = false;
            }
        }
    }

}
