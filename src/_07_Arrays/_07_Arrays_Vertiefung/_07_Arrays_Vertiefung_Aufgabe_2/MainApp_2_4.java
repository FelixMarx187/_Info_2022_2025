package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Random;
import java.util.Scanner;

public class MainApp_2_4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie einen Index an:");
        if (!scanner.hasNextInt()) {
            System.out.println("Fehler: Programm wird gestoppt");
        }
            int input = scanner.nextInt();

        int[] arr = new int[100];
        int counter = 0;

        while (counter < arr.length) {
            arr[counter] = random.nextInt(-50,50);
            counter++;
        }
        System.out.println(arr[input]);


    }
}
