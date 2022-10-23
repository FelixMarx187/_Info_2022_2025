package _05_Switch_Anweisungen._05_Vertiefung;


import java.util.Scanner;

public class MainApp_A1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Herzlich willkommen bei unserer Versicherungs-Hotline!");
        System.out.println("Wie kann ich Ihnen helfen?");
        System.out.println("A - Neuen Vertrag abschließen");
        System.out.println("B - Schaden melden");
        System.out.println("C - Fragen zum bestehenden Vertrag");
        System.out.println("D - Termin vereinbaren");
        System.out.println();
        System.out.println("Bitte geben Sie den Buchstaben Ihrer Wahl an.");

        String wahl = in.next().toLowerCase();
        switch (wahl) {
            case "a":
                System.out.println("Vielen Dank für Ihr Interesse. Ich verbinde Sie mit einem Berater");
            case "b":
                System.out.println("Das tut mir leid. Moment. Ich verbinde Sie mit einem Berater.");
            case "c":
                System.out.println("Einen Moment bitte, ich verbinde Sie mit unserem Kundenservice.");
            case "d":
                System.out.println("Einen Moment bitte, ich verbinde Sie mit unserer Termin-Zentrale.");
                break;
            default:
                System.out.println("Ich habe Sie leider nicht verstanden. Ich verbinde Sie mit unserem Kundenservice.");


        }
    }
}
