package _00_Q1_Arbeit_2;

import LineareDatenstruktur.List;
import LineareDatenstruktur.Queue;
import LineareDatenstruktur.Stack;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ListBeispiel();
    }

    //-----------------------------------------

    public static void QueueBeispiel() {
        System.out.println("Queue Beispiel");
        boolean run = true;
        int counter = 0;
        while (run) {
            Queue<Beispiel> queueBeispiel = new Queue<>();
            System.out.print("Name: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Alter: ");
            int alter = new Scanner(System.in).nextInt();
            queueBeispiel.enqueue(new Beispiel(name, alter));
            while (!queueBeispiel.isEmpty()) {
                System.out.println(queueBeispiel.front().toString());
                queueBeispiel.dequeue();
            }
        }
    }

    public static void StackBeispiel() {
        System.out.println("Stack:  ");
        Stack<Beispiel> beispiels = new Stack<>();
        boolean run = true;
        while (run) {
            System.out.print("Name: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Alter: ");
            int alter = new Scanner(System.in).nextInt();
            beispiels.push(new Beispiel(name, alter));
            System.out.println("Weiter?: ");
            boolean weiter = new Scanner(System.in).nextBoolean();
            if (!weiter) {
                while (!beispiels.isEmpty()) {
                    System.out.println(beispiels.top().toString());
                    beispiels.pop();
                }
                break;
            }
        }
    }

    public static void ListBeispiel() {
        System.out.println("List: ");
        List<Beispiel> beispielList = new List<>();
        boolean run = true;
        while (run) {
            beispielList.toFirst();
            System.out.print("Name: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Alter: ");
            int alter = new Scanner(System.in).nextInt();
            beispielList.append(new Beispiel(name, alter));
            System.out.println("Weiter?: ");
            boolean weiter = new Scanner(System.in).nextBoolean();
            if (!weiter) {
                if (!beispielList.isEmpty()) {
                    while (!beispielList.isEmpty()) {
                        System.out.println(beispielList.getContent().toString());
                        beispielList.next();
                    }
                    break;
                }
            }
        }

        //-----------------------------------------

    }
}
