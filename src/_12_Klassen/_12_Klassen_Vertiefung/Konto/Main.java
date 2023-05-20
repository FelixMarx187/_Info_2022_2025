package _12_Klassen._12_Klassen_Vertiefung.Konto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Neues Konto erstellen? (Ja[1] / Nein[2])");
        int input = new Scanner(System.in).nextInt();

        if (input == 1) {
            System.out.println("Name: ");
            String pInhaber = new Scanner(System.in).nextLine();
            System.out.println("Kontostand: ");
            int kontostand = new Scanner(System.in).nextInt();
            Konto konto = new Konto(pInhaber,kontostand);

            System.out.println("------------------------------------");
            System.out.println("Inhaber: " + konto.inhaber);
            System.out.println("Kontonummer: " + konto.kontoNummer);
            System.out.println("Kontostand: " + konto.kontoStand + " €");
        }
    }
}
