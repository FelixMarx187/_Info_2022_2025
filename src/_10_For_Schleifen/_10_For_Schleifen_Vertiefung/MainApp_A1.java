package _10_For_Schleifen._10_For_Schleifen_Vertiefung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_A1 {
    public static int input() { // User Input
        int eingabe = 0;
        while (eingabe <= 0) {
            System.out.println("Bitte eine Zahl größer 0 eingeben:");
            eingabe = new Scanner(System.in).nextInt();
        }
        return eingabe;
    }

    public static int[] ermitteln(int counter) { //Füllt das Array mit Random zahlen
        int[] arr = new int[counter];
        for (int i = 0; i < counter; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return arr;
    }

    public static void ausgeben (int[] arr) { //Addiert alle Zahlen des Arrays zusammen
        double ergebnis = 0.0;
        for (int l = 0; l < arr.length; l++) {
            ergebnis += arr[l];
        }
        ergebnis /= arr.length;
        System.out.println("Ergebnis = " + ergebnis);
    }

    public static void main(String[] args) { //gibt d
        int counter = input();
        int[] ergebnis = ermitteln(counter);
        ausgeben(ergebnis);
    }
}
// Man benutzt For Schleifen nur wenn man was Initialisieren und den Wert verändern
// muss deshalb nutz man in Zeile 9 - 12 ein While Schleife.