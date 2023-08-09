package _12_Klassen._12_Klassen_Vertiefung.Konto_und_Kontoverwaltung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------------------- Konto --------------------");
            System.out.println("Login[1] / Registrierung[2]");
            if (!scanner.hasNextInt()) {
                System.out.println("Fehler: Falscher Eingabe Typ ");
            }
            int input1 = scanner.nextInt();
            if (input1 == 1) {
                loginUser();
            } else if (input1 == 2) {
                registerUser();
            } else {
                System.out.println("Fehler: Unbekannte Eingabe");
            }
            //Devoloper Settings
            if (input1 == 167642) {
                developerSettings();
            }
        }
    }
    public static void loginUser() {
        Scanner scanner = new Scanner(System.in);
        Konto konto = new Konto();
        System.out.println("Name: ");
        String input = scanner.nextLine();
        if (input == konto.getInhaber()) {
            System.out.print("Kontonummer: ");
            int input2 = new Scanner(System.in).nextInt();
            if (input2 == konto.getKontoNummer()) {
                System.out.print("Einzahlen: ");
                int inputEinzahlen = new Scanner(System.in).nextInt();

            }
        }
    }

    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String pInhaber = scanner.nextLine();
        int pInput = new Scanner(System.in).nextInt();
        Konto konto = new Konto();
        konto.setInhaber(pInhaber);
        konto.setKontoStand(pInput);
        konto.setKontoNummer();
        System.out.println("-------------------- --------------------");
        System.out.println("Name: " + konto.getInhaber());
        System.out.println("Kontonummer: " + konto.getKontoNummer());
        System.out.println("Kontostand: " + konto.getKontoStand() + "€");


    }

    public static void developerSettings() {
        System.out.println("-------------------- Devoloper Settings --------------------");
        System.out.println("- Programm beenden (1)");
        System.out.println("-------------------- --------------------");
        int input2 = new Scanner(System.in).nextInt();
        if (input2 == 1) {
            System.out.println("Programm wird herunter gefahren. Aufwiedersehen!!");
            System.exit(5);
        }
    }
}