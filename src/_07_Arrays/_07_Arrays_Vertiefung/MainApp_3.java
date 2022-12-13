package _07_Arrays._07_Arrays_Vertiefung;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maximum");
        int max = scanner.nextInt();

        int[] primzahlen = new int[max];

        int i = 1;
        while (i < primzahlen.length) {
            primzahlen[i] = i + 1;
            i++;
        }

        System.out.println(Arrays.toString(primzahlen));
        System.out.println("----------------------------");
        int j = 1;
        while (j < primzahlen.length) {
            j++;
        }
    }
}
