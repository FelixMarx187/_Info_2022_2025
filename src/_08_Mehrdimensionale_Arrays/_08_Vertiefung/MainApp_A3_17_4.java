package _08_Mehrdimensionale_Arrays._08_Vertiefung;


import java.util.Random;
import java.util.Scanner;

public class MainApp_A3_17_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /*
        Der Benutzer zieht eine zufällige Karte aus dem Deck.
        Der Wert der Karte wird dem Benutzer als Punkte gutgeschrieben.
        Der Benutzer kann jetzt nacheinander so lange eine weitere zufällige Karte aus dem Deck ziehen, bis er…
        21 Punkte und damit gewonnen hat.
        mehr als 21 Punkte und damit verloren hat.
        entscheidet, dass er aufhört.
        Der Benutzer kann dieses Spiel natürlich beliebig oft wiederholen.
         */

        double[][] wetter = {
                {3.1, -2.3, 12.2, 100.4, 34.3}, //01
                {5, -10.6, 20.2, 53.6, 17.4}, //02
                {6.8, -4.2, 25.2, 55.5, 13.1}, //03
                {6.9, -1.6, 20.3, 32.3, 16.9}, //04
                {11.9, 0.1, 27.7, 63.1, 9.9}, //05
                {19.4, 8, 33.7, 86.3, 15.5}, //06
                {18.3, 10.5, 27.1, 170.7, 80.5}, //07
                {17.1, 8.7, 28.4, 84.2, 16.3}, //08
                {16.3, 6, 27.1, 13.4, 4.5}, //09
                {11.5, 1.1, 19.9, 48.4, 8}, //10
                {6.2, -2.9, 13.6, 22.3, 5.5}, //11
                {5.6, -5, 15.1, 71.3, 23.2} //12
        };

        boolean run = true;

        while (run) {
            System.out.println("17 + 4");
            System.out.println("----------------------");
            System.out.println("Hit [1] | Stand [2]");

            int counter = 0;
            double max;
            double maxinput;
            while (counter < 1000) {
                System.out.println("---------------------");
                System.out.println("Bitte Zahl eingeben:");
                int input = scanner.nextInt();

                if (input == 1) {
                    int idx1 = random.nextInt(0,12);
                    int idx2 = random.nextInt(0,5);

                    System.out.println("---------------------");
                    System.out.println("Deine Zahl [" + wetter[idx1][idx2] + "]");
                    System.out.println("---------------------");
                    max = 0;
                    double ergebnis = wetter[idx1][idx2] + max;
                    System.out.println("Gesamt Ergebnis: " );

                }

            }
        }
    }
}
