package _12_Klassen._12_Klassen_Vertiefung.Konto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        while (true) {
            System.out.println("Haben sie schon ein Konto? (Ja[1] / Nein[2])");
            int input = new Scanner(System.in).nextInt();

            if (input == 2) {
                System.out.println("Konto Registrierung");
                System.out.println("Name: ");
                String pInhaber = new Scanner(System.in).nextLine();
                System.out.println("Kontostand: ");
                int kontostand = new Scanner(System.in).nextInt();
                Konto konto = new Konto(pInhaber,kontostand);

                System.out.println("------------------------------------");
                System.out.println("Inhaber: " + konto.getInhaber());
                System.out.println("Kontonummer: " + konto.getKontoNummer());
                System.out.println("Kontostand: " + konto.getKontoStand() + " €");
                int counter = 0;
            }
        }
    }
}
