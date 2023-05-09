package _11_String_Methoden._11_String_Methoden_Vertiefung;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp_A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satz:");
        String eingabe = scanner.nextLine();
        System.out.println("ASCII [1] / CAESAR [2]");
        int input = scanner.nextInt();
        if (input == 1) {
            asciiverschluesselung(eingabe);
        } else {
            System.out.println("Verschiebung: ");
            int verschiebung = scanner.nextInt();
            caesarverschluesselung(eingabe, verschiebung);
        }
    }
    public static void asciiverschluesselung(String satz) {
        byte[] bytes = satz.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Mit verschluesselung: " + Arrays.toString(bytes));
    }

    public static void caesarverschluesselung(String satz, int verschiebung) {
        String output = "";
        for (int i = 0; i < satz.length(); i++) {
            char buchstabe =satz.charAt(i);
            int ceasar = (int) buchstabe;
            int ceasarverschiebung = ceasar + verschiebung;
            char translate = (char) ceasarverschiebung;
            output += translate;
        }
        System.out.println(output);
    }
}
