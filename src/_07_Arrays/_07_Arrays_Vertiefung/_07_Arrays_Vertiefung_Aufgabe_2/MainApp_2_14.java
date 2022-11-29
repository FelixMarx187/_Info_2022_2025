package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Geben sie eine Zahl zwischen -50 und 50 ein");
        int index = scanner.nextInt();

        int[] arr = new int[100];
        int i = 0;
        while (i < arr.length) {
            arr[i] = random.nextInt(-50,50);
            i++;
        }
        System.out.println(Arrays.toString(arr));


   }
}
