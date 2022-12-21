package _07_Arrays;

import java.util.Scanner;

public class MainApp_4_Freiwillig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Begrüßung
        System.out.println("Willkommen auf Battle.net, ");
        System.out.println("Lieber User loggen sie sich bitte vor Regestrierung eines Neuen Spiels ein!!");

        System.out.println("-----------------------------------------------------------------------------------");

        //Login
        System.out.println("Benutzername: ");
        String login = scanner.nextLine();

        //Passwort
        System.out.println("Passwort:");
        String passwort = scanner.nextLine();

        //Login "admin"
        if (login.equals("admin") && login.equals("admin")) {

            // Divider
            System.out.println("-----------------------------------------------------------------------------------");

            //Begrüßung "admin"
            System.out.println("Hallo, " + login + ", Wollen sie mit der Spiele Regestrierung fortfahren (J/N)");
            String adminregest = scanner.nextLine();
            if (adminregest.toLowerCase().equals("j")) {

                //Divider
                System.out.println("-----------------------------------------------------------------------------------");

                //Name
                System.out.println("Name des Spiels:");
                String name = scanner.nextLine();

                //Entwickler
                System.out.println("Entwickler:");
                String entwickler = scanner.nextLine();
            }

        }

    }
}
