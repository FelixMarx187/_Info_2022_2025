package _08_Mehrdimensionale_Arrays._08_Vertiefung;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Wetterdaten 2021");
        System.out.println("-------------------------------");
        System.out.println("Monat:");
        int monat = scanner.nextInt();


        if (monat == monat) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int parameter = scanner.nextInt();
            if (parameter == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[monat - 1][0]);
            } else if (parameter == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[monat - 1][1]);
            } else if (parameter == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[monat - 1][2]);
            } else if (parameter == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[monat - 1][3]);
            } else if (parameter == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[monat -1][4]);
            }
        }
    }
}
