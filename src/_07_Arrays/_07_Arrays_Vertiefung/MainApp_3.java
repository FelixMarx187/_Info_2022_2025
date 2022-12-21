package _07_Arrays._07_Arrays_Vertiefung;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAXIMUM:");
        int max = scanner.nextInt();
        int[] arr = new  int[max];
        int i = 2;
        boolean weiter = false;
        while (i <= arr.length) {
            int i1 = 2;
            while (i1 < i) {
                if (i % i1 == 0) {
                    weiter = true;
                    break;
                }
                i1++;
            }
            if (!weiter) {
                System.out.println(i);
            }
            weiter = false;
            i++;
        }
    }
}
