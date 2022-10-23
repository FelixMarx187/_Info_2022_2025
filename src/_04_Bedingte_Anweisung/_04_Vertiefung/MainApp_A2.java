package _04_Bedingte_Anweisung._04_Vertiefung;

import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taschenrechner:");
        System.out.println("Geben sie den Arithmetischen Operator an: (+,-,*,/,%)");
        String operator = scanner.nextLine();
        System.out.println("Geben sie die erste Ziffer ein:");
        int zahl1 = scanner.nextInt();
        System.out.println("Geben sie die zweite Ziffer ein:");
        int zahl2 = scanner.nextInt();

        if (operator.equals("+")) {
            int ergebnis = zahl1 + zahl2;
            System.out.println("Dein ergebnis lautet: " + ergebnis);
        } else if (operator.equals("-")) {
            int ergebnis2 = zahl1 - zahl2;
            System.out.println("Dein ergebnis lautet: " + ergebnis2);
        } else if (operator.equals("*")) {
            int ergebnis3 = zahl1 * zahl2;
            System.out.println("Dein ergebnis lautet: " + ergebnis3);
        } else if (operator.equals("/")) {
            int ergebnis4 = zahl1 / zahl2;
            System.out.println("Dein ergebnis lautet: " + ergebnis4);
        } else if (operator.equals("%")) {
            int ergebnis5 = zahl1 / zahl2;
            int ergebnis55 = zahl1 % zahl2;
            System.out.println("Dein ergebnis lautet: " + ergebnis5 + " Rest " + ergebnis55);
        }
    }
}
