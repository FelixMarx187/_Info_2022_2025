package _01_Arbeit;

import java.util.Scanner;

public class TestCeasarChipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nachricht eingeben: ");
        String message = scanner.nextLine();

        System.out.print("Schlüssel eingeben: ");
        int key = scanner.nextInt();

        String encryptedMessage = encrypt(message, key);
        System.out.println("Verschlüsselte Nachricht: " + encryptedMessage);

        String decryptedMessage = encrypt(encryptedMessage, -key); // Entschlüsseln mit negativem Schlüssel
        System.out.println("Entschlüsselte Nachricht: " + decryptedMessage);

        scanner.close();
    }

    public static String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == c) {
                int ascii = (int) c;
                int shiftedAscii = ascii + key;
                if (c >= 'a' && c <= 'z') {
                    if (shiftedAscii > (int) 'z') {
                        shiftedAscii -= 26;
                    } else if (shiftedAscii < (int) 'a') {
                        shiftedAscii += 26;
                    }
                } else if (c >= 'A' && c <= 'Z') {
                    if (shiftedAscii > (int) 'Z') {
                        shiftedAscii -= 26;
                    } else if (shiftedAscii < (int) 'A') {
                        shiftedAscii += 26;
                    }
                }
                result.append((char) shiftedAscii);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

