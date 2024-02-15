package _C01_Binary_Tree.InsertSearchRemove;

import nichtLineareDatenstruktur.BinarySearchTree;
import nichtLineareDatenstruktur.BinaryTree;

import java.util.Scanner;

public class InsertSearchRemove {
    public static BinarySearchTree<Person> personBinarySearchTree;
    public static void main(String[] args) {
        InsertSearchRemove MainApp = new InsertSearchRemove();
        boolean run = true;
        while (run) {
            System.out.println("insert(1), search(2), remove(3)");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    System.out.println("Vorname: ");
                    String vorname = new Scanner(System.in).nextLine();
                    System.out.println("Name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Geburtstag");
                    int alter = new Scanner(System.in).nextInt();
                    personBinarySearchTree.insert(new Person(vorname,name,alter));
                    break;
                case 2:
                    System.out.println("Vorname: ");
                    String vorname2 = new Scanner(System.in).nextLine();
                    System.out.println("Name: ");
                    String name2 = new Scanner(System.in).nextLine();
                    System.out.println("Geburtstag");
                    int alter2 = new Scanner(System.in).nextInt();
                    Person person2 = new Person(vorname2,name2,alter2);
                    System.out.println(MainApp.searchBaum(person2));
                    break;
                case 3:
                    System.out.println("Vorname: ");
                    String vorname3 = new Scanner(System.in).nextLine();
                    System.out.println("Name: ");
                    String name3 = new Scanner(System.in).nextLine();
                    System.out.println("Geburtstag");
                    int alter3 = new Scanner(System.in).nextInt();
                    Person person3 = new Person(vorname3,name3,alter3);
                    MainApp.removeBaum(person3);
                    break;
            }
        }
    }
    public String searchBaum(Person pPerson) {
        if (personBinarySearchTree.search(pPerson) == null) {
            return "Keine Person gefunden!";
        }
        return "Name gefunden: " + personBinarySearchTree.search(pPerson).getVorname() + " "+ personBinarySearchTree.search(pPerson).getName() + " " + personBinarySearchTree.search(pPerson).getAlter();
    }
    public void removeBaum(Person pPerson) {
        personBinarySearchTree.remove(pPerson);
        System.out.println("Person gelöscht");
    }
}
