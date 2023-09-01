package _15_Sichtbarkeit._15_Sichtbarkeit_Lebensmittel_Nährwerte;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Lebensmittel lebensmittel = new Lebensmittel();
            System.out.println("Lebensmittel Erzeugen [1] / Lebensmittel Liste Ausgeben [2]");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                lebensmittel.lebensmittelsErzeugen();
            } else if (input == 2) {
                lebensmittel.lebensmittelAusgeben();
            }
        }
    }
}
