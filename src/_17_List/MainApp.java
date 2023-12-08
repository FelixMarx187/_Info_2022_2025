package _17_List;

import LineareDatenstruktur.List;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> l = new List<>();

        for (int i = 0; i < 5; i++) {
            l.append(new Random().nextInt(0, 50));
        }

        // Liste Ausgeben
        listeAusgeben(l);

        System.out.println("----------------------");

        // Liste Summe
        listeSumme(l);

        System.out.println("----------------------");

    }

    public static void listeAusgeben(List<Integer> pIntListe) {
        int i = 0;
        pIntListe.toFirst();
        while (pIntListe.getContent() != null) {
            System.out.println(i + ": " + pIntListe.getContent());
            i++;
            pIntListe.next();
        }
    }

    public static void listeSumme(List<Integer> pListe) {
        int temp = 0;
        pListe.toFirst();
        while (pListe.getContent() != null) {
            temp += pListe.getContent();
            pListe.next();
        }
        System.out.println("Summe: " + temp);
    }
}
