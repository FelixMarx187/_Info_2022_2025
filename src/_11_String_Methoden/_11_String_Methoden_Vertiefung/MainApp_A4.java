package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp_A4 {
    public static void userinput() {
        System.out.println("Welche Verschlüsselung willst du verwenden? (ASCII[1] | Caesar[2])");
        int input = new Scanner(System.in).nextInt();
        if (input == 1) {
            System.out.println("---------------------------");
            asciiverschluesselung();
        } else if (input == 2) {
            System.out.println("---------------------------");
            caesarverschluesselung();
        }
    }

    public static void asciiverschluesselung() {
        System.out.println("Geben sie einen Satz ein:");
        String satz = new Scanner(System.in).nextLine();
        System.out.println("Ohne Verschluesselung: " + satz);
        byte[] bytes = satz.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Mit verschluesselung: " + Arrays.toString(bytes));
    }

    public static void caesarverschluesselung() {
        System.out.println("Geben sie einen Satz ein:");
        String satz = new Scanner(System.in).nextLine();
        System.out.println("Um wie viele Stellen soll die Verschluesselung verschoben werden?: ");
        int verschiebung = new Scanner(System.in).nextInt();
        System.out.println("Ohne Verschluesselung: " + satz);
        char c3 = 0;
        String stringbuilder = " ";

        for (int i = 0; i < satz.length(); i++) {
            char buchstabe =satz.charAt(i);
            int ceasar = (int) buchstabe;
            int ceasarverschiebung = ceasar + verschiebung;
            char translate = (char) ceasarverschiebung;
            stringbuilder += translate;
        }
        System.out.println(stringbuilder);

    }

    public static void main(String[] args) {
        userinput();
    }
}
