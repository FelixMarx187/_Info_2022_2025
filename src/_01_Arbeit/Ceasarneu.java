package _01_Arbeit;
import java.util.Scanner;
public class Ceasarneu {
    public static String caesarVerschluesselung(String pText, int pVerschiebung) {
        String caesarVerschluesselt = "";
        for (int i = 0; i < pText.length(); i++) {
            caesarVerschluesselt += (char) ((pText.charAt(i) + pVerschiebung)) ;
        }
        return caesarVerschluesselt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Text ein: ");
        String pText = scanner.nextLine();
        System.out.print("Geben sie eine Verschiebung ein: ");
        int pVerschiebung = scanner.nextInt();
        System.out.println(caesarVerschluesselung(pText, pVerschiebung));
    }
}