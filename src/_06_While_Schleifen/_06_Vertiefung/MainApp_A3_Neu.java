package _06_While_Schleifen._06_Vertiefung;

import java.util.Scanner;

public class MainApp_A3_Neu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Spieleverwaltung:");
        System.out.println("---------------------------------");

        System.out.println("Benutzername: ");
        String login = scanner.nextLine();

        if (login.equals("admin")) {

            System.out.println("Passwort:");
            String pw = scanner.nextLine();

            if (pw.equals("admin")) {

                System.out.println("Name:");
                String name = scanner.nextLine();

                System.out.println("Entwickler:");
                String entwickler = scanner.nextLine();

                int counter1 = 0;

                System.out.println("Preis:");
                double preis = scanner.nextDouble();
            }
        }
    }
}
