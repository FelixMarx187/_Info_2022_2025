package _06_While_Schleifen._06_Einfuehrung;

import java.util.Scanner;

public class MainApp_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        boolean run = true;
        while (run) {
            double value = Math.random();
            System.out.println(counter + ": " + value);
            counter++;

            System.out.println("Nochmal? (J/N)");
            if (scanner.nextLine().equals("N".toLowerCase())) {
                run = false;
            }
        }
    }
}
