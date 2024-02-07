package Challenge.ZahlenSuchen;

import Challenge.ZahlenSuchen.Vorlage;
import nichtLineareDatenstruktur.BinarySearchTree;

import java.util.Scanner;

public class MainApp implements Vorlage {
    public static BinarySearchTree<Zahl> zahlBST = new BinarySearchTree<>();
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        boolean run = true;
        while (run) {
            System.out.println("Zahlen suchen");
            mainApp.printBST_preorder(mainApp.fillBSTWithRandomNumbers());
            System.out.println();
            mainApp.sucheZahlImBST(zahlBST,mainApp.zahlEingeben());
        }
    }

    @Override
    public int zahlEingeben() {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public void sucheZahlImBST(BinarySearchTree<Zahl> pBST, int pZahl) {
        if (pBST.search(new Zahl(pZahl)) == null) {
            System.out.println("Keine Person gefunden");
        } else {
            System.out.println("Zahl gefunden: " + pZahl);
        }
    }

    @Override
    public void printBST_preorder(BinarySearchTree<Zahl> pBST) {
        if (!pBST.isEmpty()) {
            System.out.print(pBST.getContent().getValue() + " | ");
            printBST_preorder(pBST.getLeftTree());
            printBST_preorder(pBST.getRightTree());
        }
    }

    @Override
    public BinarySearchTree<Zahl> fillBSTWithRandomNumbers() {
        zahlBST.insert(new Zahl(1));
        zahlBST.insert(new Zahl(56));
        zahlBST.insert(new Zahl(24));
        zahlBST.insert(new Zahl(54));
        zahlBST.insert(new Zahl(69));
        return zahlBST;
    }
}
