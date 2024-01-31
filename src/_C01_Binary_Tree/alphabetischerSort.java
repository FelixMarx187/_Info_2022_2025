package _C01_Binary_Tree;

import nichtLineareDatenstruktur.BinaryTree;

public class alphabetischerSort {
    public static void main(String[] args) {
        BinaryTree<Character> B = new BinaryTree<>('B');

        BinaryTree<Character> E = new BinaryTree<>('E', B, null);
        BinaryTree<Character> S = new BinaryTree<>('S');
        BinaryTree<Character> Z = new BinaryTree<>('Z');

        BinaryTree<Character> A = new BinaryTree<>('A', null, E);
        BinaryTree<Character> P = new BinaryTree<>('P');
        BinaryTree<Character> T = new BinaryTree<>('T', S, Z);

        BinaryTree<Character> K = new BinaryTree<>('K', A, null);
        BinaryTree<Character> R = new BinaryTree<>('R', P, T);

        BinaryTree<Character> M = new BinaryTree<>('M', K, R);

        alphabetischerSort alphabetischerSort = new alphabetischerSort();
        alphabetischerSort.sort(M);
    }

    private void sort(BinaryTree<Character> pBaum) {
        if (pBaum.getContent() != null) {
            sort(pBaum.getLeftTree());
            System.out.println(pBaum.getContent() + " ");
            sort(pBaum.getRightTree());
        }
    }
}
