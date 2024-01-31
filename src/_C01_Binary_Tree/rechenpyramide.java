package _C01_Binary_Tree;

import nichtLineareDatenstruktur.BinaryTree;

import java.util.Scanner;

public class rechenpyramide {
    public static void main(String[] args) {
        rechenpyramide rechenpyramide = new rechenpyramide();

        System.out.println("Gebe vier Zahlen ein!: ");
        Scanner scanner = new Scanner(System.in);
        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();
        int zahl3 = scanner.nextInt();
        int zahl4 = scanner.nextInt();
        scanner.close();

    }


    //Print Methode Kann man verwenden jedoch wird der Baum mit Hilfe von Inorder ausgegeben
    private void print(BinaryTree<Integer> pBaum) {
        if (pBaum.getContent() != null) {
            System.out.print(pBaum.getContent() + " ");
            print(pBaum.getLeftTree());
            print(pBaum.getRightTree());
        }
    }
}