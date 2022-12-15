package _01_Arbeit;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAXIMUM:");
        int max = scanner.nextInt();
        int i = 2;
        boolean weiter = false;
        while (i <= max) {
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
