package _01_Arbeit;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i <= 9999999999L; i++) {
            System.out.println(counter+ ": "+i);
            if (i == code) {
                System.out.println("Code found: " + code);
                System.exit(0);
            }
            counter++;
        }
        System.out.println("Code not found.");
    }
}
