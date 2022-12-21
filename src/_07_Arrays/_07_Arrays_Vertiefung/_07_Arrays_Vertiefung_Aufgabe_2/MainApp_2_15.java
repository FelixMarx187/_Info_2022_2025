package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] arr = new int[100];
        int i = 0;

        while (i < arr.length) {
            arr[i] = random.nextInt(-50,50);
            i++;
        }

        System.out.println(Arrays.toString(arr));
        //--------------------------------------------

        System.out.println("GEBEN SIE DEN ERSTEN INDEX EIN: ");
        int idx = scanner.nextInt();
        System.out.println("INDEX: " + arr[idx]);
        int idx11 = arr[idx];

        System.out.println("GEBEN SIE DEN ZWEITEN INDEX EIN: ");
        int idx2 = scanner.nextInt();
        System.out.println("INDEX: " + arr[idx2]);
        int idx22 = arr[idx2];

        //------------------------------------------------
        System.out.println();
        System.out.println("BEIDE ZAHLEN WERDEN NUN GETAUSCHT");

        System.out.println(Arrays.toString(arr));



    }

}
