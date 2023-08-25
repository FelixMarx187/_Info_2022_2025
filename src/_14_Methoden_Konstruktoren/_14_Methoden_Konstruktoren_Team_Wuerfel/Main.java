package _14_Methoden_Konstruktoren._14_Methoden_Konstruktoren_Team_Wuerfel;

public class Main {
    public static void main(String[] args) {
        String team1_name = "Die Coolen";
        String[] team1_spieler = new String[4];
        int[] team1_wuerfel = new int[4];
        int team1_punkte = 0;
        Team.add_spieler(team1_spieler, "Anna");
        Team.add_spieler(team1_spieler,"Melissa");
        Team.add_spieler(team1_spieler, "Semra");
        Team.add_spieler(team1_spieler, "Bianca");

        String team2_name = "Die Meister";
        String[] team2_spieler = new String[4];
        int[] team2_wuerfel = new int[4];
        int team2_punkte = 0;
        Team.add_spieler(team2_spieler, "Harry");
        Team.add_spieler(team2_spieler,"Ben");
        Team.add_spieler(team2_spieler, "Sascha");
        Team.add_spieler(team2_spieler, "Igor");

        String team3_name = "Ultimate-J";
        String[] team3_spieler = new String[4];
        int[] team3_wuerfel = new int[4];
        int team3_punkte = 0;
        Team.add_spieler(team3_spieler, "Jens");
        Team.add_spieler(team3_spieler,"Johanna");
        Team.add_spieler(team3_spieler, "Jana");
        Team.add_spieler(team3_spieler, "Josef");

        String strSieger = Team.spielen(team1_name, team1_spieler, team1_wuerfel, team2_name, team2_spieler, team2_wuerfel);
        if (strSieger == team1_name)
            team1_punkte += 3;
        else if (strSieger == team2_name)
            team2_punkte += 3;
        else {
            team1_punkte += 1;
            team2_punkte += 1;
        }
        Team.zwischenstand_anzeigen(team1_name, team1_punkte, team2_name, team2_punkte, team3_name, team3_punkte);

        strSieger = Team.spielen(team1_name, team1_spieler, team1_wuerfel, team3_name, team3_spieler, team3_wuerfel);
        if (strSieger == team1_name)
            team1_punkte += 3;
        else if (strSieger == team3_name)
            team3_punkte += 3;
        else {
            team1_punkte += 1;
            team3_punkte += 1;
        }
        Team.zwischenstand_anzeigen(team1_name, team1_punkte, team2_name, team2_punkte, team3_name, team3_punkte);

        strSieger = Team.spielen(team3_name, team3_spieler, team3_wuerfel, team2_name, team2_spieler, team2_wuerfel);
        if (strSieger == team3_name)
            team3_punkte += 3;
        else if (strSieger == team2_name)
            team2_punkte += 3;
        else {
            team3_punkte += 1;
            team2_punkte += 1;
        }
        Team.zwischenstand_anzeigen(team1_name, team1_punkte, team2_name, team2_punkte, team3_name, team3_punkte);

        Team.ermittleGesamtSieger(team1_name, team1_punkte, team2_name, team2_punkte, team3_name, team3_punkte);
    }
}
