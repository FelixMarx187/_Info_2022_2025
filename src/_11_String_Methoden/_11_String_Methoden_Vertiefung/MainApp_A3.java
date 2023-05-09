package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainApp_A3 {
    public static String[] eingabe() {
        Scanner in = new Scanner(System.in);
        String[] text = new String[10];
        System.out.println("Gib bitte einen Text ein. Die Eingabe bitte mit einer Leerzeile beenden.");
        int idx = 0;
        while (idx < 10) {
            String eingabe = in.nextLine();
            if (eingabe.isEmpty())
                break;
            text[idx] = eingabe;
            idx++;
        }
        while (idx < 10) {
            text[idx++] = "";
        }
        return text;
    }

    public static String[] wegmite(String[] text) {
        String[] output = new String[text.length];
        int idx = 0;
        for (String zeile : text) {
            if (zeile.startsWith("E") || zeile.endsWith("e")) {
                output[idx++] = "********";
            } else {
                String neueZeile = "";
                for (int i = 0; i < zeile.length(); i++) {
                    if (!(zeile.charAt(i) == 'e' || zeile.charAt(i) == 'E'))
                        neueZeile += zeile.substring(i, i + 1);
                    else
                        neueZeile += "*";
                }
                output[idx++] = neueZeile;
            }
        }
        return output;
    }

    public static void ausgabe(String[] text) {
        System.out.println();
        System.out.println("Hehehe - Weg mit E!");
        System.out.println();
        for (String zeile : text) {
            System.out.println(zeile);
        }
    }

    public static void main(String[] args) {
        String[] text = eingabe();
        text = wegmite(text);
        ausgabe(text);
    }
}
// Das Programm löscht alle 'E' und 'e' aus dem Geschriebenen Text