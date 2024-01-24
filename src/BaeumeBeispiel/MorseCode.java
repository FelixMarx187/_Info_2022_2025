package BaeumeBeispiel;

import jdk.jfr.ContentType;
import nichtLineareDatenstruktur.BinaryTree;
import nichtLineareDatenstruktur.BaumAusgeben;

import java.util.Scanner;

public class MorseCode {

    // 4. Ebene
    static BinaryTree<String> h = new BinaryTree<String>("H");
    static BinaryTree<String> v = new BinaryTree<String>("V");
    static BinaryTree<String> f = new BinaryTree<String>("F");
    static BinaryTree<String> l = new BinaryTree<String>("L");
    static BinaryTree<String> p = new BinaryTree<String>("P");
    static BinaryTree<String> j = new BinaryTree<String>("J");
    static BinaryTree<String> b = new BinaryTree<String>("B");
    static BinaryTree<String> x = new BinaryTree<String>("X");
    static BinaryTree<String> c = new BinaryTree<String>("C");
    static BinaryTree<String> y = new BinaryTree<String>("Y");
    static BinaryTree<String> q = new BinaryTree<String>("Q");
    static BinaryTree<String> z = new BinaryTree<String>("Z");

    // 3. Ebene
    static BinaryTree<String> s = new BinaryTree<String>("S", h, v);
    static BinaryTree<String> u = new BinaryTree<String>("U", f, null);
    static BinaryTree<String> r = new BinaryTree<String>("R", l, null);
    static BinaryTree<String> w = new BinaryTree<String>("W", p, j);
    static BinaryTree<String> d = new BinaryTree<String>("D", b, x);
    static BinaryTree<String> k = new BinaryTree<String>("K", c, y);
    static BinaryTree<String> g = new BinaryTree<String>("G", q, z);
    static BinaryTree<String> o = new BinaryTree<String>("O", null, null);


    // 2. Ebene
    static BinaryTree<String> i = new BinaryTree<String>("I", s, u);
    static BinaryTree<String> a = new BinaryTree<String>("A", r, w);
    static BinaryTree<String> n = new BinaryTree<String>("N", d, k);
    static BinaryTree<String> m = new BinaryTree<String>("M", g, o);

    // 1. Ebene
    static BinaryTree<String> e = new BinaryTree<String>("E", i, a);
    static BinaryTree<String> t = new BinaryTree<String>("T", n, m);

    // Wurzel
    public static BinaryTree<String> wurzel = new BinaryTree<>("/", e, t);

    public static void main(String[] args) {
        System.out.println("Buchstabe zu Morsecode");
        //String buchstaben = new Scanner(System.in).nextLine();buchstabeZuMorseCode(buchstaben);
        BinaryTree<String> baum = wurzel;
    }

    public static String buchstabeZuMorseCode(String pBuchstabe) {
        BinaryTree<String> baum = wurzel;
        String klartext = "";

        for (int i = 0; i < pBuchstabe.length(); i++) {
            if (pBuchstabe.charAt(i) == '/') {
                klartext += baum.getContent();
                baum = wurzel;
            } else if (pBuchstabe.charAt(i) == '.') {
                klartext+= baum.getLeftTree().getContent();
                baum = wurzel;
            } else if (pBuchstabe.charAt(i) == '-') {
                klartext+= baum.getRightTree().getContent();
                baum = wurzel;
            }
        }
        System.out.println(klartext);
        return klartext;
    }

    private static void inorder_ausgeben(BinaryTree<Integer> pBaum) {
        if (pBaum != null && !pBaum.isEmpty()) {
            inorder_ausgeben(pBaum.getLeftTree());
            System.out.print(pBaum.getContent() + " | ");
            inorder_ausgeben(pBaum.getRightTree());
        }
    }

    private static void preorder_ausgeben(BinaryTree<Integer> pBaum) {
        if (pBaum != null && !pBaum.isEmpty()) {
            System.out.print(pBaum.getContent() + " | ");
            inorder_ausgeben(pBaum.getLeftTree());
            inorder_ausgeben(pBaum.getRightTree());
        }
    }

    private static void postorder_ausgeben(BinaryTree<Integer> pBaum) {
        if (pBaum != null && !pBaum.isEmpty()) {
            inorder_ausgeben(pBaum.getLeftTree());
            inorder_ausgeben(pBaum.getRightTree());
            System.out.print(pBaum.getContent() + " | ");
        }
    }
}