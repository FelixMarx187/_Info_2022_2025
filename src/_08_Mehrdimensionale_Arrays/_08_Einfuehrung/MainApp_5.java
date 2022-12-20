package _08_Mehrdimensionale_Arrays._08_Einfuehrung;

import java.util.Arrays;

public class MainApp_5 {
    public static void main(String[] args) {
        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        String[] bilder = {"7", "8", "9", "10", "Bauer", "Dame", "König", "As"};
        String[][] deck = new String[farben.length * bilder.length][2];

        int i = 0;
        while (i < bilder.length) {
            String bild = bilder[i];
            int j = 0;
            while (j < farben.length) {
                String farbe = farben[j];
                deck[i*farben.length + j][0] = farbe;
                deck[i*farben.length + j][1] = bild;
                j++;
            }
            i++;
        }

        System.out.println("Mein Deck besteht aus folgenden Karten:");
        i = 0;
        while (i < deck.length) {
            int value = 0;
            String[] karte = deck[i];
            if (karte[1].equals("Bauer") || karte[1].equals("Dame") || karte[1].equals("König"))
                value = 10;
            else if (karte[1].equals("As"))
                value = 11;
            else {
                value = Integer.valueOf(karte[1]);
            }

            System.out.println("Karte " + i + ": " + deck[i][0] + " " + deck[i][1] + " (Wert = " + value + ")");
            i++;
        }

        System.out.println(Arrays.toString(deck));
        System.out.println(Arrays.deepToString(deck));
    }
}
