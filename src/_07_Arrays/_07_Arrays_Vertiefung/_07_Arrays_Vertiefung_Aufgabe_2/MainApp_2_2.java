package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class MainApp_2_2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[100];

        int counter = 0;

        while (counter < arr.length) {
            arr[counter] = random.nextInt(-50,50);
            System.out.println(arr[counter]);
            counter++;
        }
    }
}
