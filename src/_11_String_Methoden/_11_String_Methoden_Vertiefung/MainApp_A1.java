package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainApp_A1 {

    //Schreibe ein Programm, bei dem der Benutzer einen Satz eingibt
    // und dein Programm alle Wörter aus diesem Satz einzeln ausgibt.
    // Satzzeichen sollen dabei ignoriert werden (sie werden also auch nicht ausgegeben!).
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String[] wörter = input.split(" ");

        for (String wort : wörter){
            System.out.println(wort);
        }
    }
}