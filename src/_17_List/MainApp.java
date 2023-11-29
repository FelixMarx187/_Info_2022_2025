package _17_List;

import LineareDatenstruktur.List;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> l = new List<>();
        //Liste füllen
        for (int i = 0; i < 100; i++) {
            l.append(new Random().nextInt(-50,50));
        }

        l.toFirst();
        System.out.println(l.hasAccess());

        //Liste Ausgeben
        listeAusgeben(l);
        System.out.println("----------------------");
        listeSumme(l);

    }
    public static void listeAusgeben(List<Integer> pIntListe) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + pIntListe.getContent());
            pIntListe.next();
        }
    }
    public static void listeSumme(List<Integer> pListe) {
        int temp = 0;
        pListe.toFirst();
        for (int i = 0; i < 100; i++) {
            temp += pListe.getContent();
            pListe.next();
        }
        System.out.println("Summe: "+temp);
    }
}
