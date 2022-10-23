package _01_Getting_Started._01_Vertiefung;

public class MainApp {
    public static void main(String[] args) {

        // System.out.println("Manchmal geht was schief")
        // Analyse: ";" fehlt
        System.out.println("Manchmal geht was schief");

        // System.out.println(Sogar ganz oft!);
        // Analyse: Anführungszeichen fehlen
        System.out.println("Sogar ganz oft!");

        // System.out.pintln("Was man nicht alles falsch machen kann!");
        // Analyse: "println" ist falsch geschrieben
        System.out.println("Was man nicht alles falsch machen kann!");

        /*
        Beschreibung: Wenn man einen Fehler beim Schreiben eines Codes macht, weißt IntelliJ dies und gibt am Rand
        des Zeilenzählers eine rote Lampe an, außerdem wird das falsch geschriebene Wort Rot angezeigt. Außerdem wird
        Oben rechts angegeben was alles Richtig und was alles flasch geschrieben ist.
        Bei IntelliJ wird alles, was falsch ist, Rot angegeben!
         */

        System.out.println("Name: Felix Marx");
        System.out.println("Geburtstag: 21. Oktober 2006 (15 Jahre alt)");
        System.out.println("Geburtsort: Mönchengladbach Rheydt");
        System.out.println("Wohnort: Heinsberg-Horst 52525");
        System.out.println("Muttersprache: Deutsch");
    }
}
