package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;

public class MainApp_2_12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        int i = 0;

        while (i < arr.length) {
            arr[i] = random.nextInt(-50,50);
            i++;
        }
        System.out.println(Arrays.toString(arr));

        int counter;
        int numbers = -50;
        int whithout;
        while (numbers <= 50) {
            counter = 0;
            whithout = 0;

            while (counter < arr.length) {
                if (numbers != arr[counter]) {
                    whithout++;
                    if (whithout == 100) {
                        System.out.println(numbers);
                    }
                    counter++;
                } else {
                    break;
                }
            }
            numbers++;
        }

    }
}
