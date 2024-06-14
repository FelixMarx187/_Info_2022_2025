package _0_Package.Caeser;

import java.util.Scanner;

public class Caeser {
    public static void main(String[] args) {
        Caeser caeser = new Caeser();
        System.out.print("Faktor: ");
        int faktor = new Scanner(System.in).nextInt();
        System.out.print("Gebe deinen Text ein: ");
        String start = new Scanner(System.in).nextLine();
        caeser.caeserCode(start, faktor);
    }
    public void caeserCode(String nText, int pFaktor) {
        String cText = "";
        int ascii_code = -1;
        for (int i = 0; i < nText.length(); i++) {
            if (nText.charAt(i) == ' ') {
                cText += " ";
                i++;
            }
            ascii_code = nText.charAt(i) + pFaktor;
            char buchstabe = (char) ascii_code;
            cText += buchstabe;
        }

        System.out.println("Dein Caesar Code: " + cText);
    }
}
