package _09_Methoden._09_Methoden_Einführung;

public class MainApp_8 {
    // Rückgabewert: das neu erzeugte Deck mit den 32 Karten
    private static String[][] deckErzeugen() {
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
        return deck;
    }

    // Parameter: 2-dimensionales Array (die Karten in einem Deck)
    private static void deckAusgeben(String[][] deck) {
        System.out.println("Mein Deck besteht aus folgenden Karten:");
        int i = 0;
        while (i < deck.length) {
            int value = 0;
            String[] karte = deck[i];
            if (istBildkarte(karte[1]))
                value = 10;
            else if (karte[1].equals("As"))
                value = 11;
            else
                value = Integer.valueOf(karte[1]);

            System.out.println("Karte " + i + ": " + deck[i][0] + " " + deck[i][1] + " (Wert = " + value + ")");
            i++;
        }
    }

    // Parameter: ein String, der das Bild auf einer Karte repräsentiert
    // Rückgabewert: True, wenn es eine Bildkarte (Bauer, Dame oder König) ist, sonst False
    private static boolean istBildkarte(String bild) {
        return bild.equals("Bauer") || bild.equals("Dame") || bild.equals("König");
    }

    // Die Hauptfunktion erzeugt zunächst das Deck und gibt es dann aus
    public static void main(String[] args) {
        String[][] deck = deckErzeugen();
        deckAusgeben(deck);
    }

}
