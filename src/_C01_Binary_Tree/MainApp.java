package _C01_Binary_Tree;

import nichtLineareDatenstruktur.BinaryTree;
import _C01_Binary_Tree.BaeumeBeispiel.MorseCode_BinaryTree;

public class MainApp {
    public static void main(String[] args) {
        //Ich habe hier einen neuen Baum erstellt mit Zufälligen Zahlen
        BinaryTree<Integer> ll = new BinaryTree<>(3);
        BinaryTree<Integer> lr = new BinaryTree<>(8);
        BinaryTree<Integer> l = new BinaryTree<>(4, ll, lr);

        BinaryTree<Integer> rr = new BinaryTree<>(23);
        BinaryTree<Integer> rl = new BinaryTree<>(15);
        BinaryTree<Integer> r = new BinaryTree<>(17, rl, rr);

        BinaryTree<Integer> wurzel = new BinaryTree<>(12, l, r);
        MainApp mainApp = new MainApp();
        System.out.println("Dein Baum hat "+mainApp.ebenenZaehlen(wurzel)+ " Ebenen! :) XD");

        MorseCode_BinaryTree morseCode_binaryTree = new MorseCode_BinaryTree();
        System.out.println("Dein Baum hat " + mainApp.ebenenZaehlenString(morseCode_binaryTree.wurzel) + " Ebenen! :) XD");

    }

    public int ebenenZaehlen(BinaryTree<Integer> pBaum) {
        if (pBaum == null) {
            return -1;
        } else {
            int linkerTeilbaum = ebenenZaehlen(pBaum.getLeftTree());
            int rechterTeilbaum = ebenenZaehlen(pBaum.getRightTree());
            if (linkerTeilbaum > rechterTeilbaum) {
                return linkerTeilbaum + 1;
            } else {
                return rechterTeilbaum + 1;
            }
        }
    }

    public int ebenenZaehlenString(BinaryTree<String> pBaum) {
        if (pBaum == null) {
            return -1;
        } else {
            int linkerTeilbaum = ebenenZaehlenString(pBaum.getLeftTree());
            int rechterTeilbaum = ebenenZaehlenString(pBaum.getRightTree());
            if (linkerTeilbaum > rechterTeilbaum) {
                return linkerTeilbaum + 1;
            } else {
                return rechterTeilbaum + 1;
            }
        }
    }
}
