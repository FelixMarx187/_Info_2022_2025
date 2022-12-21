package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Random;

public class MainApp_2_5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100];
        int counter = 0;

        while (counter < arr.length) {
            arr[counter] = random.nextInt(-1,101);
            counter++;
        }
        System.out.println(arr[99]);
    }
}
