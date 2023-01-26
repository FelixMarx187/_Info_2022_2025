package _01_Arbeit;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe");
        String jahr = scanner.nextLine();
        String ergebnis = "wetter" + jahr;
        System.out.println(ergebnis);
    }
}
