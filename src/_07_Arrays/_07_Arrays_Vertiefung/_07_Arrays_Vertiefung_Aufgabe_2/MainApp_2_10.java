package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MainApp_2_10 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =new Random().nextInt(-50, 50);
        }
        boolean doopelt = false;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}