package _01_Arbeit;

import java.util.Scanner;

public class BankKonto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("----------| Bankkonto |----------");
            System.out.println("---------| Kontonummer |---------");
            String kontonummer = scanner.nextLine();
            System.out.println("-----------| Passwort |----------");
            int kontopasswort = scanner.nextInt();
            if (kontonummer.equals("DE1234567890") && kontopasswort == 1234) {
                input();
                break;
            } else {
                System.out.println("Fehler: Unbekannter Benutzer");
            }
        }
    }

    public static void input() {
        System.out.println("----------| Bankkonto |----------");
        System.out.println("--------| Einzahlen(1) |---------");
        System.out.println("--------| Auszahlen(2) |---------");
        System.out.println("---------| Abfrage(3) |----------");
        System.out.println("---------------||----------------");
        System.out.println("-----------| Eingabe |-----------");
        int input = new Scanner(System.in).nextInt();
        if (input == 1) {
            kontoEinzahlen();
        } else if (input == 2) {
            kontoAuszahlen();
        } else if (input == 3) {
            kontoabfrage();
        }
    }

    public static void kontoabfrage() {

    }

    public static void kontoEinzahlen() {

    }

    public static void kontoAuszahlen() {

    }
}
