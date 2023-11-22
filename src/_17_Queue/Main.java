package _17_Queue;

import LineareDatenstruktur.Queue;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<BestellListe> bestellListeQueue = new Queue<>();

        boolean run = true;
        while (run) {
            System.out.println("Bestellliste Lieferando");
            System.out.println("[1] Neue Bestellung hinzufügen\n[2] Das erste in der Queue ausgeben (Danach wird das erste Element gelöscht)");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.print("Bestellnummer: ");
                int inputBestellnummer = new Random().nextInt(1000,9999);
                System.out.println(inputBestellnummer);
                System.out.print("Preis: ");
                double inputPreis = new Scanner(System.in).nextDouble();
                bestellListeQueue.enqueue(new BestellListe(inputBestellnummer,inputPreis));
            } else if (input == 2) {
                if (bestellListeQueue.front() != null) {
                    System.out.println(bestellListeQueue.front().toString());
                    bestellListeQueue.dequeue();
                } else {
                    System.out.println("Keine Bestellungen Mehr");
                }
            }
        }
    }
}
