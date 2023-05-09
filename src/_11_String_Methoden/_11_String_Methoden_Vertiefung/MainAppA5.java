package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainAppA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satz:");
        String satz = scanner.nextLine();
        System.out.println("Schlüssel:");
        String schluessel = scanner.nextLine();
        System.out.println(schluesselAufLaengeBringen(satz, schluessel));
    }
    public static String schluesselAufLaengeBringen(String pNachricht, String pSchluessel) {
        String schluessel = "";
        for (int i = 0; i < pNachricht.length(); i++) {
            schluessel += (char) ((pSchluessel.charAt(i % pSchluessel.length())));
        }
        return schluessel;
    }
}