package Challenge.PersonenSuchen;

import nichtLineareDatenstruktur.BinarySearchTree;

import java.util.Scanner;

public class MainApp implements Vorlage {
    public static BinarySearchTree<Person> personBST = new BinarySearchTree<>();
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        boolean run = true;
        while (run) {
            System.out.println("Suche Person in BST");
            mainApp.printBST_inorder(mainApp.fillBSTWithNames());
            System.out.println();
            mainApp.suchePersonImBST(personBST, mainApp.personEingeben());
        }
    }

    @Override
    public String personEingeben() {
        return new Scanner(System.in).nextLine();
    }

    public void suchePersonImBST(BinarySearchTree<Person> pBST, String pName) {
        if (personBST.search(new Person(pName)) == null) {
            System.out.println("Keine Person gefunden");
        } else {
            System.out.println("Person gefunden: " + pName);
        }
    }

    @Override
    public void printBST_inorder(BinarySearchTree<Person> pBST) {
        if (pBST != null && !pBST.isEmpty()) {
            printBST_inorder(pBST.getLeftTree());
            System.out.print(pBST.getContent().getName() + " | ");
            printBST_inorder(pBST.getRightTree());
        }
    }

    @Override
    public BinarySearchTree<Person> fillBSTWithNames() {
        personBST.insert(new Person("Jocelin"));
        personBST.insert(new Person("Felix"));
        personBST.insert(new Person("Michael"));
        personBST.insert(new Person("Jasper"));
        personBST.insert(new Person("Koko"));
        personBST.insert(new Person("Dominik"));
        personBST.insert(new Person("Weronika"));
        personBST.insert(new Person("Joel"));
        personBST.insert(new Person("Tom"));
        return personBST;
    }
}
