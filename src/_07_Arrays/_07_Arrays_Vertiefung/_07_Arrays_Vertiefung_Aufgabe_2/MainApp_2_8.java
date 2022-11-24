package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_8 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[20];

        int i = 0;
        while (i < arr.length) {
            arr[i] = random.nextInt(0,2);
            i++;
        }
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        int count = 0;
        while (counter < arr.length) {
            if (arr[counter] == 0) {
                count++;
            }
            counter++;
        }
        System.out.println(count);

    }
}
