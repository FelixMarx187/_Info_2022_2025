package _03_Benutzereingabe._03_Einfuehrung;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo! Wie heißt du?");
        String name = scanner.nextLine();
        System.out.println("Herzlich willkommen " + name + "!");

        System.out.println("Hallo! Wie alt bist du?");
        int alter = scanner.nextInt();
        System.out.println("Du bist also " + alter + " Jahre alt.");

        System.out.print("Wie groß bist du?");
        double groesse = scanner.nextDouble();
        System.out.println("Hast du auch nicht geschummelt? Du bist also " + groesse + "m groß...");

        double faktor = alter / groesse;
        System.out.println("Wusstest du, dass du " + faktor + " mal so groß wie alt bist?");

        int ifaktor = (int) faktor;
        System.out.println("Das entspricht ungefähr dem Faktor " + ifaktor);

        String message = "Ich fasse mal zusammen! ";
        message += name;
        message += " aus Hückelhoven ";
        message += " ist ";
        message += alter;
        message += " Jahre alt und ";
        message += groesse;
        message += "m groß.";
        System.out.println(message);
    }
}
