package _C01_Binary_Tree;

import nichtLineareDatenstruktur.BinaryTree;

public class BinaryTreeSumme {
    public static void main(String[] args) {
        BinaryTreeSumme binaryTreeSumme = new BinaryTreeSumme();
        BaumString baumString = new BaumString();
        System.out.println("Summe: " + binaryTreeSumme.SummeBerechnenString(baumString.getWurzel()));
        BinaryTree<Integer> ll = new BinaryTree<>(3);
        BinaryTree<Integer> lr = new BinaryTree<>(8);
        BinaryTree<Integer> l = new BinaryTree<>(4, ll, lr);

        BinaryTree<Integer> rr = new BinaryTree<>(23);
        BinaryTree<Integer> rl = new BinaryTree<>(15);
        BinaryTree<Integer> r = new BinaryTree<>(17, rl, rr);

        BinaryTree<Integer> wurzel = new BinaryTree<>(12, l, r);
        System.out.println("Summe: " + binaryTreeSumme.SummeBerechnenInteger(wurzel));

    }

    public int SummeBerechnenString(BinaryTree<String> pBaum) {
        int summenode = 0;
        if (pBaum.getContent() == null) {
            return 0;
        } else {
            summenode = Integer.parseInt(pBaum.getContent());
            int summelinks = SummeBerechnenString(pBaum.getLeftTree());
            int summerechts = SummeBerechnenString(pBaum.getRightTree());

            return summenode + summelinks + summerechts;
        }
    }

    public int SummeBerechnenInteger(BinaryTree<Integer> pBaum) {
        int summenode = 0;
        if (pBaum.getContent() == null) {
            return 0;
        } else {
            summenode = pBaum.getContent();
            int summelinks = SummeBerechnenInteger(pBaum.getLeftTree());
            int summerechts = SummeBerechnenInteger(pBaum.getRightTree());

            return summenode + summelinks + summerechts;
        }
    }
}
