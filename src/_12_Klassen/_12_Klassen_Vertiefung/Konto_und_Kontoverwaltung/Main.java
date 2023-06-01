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

    }

    public static void registerUser() {

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
