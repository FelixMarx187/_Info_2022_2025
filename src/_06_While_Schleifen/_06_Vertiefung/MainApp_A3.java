package _06_While_Schleifen._06_Vertiefung;

import java.util.Scanner;

public class MainApp_A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SPIELVERWALTUNG:");
        System.out.println("Bevor du dein Spiel eintragen kannst musst du dich anmelden");

        System.out.println("Benutzername:");
        String login = scanner.nextLine();

        if (login.equals("admin") || login.equals("guest")) {
            if (login.equals("admin")) {
                System.out.println("Hallo " + login + " geben sie ihr Passwort ein:");
                String adminpw = scanner.nextLine();
                if (adminpw.equals("admin")) {
                    System.out.println("Hallo Admin, sie können nun ein neues Spiel hinzufügen!");

                    System.out.println("Geben sie den Names ihres Spiels an:");
                    String name1 = scanner.nextLine();
                    System.out.println("Geben sie ihren Namen(Entwickler) an:");
                    String entwickler1 = scanner.nextLine();

                    System.out.println("Legen sie den Preis ihres Spiels Fest(in Euro),(bitte mit Komma angeben sonst wird Fehler angezeigt)");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Fehler: Unbekannte Eingabe");
                        int preis2 = scanner.nextInt();
                    } else {
                        double preis1 = scanner.nextDouble();

                        System.out.println("Legen sie nun die FSK fest (Bsp.:\"Usk 0,6,12,16,18\")");

                        if (!scanner.hasNextInt()) {
                            System.out.println("Fehler: Unbekannte Eingabe");
                        } else {
                            int fsk1 = scanner.nextInt();
                            System.out.println("Geben sie nun die Kategorie ihres Spiels an (\" MMMORPG, Shooter, Simulator, etc. \")");
                            String kategorie1 = scanner.nextLine();
                            String kategorie = scanner.nextLine();

                            System.out.println(" ");
                            System.out.println("Zusammenfassung ihres Spiels:" + "\n" + " Name: " + name1 + ",\n " + "Entwickler:" + entwickler1 + ",\n " + "Preis: " + preis1 + "€" + ",\n " + "Fsk: " + fsk1 + ",\n " + "Spiele-Kategorie: " + kategorie);
                        }
                    }
                } else {
                    System.out.println("Fehler: Falsches Passwort");
                }
            } else if (login.equals("guest")) {
                System.out.println("Hallo " + login + " geben sie ihr Passwort ein:");
                String guestpw = scanner.nextLine();
                if (guestpw.equals("guest")) {
                    System.out.println("Hallo Sehr geehrter Gast leider werden zu diesem Zeitpunkt keine Spiele verkauft.");
                } else {
                    System.out.println("Fehler: Falsches Passwort");
                }
            }
        } else {
            System.out.println("Fehler: Unbekannter Benutzername");
        }
    }
}
