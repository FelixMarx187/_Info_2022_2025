package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100];
        int i = 0;

        while (i < arr.length) {
            arr[i] = random.nextInt(-50,50);
            i++;
        }
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        int summe = 0;
        int zahl = 0;
        while (counter < arr.length) {
            zahl = summe + arr[counter];
            counter++;
        }
        System.out.println(zahl);
    }
}
