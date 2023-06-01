package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Random;
import java.util.Scanner;

public class MainApp_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben sie einen Index ein: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Fehler: Programm wird gestopt");
        }
        int inp = scanner.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-50,50);
        }
        System.out.println(arr[inp]);
    }
}
