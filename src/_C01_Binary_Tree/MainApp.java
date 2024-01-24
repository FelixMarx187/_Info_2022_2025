package _C01_Binary_Tree;
import nichtLineareDatenstruktur.BinaryTree;

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
    }
    public int ebenenZaehlen(BinaryTree<Integer> pBaum) {
        int counter = 0;
        if (pBaum.getContent() == null) {
            return counter;
        } else {
            ebenenZaehlen(pBaum.getLeftTree());
            counter++;
            ebenenZaehlen(pBaum.getRightTree());
            counter++;

            return counter + 1; // Die "1" steht für die Wurzel
        }
    }
}
