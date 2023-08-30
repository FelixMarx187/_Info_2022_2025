package _14_Methoden_Konstruktoren._14_Methoden_Konstruktoren_Team_Wuerfel;

import java.util.Random;

public class Team {
    private String[] spieler;
    private String name;
    private int[] wuerfel;

    public void Team(String[] pSpieler, String pName, int[] pWuerfel) {
        this.name = pName;
        this.spieler = pSpieler;
        this.wuerfel = pWuerfel;
    }
    public static  void add_spieler(String[] pSpieler, String pName) {
        boolean ok = false;
        for (int i = 0; i < pSpieler.length; i++) {
            if (pSpieler[i] == null) {
                pSpieler[i] = pName;
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Error! Team is already full!");
        }
    }

    public static void wuerfeln(String[] pSpieler, int[] pWuerfel) {
        int summe = 0;
        Random random = new Random();
        for (int i = 0; i < pSpieler.length; i++) {
            pWuerfel[i] = random.nextInt(6) + 1;
            System.out.println("\t" + pSpieler[i] + " wuerfelt eine " + pWuerfel[i]);
        }
    }

    public static int getSummeWuerfel(int[] pWuerfel) {
        int summe = 0;
        for (int i = 0; i < pWuerfel.length; i++) {
            summe += pWuerfel[i];
        }
        return summe;
    }

    public static String spielen(String pTeamName1, String[] pSpieler1, int[] pWuerfel1, String pTeamName2, String[] pSpieler2, int[]  pWuerfel2) {
        System.out.println("Es spielt " + pTeamName1 + " gegen " + pTeamName2);
        System.out.println("\t" + pTeamName1);
        wuerfeln(pSpieler1, pWuerfel1);
        System.out.println("\n\t" + pTeamName2);
        wuerfeln(pSpieler2, pWuerfel2);

        return ermittleSpielSieger(pTeamName1, pWuerfel1, pTeamName2, pWuerfel2);
    }

    public static String ermittleSpielSieger (String pTeamName1, int[] pWuerfel1, String pTeamName2, int[] pWuerfel2) {
        String strSieger = "";
        int augenzahl1 = getSummeWuerfel(pWuerfel1);
        int augenzahl2 = getSummeWuerfel(pWuerfel2);

        System.out.println(pTeamName1 + " - " + pTeamName2 + "\t\t" + augenzahl1 + " : " + augenzahl2);
        if (augenzahl1 > augenzahl2) {
            strSieger = pTeamName1;
            System.out.println("Team " + pTeamName1 + " hat gewonnen");
        } else if (augenzahl2 > augenzahl1) {
            strSieger = pTeamName2;
            System.out.println("Team " + pTeamName2 + " hat gewonnen");
        } else {
            System.out.println("Unentschieden. Beide Teams bekommen einen Punkt");
        }
        return strSieger;
    }

    public static void ermittleGesamtSieger(String pTeam1, int pPunkte1, String pTeam2, int pPunkte2, String pTeam3, int pPunkte3) {
        if (pPunkte1 > pPunkte2 && pPunkte1 > pPunkte3)
            System.out.println("Der Sieger ist: " + pTeam1);
        else if (pPunkte2 > pPunkte1 && pPunkte2 > pPunkte3)
            System.out.println("Der Sieger ist: " + pTeam2);
        else if (pPunkte3 > pPunkte1 && pPunkte3 > pPunkte2)
            System.out.println("Der Sieger ist: " + pTeam3);
        else
            System.out.println("Es gibt keinen eindeutigen Sieger.");
    }

    public static void zwischenstand_anzeigen(String pTeam1, int pPunkte1, String pTeam2, int pPunkte2, String pTeam3, int pPunkte3) {
        System.out.println("\nZwischenstand\n---------------------------------------------");
        System.out.println(pTeam1 + ":\t" + pPunkte1 + "Punkte");
        System.out.println(pTeam2 + ":\t" + pPunkte2 + "Punkte");
        System.out.println(pTeam3 + ":\t" + pPunkte3 + "Punkte");
        System.out.println("\n");
    }
}
