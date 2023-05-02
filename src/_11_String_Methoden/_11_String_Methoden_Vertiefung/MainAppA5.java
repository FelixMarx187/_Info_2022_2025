package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainAppA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satz:");
        String satz = scanner.nextLine();
        System.out.println("Schlüssel:");
        String schluessel = scanner.nextLine();
        System.out.println(vigenere_chiffre(satz,schluessel));

    }
    public static String vigenere_chiffre(String pText, String pSchluessel) {
        String verschluesselung = "";
        verschluesselung = pText;
        return verschluesselung;
    }
}
