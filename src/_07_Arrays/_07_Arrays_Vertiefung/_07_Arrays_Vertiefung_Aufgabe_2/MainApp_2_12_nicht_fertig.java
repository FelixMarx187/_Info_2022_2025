package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_12_nicht_fertig {
    public static void main(String[] args) {
        /*
        Gib alle Zahlen aus, die nicht im Array vorkommen.
         */
        Random  random = new Random();

        int[] arr1 = new int[100];
        int i = 0;
        while (i < arr1.length) {
            arr1[i] = random.nextInt(-50,50);
            i++;
        }

        int j = 0;
        int[] arr2 = new int[100];
        int zahl = -50;
        while (j< arr2.length) {
            arr2[j] = zahl + 1;
            j++;
        }
    }
}
