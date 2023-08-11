package _12_Wdh_Klassen._12_Wdh_Klassen_Objekte_Speichplaetze_Null;

public class MainApp {
    public static void main(String[] args) {
        // Codeblock 1
        Politiker[] politiker = new Politiker[10];

        // Codeblock 2
        Politiker p1 = new Politiker();
        p1.vorname = "Olaf";
        p1.nachname = "Scholz";
        p1.amt = "Bundeskanzler";
        politiker[0] = p1;

        // Codeblock 3
        politiker[1] = new Politiker();
        Politiker p2 = politiker[1];
        p2.vorname = "Annalena";
        p2.nachname = "Bärbock";
        p2.amt = "Außenminister";

        // Codeblock 4
        p1 = politiker[2];

        // Codeblock 5
        p1 = new Politiker();
        p1.vorname = "Robert";
        p1.nachname = "Habeck";
        p1.amt = "Wirtschaftsminister";

        // Codeblock 6
        politiker[2] = p1;

        // Codeblock 7
        politiker[1].amt = "Außenministerin";

        // Codeblock 8
        politiker[3] = new Politiker();
        politiker[3].vorname = "Friedrich";
        politiker[3].nachname = "Merz";
        politiker[3].amt = "Bundesvorsitzender CDU";

        // Codeblock 9
        p1 = null;

        // Codeblock 10
        p1 = politiker[3];
        politiker[3] = null;
    }
}
