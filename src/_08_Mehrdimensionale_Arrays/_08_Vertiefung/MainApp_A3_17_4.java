package _08_Mehrdimensionale_Arrays._08_Vertiefung;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp_A3_17_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /*
        Der Benutzer zieht eine zufällige Karte aus dem Deck.
        Der Wert der Karte wird dem Benutzer als Punkte gutgeschrieben.
        Der Benutzer kann jetzt nacheinander so lange eine weitere zufällige Karte aus dem Deck ziehen, bis er…
        21 Punkte und damit gewonnen hat.
        mehr als 21 Punkte und damit verloren hat.
        entscheidet, dass er aufhört.
        Der Benutzer kann dieses Spiel natürlich beliebig oft wiederholen.
         */

        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        String[] bilder = {"7","8","9","10","Bauer","Dame","König"};

        boolean run = true;
        while (run) {
            System.out.println("------------------------------------");
            System.out.println("17 + 4");
            System.out.println("------------------------------------");
            System.out.println("Hit [1] | Stand [2]");
            int antwort = scanner.nextInt();
            if (antwort == 1) {
                int farbrand = random.nextInt(0,4);
                int bilderrand = random.nextInt(0,7);
                System.out.println("Zahl: " + farben[farbrand] + " " + bilder[bilderrand]);
            }
        }
    }
}
