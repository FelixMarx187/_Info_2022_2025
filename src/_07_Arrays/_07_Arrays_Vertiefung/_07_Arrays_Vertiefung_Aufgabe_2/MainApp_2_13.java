package _07_Arrays._07_Arrays_Vertiefung._07_Arrays_Vertiefung_Aufgabe_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp_2_13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie ihren Index an:");
        int index = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Fehler : Ungültige Eingabe");
            System.exit(0);
        } else {
            index = scanner.nextInt();
        }
        int[] arr = new int[100];
        int i = 0;

        while (i < arr.length) {
            arr[i] = random.nextInt(-50, 50);
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------------------------");
        System.out.println("Das ist der Wert deines Index: " + arr[index]);
        System.out.println("-----------------------------------------------");

        //-----------------------------------

        System.out.println("Deine Zahl kommt an den Folgenden stellen Vor:");
        int counter = 0;
        int position = 0;
        while (counter < arr.length) {
            if (arr[counter] == arr[index]) {
                System.out.println("Position: " + counter);
            }
        }
    }
}
