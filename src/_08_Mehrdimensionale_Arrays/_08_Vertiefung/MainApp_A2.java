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

        if (monat == 1) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[0][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[0][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[0][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[0][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[0][4]);
            }
        }
        if (monat == 2) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[1][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[1][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[1][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[1][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[1][4]);
            }
        }
        if (monat == 3) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[2][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[2][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[2][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[2][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[2][4]);
            }
        }
        if (monat == 4) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[3][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[3][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[3][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[3][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[3][4]);
            }
        }
        if (monat == 5) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[4][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[4][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[4][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[4][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[4][4]);
            }
        }
        if (monat == 6) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[5][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[5][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[5][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[5][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[5][4]);
            }
        }
        if (monat == 7) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[6][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[6][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[6][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[6][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[6][4]);
            }
        }
        if (monat == 8) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[7][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[7][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[7][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[7][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[7][4]);
            }
        }
        if (monat == 9) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[8][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[8][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[8][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[8][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[8][4]);
            }
        }
        if (monat == 10) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[9][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[9][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[9][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[9][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[9][4]);
            }
        }
        if (monat == 11) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[10][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[10][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[10][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[10][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[10][4]);
            }
        }
        if (monat == 12) {
            System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
            int januar = scanner.nextInt();
            if (januar == 0) {
                System.out.println("Mittlere Temp. [C°]: " + wetter[11][0]);
            } else if (januar == 1) {
                System.out.println("Minimum Temp. [C°]. " + wetter[11][1]);
            } else if (januar == 2) {
                System.out.println("Maximum Temp. [C°]: " + wetter[11][2]);
            } else if (januar == 3) {
                System.out.println("Niederschlag [l/m²]: " + wetter[11][3]);
            } else if (januar == 4) {
                System.out.println("Regenreichster Tag [l/m²]: " +wetter[11][4]);
            }
        }
    }
}
