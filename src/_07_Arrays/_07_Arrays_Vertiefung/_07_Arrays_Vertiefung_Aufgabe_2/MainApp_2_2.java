package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[100];
        int counter = 0;
        while (counter < a.length) {
            int zahl = random.nextInt(-50, 50);
            a[zahl] = zahl;
            counter =+ 1;
        }
        System.out.println(Arrays.toString(a));

    }
}
