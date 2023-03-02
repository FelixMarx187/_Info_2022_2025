package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainApp_A1 {

    //Schreibe ein Programm, bei dem der Benutzer einen Satz eingibt
    // und dein Programm alle Wörter aus diesem Satz einzeln ausgibt.
    // Satzzeichen sollen dabei ignoriert werden (sie werden also auch nicht ausgegeben!).
    public static String userinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib einen Satz ein du Hurensohn: ");
        String input = scanner.nextLine();
        System.out.println("User-Input: "+ input);
        return input;
    }

    public static void main(String[] args) {
        userinput();

    }
}