package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Random;

public class MainApp_2_11 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            arr[i] = random.nextInt(-50,50);
            while (j < arr.length) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
                j++;
            }
            System.out.println(arr[i]);
            i++;
        }
    }
}
