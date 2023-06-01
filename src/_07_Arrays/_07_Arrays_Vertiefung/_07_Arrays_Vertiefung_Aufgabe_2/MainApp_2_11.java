package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_11 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-50,50);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int nummerDavor = arr[0];
        System.out.print(nummerDavor + " ");
        for (int i = 1; i < arr.length; i++) {
            int aktuelleNummer = arr[i];
            if (aktuelleNummer != nummerDavor) {
                System.out.print(aktuelleNummer + " ");
                nummerDavor = aktuelleNummer;
            }
        }
    }
}
