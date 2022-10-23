package _05_Switch_Anweisungen._05_Vertiefung;

import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String monate = "";
        int year = 0;


        System.out.println("Um auszurechnen wie viel Tage ein Monat hast musst du nun Monat und Jahr angeben!");
        System.out.println("Monat: ");
        if (scanner.hasNextLine()) {
            monate = scanner.nextLine().toLowerCase();
        }
        System.out.println("Jahr");
        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
        } else if (!scanner.hasNextInt()) {
            System.out.println("Bruda das nix jahr");
        }

        int tage = 0;
        switch (monate) {
            case "januar":
            case "oktober":
            case "august":
            case "juli":
            case "märz":
            case  "mai":
            case "dezember":
                tage = 31;
                break;
            case "februar":
                if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
                    tage = 29;
                } else {
                    tage = 28;
                }
                break;
            case "april":
            case "november":
            case "september":
            case "juni":
                tage = 30;
                break;
            default:
                System.out.println("Das nix Monat");
        }

        System.out.println("Der Monat hat " + tage + " " + "Tage");
    }
}
