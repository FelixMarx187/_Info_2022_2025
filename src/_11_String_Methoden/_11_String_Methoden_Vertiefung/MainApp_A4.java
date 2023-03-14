package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp_A4 {
    public static String userinput() {
        System.out.println("Geben sie einen Satz ein:");
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static void verschluesselung(){
        String satz = userinput();
        System.out.println("Ohne Verschlüsselung: " + satz);
        for (int i = 0; i < satz.length(); i++) {
            char hallo = satz.charAt(i);
            System.out.println(hallo);
        }
    }

    public static void main(String[] args) {
        verschluesselung();
    }
}
