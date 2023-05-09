package _08_Mehrdimensionale_Arrays._08_Vertiefung;
import java.util.Arrays;
import java.util.Scanner;
public class MainApp_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] wetter2020 = {
                {5.7, -4, 14, 31.5, 5.4},
                {7.1, -1.3, 17.6, 130, 18.3},
                {7.2, -5.4, 17.2, 60.4, 17.5},
                {11.8, -3.7, 24.8, 15.5, 7.2},
                {13.7, 0, 27.7, 10.5, 5.1},
                {18, 7.1, 31, 77.8, 18.1},
                {18.1, 8.1, 35.6, 42.5, 13.3},
                {21.1, 8.9, 36.8, 39.4, 14.9},
                {16.1, 5.7, 34.6, 52.5, 26.4},
                {11.8, 3.5, 21.6, 72.3, 16.3},
                {8.7, -4.3, 20.5, 24.8, 6.6},
                {5.5, -2.9, 14.1, 58.6, 7.5}
        };
        double[][] wetter2021 = {
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
        double temp2020 = 0;
        double temp2021 = 0;
        System.out.println("Abfrage der Wetterdaten!!! | [1] Die gesamte Tabelle | [2] Einzelne Werte | [3] Durchschnittswert eines Kriteriums");
        int auswahl1 = scanner.nextInt();
        if (auswahl1 == 1) {
            System.out.println("Jahr:");
            int jahr11 = scanner.nextInt();
            if (jahr11 == 2020) {
                int i1 = 0;
                while (i1 < wetter2020.length) {
                    System.out.println(Arrays.toString(wetter2020[i1]));
                    i1++;
                }
            } else if (jahr11 == 2021) {
                int i2 = 0;
                while (i2 < wetter2021.length) {
                    System.out.println(Arrays.toString(wetter2021[i2]));
                    i2++;
                }
            }
        } else if (auswahl1 == 2) {
            System.out.println("Wetterdaten 2020/2021");
            System.out.println("-------------------------------");
            System.out.println("Jahr");
            int jahr = scanner.nextInt();
            System.out.println("-------------------------------");
            System.out.println("Monat:");
            int monat = scanner.nextInt();
            if (jahr == 2020) {
                if (monat == monat) {
                    System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
                    int parameter = scanner.nextInt();
                    if (parameter == 0) {
                        System.out.println("Mittlere Temp. [C°]: " + wetter2020[monat - 1][0]);
                    } else if (parameter == 1) {
                        System.out.println("Minimum Temp. [C°]. " + wetter2020[monat - 1][1]);
                    } else if (parameter == 2) {
                        System.out.println("Maximum Temp. [C°]: " + wetter2020[monat - 1][2]);
                    } else if (parameter == 3) {
                        System.out.println("Niederschlag [l/m²]: " + wetter2020[monat - 1][3]);
                    } else if (parameter == 4) {
                        System.out.println("Regenreichster Tag [l/m²]: " + wetter2020[monat - 1][4]);
                    }
                }
            } else if (jahr == 2021) {
                if (monat == monat) {
                    System.out.println("[0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²]");
                    int parameter = scanner.nextInt();
                    if (parameter == 0) {
                        System.out.println("Mittlere Temp. [C°]: " + wetter2021[monat - 1][0]);
                    } else if (parameter == 1) {
                        System.out.println("Minimum Temp. [C°]. " + wetter2021[monat - 1][1]);
                    } else if (parameter == 2) {
                        System.out.println("Maximum Temp. [C°]: " + wetter2021[monat - 1][2]);
                    } else if (parameter == 3) {
                        System.out.println("Niederschlag [l/m²]: " + wetter2021[monat - 1][3]);
                    } else if (parameter == 4) {
                        System.out.println("Regenreichster Tag [l/m²]: " + wetter2021[monat - 1][4]);
                    }
                }
            }
        } else if (auswahl1 == 3) {
            System.out.println("Jahr:");
            int jahr2 = scanner.nextInt();
            if (jahr2 == 2020) {
                System.out.println("Durchschnittswert berechnen | [0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²] ");
                int auswahl3 = scanner.nextInt();
                int x = 0;
                while (x < 12){
                    temp2020 += wetter2020[x][auswahl3];
                    x++;
                }
                double durchschnitt = temp2020 / 12;
                System.out.println("Hier ist der Durchschnitt für dein Kriterium:" + durchschnitt);
            } else if (jahr2 == 2021) {
                System.out.println("Durchschnittswert berechnen | [0] Mittlere Temp. [C°] | [1] Minimum Temp. [C°] | [2] Maximum Temp. [C°] | [3] Niederschlag [l/m²] | [4] Regenreichster Tag [l/m²] ");
                int auswahl3 = scanner.nextInt();
                int x = 0;
                while (x < 12){
                    temp2021 += wetter2021[x][auswahl3];
                    x++;
                }
                double durchschnitt = temp2021 / 12;
            }
        }
    }
}