package _C01_Binary_Tree.C01_Uebung_zu_BinaerBaeumen.Aufgaben._12Einfuegen_in_BST;/*
Aufgabe:
Füge die Zahlen 5, 2, 7, 3, 4, 6, 8, 1 und 9 in einen leeren Binärbaum ein.
Ergänze anschließend die jeweilige Print-Anweisung, um den zuvor eingefügten Node auszugeben.

Nenne als String den Teilbaum, den du gerade besuchst.
Konkateniere anschließend diesen String mit dem Inhalt des Knotens, den du gerade besuchst.
 */

import nichtLineareDatenstruktur.Zahl;
import nichtLineareDatenstruktur.BinarySearchTree;

public class Einfuegen {

  public static void main(String[] args) {
    BinarySearchTree<Zahl> bstZahl = new BinarySearchTree<>();
    bstZahl.insert(new Zahl(5));
    System.out.println("Wurzel: " + String.valueOf(bstZahl.search(new Zahl(5)).getValue()));

    bstZahl.insert(new Zahl(2));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(2)).getValue()));

    bstZahl.insert(new Zahl(7));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(7)).getValue()));

    bstZahl.insert(new Zahl(3));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(3)).getValue()));

    bstZahl.insert(new Zahl(4));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(4)).getValue()));

    bstZahl.insert(new Zahl(6));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(6)).getValue()));

    bstZahl.insert(new Zahl(8));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(8)).getValue()));

    bstZahl.insert(new Zahl(1));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(1)).getValue()));

    bstZahl.insert(new Zahl(9));
    System.out.println("Teilbaum ..." + String.valueOf(bstZahl.search(new Zahl(9)).getValue()));
  }
}
