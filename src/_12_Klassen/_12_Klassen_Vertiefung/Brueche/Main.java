package _12_Klassen._12_Klassen_Vertiefung.Brueche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zähler: ");
        int input = scanner.nextInt();
        System.out.println("Nenner: ");
        int input2 = scanner.nextInt();
        System.out.println("Erweitern: ");
        int input3 = scanner.nextInt();
        System.out.println("Zähler2: ");
        int input4 = scanner.nextInt();
        System.out.println("Nenner2: ");
        int input5 = scanner.nextInt();
        Bruch bruch = new Bruch(input, input2, input3,input4,input5);
        System.out.println("Ergebnis: " + bruch.berechnen());
        System.out.println("Bruch als String: " + bruch.getString());
        System.out.println("Erweitern: " + bruch.erweitern());
        System.out.println("Kürzen: " + bruch.kuerzen());
        System.out.println("Addieren: " + bruch.addieren());
        System.out.println("Multiplizieren: " + bruch.multiplizieren());
    }
}
