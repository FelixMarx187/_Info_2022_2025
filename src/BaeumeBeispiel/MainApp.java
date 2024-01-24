package BaeumeBeispiel;

import nichtLineareDatenstruktur.Baum;
public class MainApp {
    public static void main(String[] args) {
        Baum<Integer> l = new Baum(1);
        Baum<Integer> r = new Baum(3);
        Baum<Integer> baum_1 = new Baum(2,l,r);

        baumAusgeben(baum_1);

        Baum<Integer> ebene1 = new Baum<>(1);

        Baum<Integer> l2 = new Baum<>(10);
        Baum<Integer> ll = new Baum<>(5);
        Baum<Integer> lr = new Baum<>(15);

        Baum<Integer> r2 = new Baum<>(30);
        Baum<Integer> rl = new Baum<>(25);
        Baum<Integer> rr = new Baum<>(35);

    }

    public static void baumAusgeben(Baum<Integer> pBaum) {
        System.out.println("  " +pBaum.getInhalt());
        System.out.println("/   \\");
        System.out.println(pBaum.getLinkerTeilbaum().getInhalt() + " - " + pBaum.getRechterTeilbaum().getInhalt());
    }
}
