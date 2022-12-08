package _07_Arrays._07_Arrays_Vertiefung;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAXIMUM: ");
        int max = scanner.nextInt() - 1;
        int[] arr = new int[max];

        int i = 0;
        while (i < max) {
            arr[i] = i + 2;
            i++;
        }
        System.out.println(Arrays.toString(arr));

        //----------------------------------



    }
}

