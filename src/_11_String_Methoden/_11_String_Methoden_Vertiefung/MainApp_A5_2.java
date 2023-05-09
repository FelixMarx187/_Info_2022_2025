package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainApp_A5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Text ein: ");
        String text = scanner.nextLine();
        System.out.print("Geben Sie den Schlüssel ein: ");
        String key = scanner.nextLine();

        String encryptedText = encrypt(text, key);
        System.out.println("Verschlüsselter Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Entschlüsselter Text: " + decryptedText);
    }

    public static String encrypt(String text, String key) {
        String ergebnis = "";
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char verschiebung = (char) ((c + key.charAt(idx) - 2 * 'A') % 26 + 'A');
                ergebnis += verschiebung;
                idx = (idx + 1) % key.length();
            } else {
                ergebnis += c;
            }
        }
        return ergebnis;
    }

    public static String decrypt(String text, String key) {
        String ergebnis = "";
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                    char verschiebung = (char) ((c - key.charAt(idx) + 26) % 26 + 'A');
                ergebnis += verschiebung;
                idx = (idx + 1) % key.length();
            } else {
                ergebnis += c;
            }
        }
        return ergebnis;
    }
}