package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[10];

        int i = 0;

        while (i < arr.length) {
            arr[i] = random.nextInt(-50, 50);
            i++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
