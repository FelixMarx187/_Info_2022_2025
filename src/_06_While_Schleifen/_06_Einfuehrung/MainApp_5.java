package _06_While_Schleifen._06_Einfuehrung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean run = true;
        do {
            int counter = 1;
            do {
                int value = random.nextInt();

                System.out.println(counter + ": " + value);
                counter++;
            } while (counter < 10); {
                System.out.println("Nochmal? (J/N)");
                if (scanner.nextLine().equals("N"))
                    run =false;
            }
        } while (run);
    }
}
