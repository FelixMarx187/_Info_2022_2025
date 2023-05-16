package _12_Klassen._12_Klassen_Vertiefung.Brüche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zähler: ");
        int zaehler = scanner.nextInt();
        System.out.println("Nenner: ");
        int nenner = scanner.nextInt();
        System.out.println("Erweitern: ");
        int faktor = scanner.nextInt();
        Bruch bruch = new Bruch();
        System.out.println("Ergebnis: " + bruch.berechnen(zaehler, nenner));
        System.out.println("Bruch als String: " + bruch.getString(zaehler,nenner));
        System.out.println("Erweitern: " + bruch.erweitern(faktor,zaehler,nenner));
        System.out.println("Gekürzt: " + bruch.gekuerzt(faktor,zaehler,nenner));

    }
}
