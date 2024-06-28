package Ressources;

import java.util.Scanner;

public class inputClass {
    public int inputInt() {
        int zahl = new Scanner(System.in).nextInt();
        return zahl;
    }
    public String inputString() {
        String text = new Scanner(System.in).nextLine();
        return text;
    }
}
