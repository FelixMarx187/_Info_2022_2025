package _09_Methoden._09_Methoden_Einführung;

public class MainApp_7 {
    public static void main(String[] args) {
        // Start Block 1: Deck erzeugen
        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        String[] bilder = {"7", "8", "9", "10", "Bauer", "Dame", "König", "As"};
        String[][] deck = new String[farben.length * bilder.length][2];

        int i = 0;
        while (i < bilder.length) {
            String bild = bilder[i];
            int j = 0;
            while (j < farben.length) {
                String farbe = farben[j];
                deck[i * farben.length + j][0] = farbe;
                deck[i * farben.length + j][1] = bild;
                j++;
            }
            i++;
        }
        // Ende Block 1

        // Start Block 2: Deck ausgeben
        System.out.println("Mein Deck besteht aus folgenden Karten:");
        i = 0;
        while (i < deck.length) {
            int value = 0;
            String[] karte = deck[i];
            // Block 3: Die Karenwerte bestimmen
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
        // Ende Block 2
    }
}
