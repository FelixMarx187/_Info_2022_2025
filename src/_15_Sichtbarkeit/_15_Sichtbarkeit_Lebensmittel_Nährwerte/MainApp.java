package _15_Sichtbarkeit._15_Sichtbarkeit_Lebensmittel_Nährwerte;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Lebensmittel[] lebensmittelArray = new Lebensmittel[1000];
        Naehrwert naehrwert = new Naehrwert();
        boolean run = true;
        while (run) {
            System.out.println("Lebensmittel erzeugen [1] / Lebensmittel Liste [2]");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                // Name
                System.out.println("Name:");
                String name = new Scanner(System.in).nextLine();

                // Kilokalorien
                System.out.println("Kilokalorien:");
                int kalorien = new Scanner(System.in).nextInt();

                // Fett
                System.out.println("Fett:");
                double fett = new Scanner(System.in).nextDouble();

                // Kohlenhydrate
                System.out.println("Kohlenhydrate:");
                double kohlenhydrate = new Scanner(System.in).nextDouble();

                // Eiweiss
                System.out.println("Eiweiss:");
                int eiweiss = new Scanner(System.in).nextInt();

                // ist Gesund
                System.out.println("ist Gesund:");
                boolean istGesund = new Scanner(System.in).nextBoolean();

                Lebensmittel lebensmittel = new Lebensmittel(lebensmittelArray, naehrwert, name,istGesund,kalorien,fett,kohlenhydrate,eiweiss);
                for (int i = 0; i < lebensmittelArray.length; i++) {
                    if (lebensmittelArray[i] != null) {
                    }
                }
            } else if (input == 2) {

            }
        }
    }
}