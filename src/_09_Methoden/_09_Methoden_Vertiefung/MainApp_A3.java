package _09_Methoden._09_Methoden_Vertiefung;


import java.util.Random;
import java.util.Scanner;

public class MainApp_A3 {
    public static String getRandomValueFromArray(String[] array, Random random) {
        return array[random.nextInt(array.length)];
    }

    public static int value() {
        int value = 0;
        String[] bilder = {"7", "8", "9", "10", "Bauer", "Dame", "König", "Ass"};
        Random random = new Random();
        if (getRandomValueFromArray(bilder, random).equals("Bauer") || getRandomValueFromArray(bilder, random).equals("Dame") || getRandomValueFromArray(bilder, random).equals("König") || getRandomValueFromArray(bilder, random).equals("10")) {
            value = 10;
        } else if (getRandomValueFromArray(bilder, random).equals("Ass")) {
            value = 11;
        } else if (getRandomValueFromArray(bilder, random).equals("7")) {
            value = 7;
        } else if (getRandomValueFromArray(bilder, random).equals("8")) {
            value = 8;
        } else if (getRandomValueFromArray(bilder, random).equals("9")) {
            value = 9;
        }
        return value;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        Random random = new Random();
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
                int valuemain = value();
                if (antwort == 1) {
                    System.out.println("Zahl: " + getRandomValueFromArray(farben,random) + " " + valuemain);
                    tmp += valuemain;
                    System.out.println("Gesamt Wert: " + tmp);
                    System.out.println("------------------------------------");
                    if (tmp > 21) {
                        System.out.println("Du hast Verloren!");
                        break;
                    } else if (tmp == 21) {
                        System.out.println("Du hast Gewonnen! WOW");
                        break;
                    }
                } else if (antwort == 2){
                    if (tmp < 21) {
                        System.out.println("Du hast Gewonnen! WOW");
                    }
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

