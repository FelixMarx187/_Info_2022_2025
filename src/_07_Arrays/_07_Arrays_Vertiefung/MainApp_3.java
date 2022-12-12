package _07_Arrays._07_Arrays_Vertiefung;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maximum");
        int max = scanner.nextInt();

        boolean[] primzahlen = new boolean[max];

        int i = 2;
        while (i < primzahlen.length) {
            primzahlen[i] = true;
            i++;
        }
        System.out.println(Arrays.toString(primzahlen));

        while (i < primzahlen.length) {
            if (primzahlen[i]) {
                int j = 2;
                while (i * j < primzahlen.length) {
                    primzahlen[i * j] = false;
                    j++;
                }
            }
        }

        while (i < primzahlen.length) {
            if (primzahlen[i]) {
                System.out.println(i);
            }
            i++;
        }
    }
}
