package _06_While_Schleifen._06_Einfuehrung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean run = true;
        while (run) {
            int counter = 0;
            while (counter < 10) {
                int value = random.nextInt(10);

                System.out.println(counter + ": " + value);
                counter++;
            }
            System.out.print("Nochmal? (J/N)");
            if (scanner.nextLine().equals("N"))
                run = false;
        }
    }
}
