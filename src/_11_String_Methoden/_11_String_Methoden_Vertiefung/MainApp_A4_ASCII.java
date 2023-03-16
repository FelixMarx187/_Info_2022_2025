package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp_A4_ASCII {
    public static void asciiverschluesselung() {
        System.out.println("Geben sie einen Satz ein:");
        String satz = new Scanner(System.in).nextLine();
        System.out.println("Ohne Verschluesselung: " + satz);
        byte[] bytes = satz.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Mit verschluesselung: " + Arrays.toString(bytes));
    }

    public static void main(String[] args) {
        asciiverschluesselung();
    }
}
