package _10_For_Schleifen._10_For_Schleifen_Vertiefung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_A1 {
    public static int input() { //Hier wird die User eingabe vor genommen
        int eingabe = 0;
        while (eingabe <= 0) {
            System.out.println("Bitte eine Zahl größer 0 eingeben:");
            eingabe = new Scanner(System.in).nextInt();
        }
        return eingabe;
    }

    public static int[] randomarray(int counter) { // Hier wird das array mit Random zahlen gefüllt
        int[] arr = new int[counter];
        for (int i=0; i< counter; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return arr;
    }

    public static void ausgeben (int[] arr) { //Hier wird das Array zusammen gerechnet und durch den User Input geteilt

        double ergebnis = 0.0;
        for (int l = 0; l < arr.length; l++) {
            ergebnis += arr[l];
        }
        ergebnis /= arr.length;
        System.out.println("Ergebnis = " + ergebnis);
    }

    public static void main(String[] args) {
        int counter = input();
        int[] ergebnis = randomarray(counter);
        ausgeben(ergebnis);
    }
}

/* Aufgabe 1a
Der Code erstellt ein Array der Länge des Inputs, das Array wird dann mit Random zahlen gefüllt.
Das Array wird dann zusammen gerechnet. Das ergebnis wird vor dem Ausgeben noch durch den Input geteilt.
Das Ergebnis ist dann das Zusammen gerechnete Array durch den Input des Users.
 */

/* Aufgabe 1b
Eine For-Schleife benutz man am besten wenn man über ein Vollständiges Array iteriert. Jedoch muss eine For-Schleife immer
aus einer Initialisierung sowie einer Abbruchbedinung und eine Veränderung. Deshalb nutz man in Zeile 9 bis 12 auch eine
While Schleife da dort keine Veränderung genutzt werden kann.
 */
