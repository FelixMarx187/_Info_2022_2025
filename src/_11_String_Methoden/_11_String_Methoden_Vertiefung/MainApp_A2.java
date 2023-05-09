package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Welche Methode willst du verwenden? \nConcat-Operator[1] \nCharAt[2] \ncompareTo[3] \ncontains[4] \nendsWith[5] \nequals[6] \nindexOf[7] \nindexOf2.0[8] \nisEmpty[9] \njoin[10] \nlength[11] \nreplace[12] \nsplit[13] \nstartsWith[14] \nstrip[15] \nsubstring[16] \nsubstring2.0[17] \ntoLowerCase[18] \ntoUpperCase[19]");
        System.out.println("----------------------");
        int input2 = scanner.nextInt();
        switch (input2) {
            case 1:
                contactoperator();
            case 2:
                CharAt();
            case 3:
                compareto();
            case 4:
                contains();
            case 5:
                endsWith();
            case 6:
                equalss();
            case 7:
                indexOf();
            case 8:
                indexOf2();
            case 9:
                isEmpty();
            case 10:
                join();
            case 11:
                lenght();
            case 12:
                replace();
            case 13:
                split();
            case 14:
                startsWith();
            case 15:
                strip();
            case 16:
                substring();
            case 17:
                substring2();
            case 18:
                tolowercase();
            case 19:
                touppercase();
        }
    }
    public static void contactoperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Der Contact-Operator verbindet Zwei Strings miteinander.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gebe ein zweites Wort / Satz ein:");
        String satz = scanner.nextLine();
        System.out.println(input + " " + satz);

    }
    public static void CharAt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt den Character (Buchstaben, Ziffern, Leerzeichen, Sonderzeichen, …) an der Position index im String an.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gib deinen Index an:");
        int input2 = scanner.nextInt();
        char charat = input.charAt(input2);
        System.out.println(charat);
    }
    public static void compareto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("= 0, falls str1 und str2 gleich sind\n" +
                "> 0, falls str1 alphabetisch größer ist als str2\n" +
                "< 0, falls str1 alphabetisch kleiner ist als str2\n" +
                "Groß-/Kleinschreibung wird beachtet");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gib einen zweiten Satz ein:");
        String input2 = scanner.nextLine();
        int compare = input.compareTo(input2);
        System.out.println(compare);
    }
    public static void contains() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("true, falls str im String enthalten ist, sonst false.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gib an was im String enthalten sein soll (ein Buchstabe oder ein Wort):");
        String input2 = scanner.nextLine();
        boolean contains = input.contains(input2);
        System.out.println(contains);
    }
    public static void endsWith() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt den booleschen Wert true zurück, falls der String mit der im Parameter str übergebenen Zeichenkette endet. Ansonsten wird false zurückgegeben.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gib an mit welchem Buchstaben das Array enden soll:");
        String input2 = scanner.nextLine();
        boolean endswith = input.endsWith(input2);
        System.out.println(endswith);
    }
    public static void equalss() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("true, wenn str1 und str2 gleich sind, sonst false");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gib einen Satz ein:");
        String input2 = scanner.nextLine();
        boolean equals = input.equals(input2);
        System.out.println(equals);
    }
    public static void indexOf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt die erste Position des Characters c im String an. Gibt es den Character nicht, liefert die Methode -1 zurück.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gib einen Buchstaben an:");
        String input2 = scanner.nextLine();
        int indexof = input.indexOf(input2);
        System.out.println(indexof);
    }
    public static void indexOf2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt die erste Position des Characters c im String an, die größer ist als index.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gebe einen Char an:");
        String c = scanner.nextLine();
        System.out.println("Gib einen Index an:");
        int index = scanner.nextInt();
        int indexof = input.indexOf(c,index);
        System.out.println(indexof);
    }
    public static void isEmpty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("true, wenn der String eine Länge von 0 hat, sonst false.");
        System.out.println("Gib einen Satz ein:");
        String input = scanner.nextLine();
        boolean empty = input.isEmpty();
        System.out.println(empty);
    }
    public static void join() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt einen String zurück, in dem alle Elemente des Arrays mit dem Delimiter (= Begrenzer) verbunden wurden.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String[] wörter = input.split(" ");
        for (String wort : wörter){
            System.out.println(wort);
        }
    }
    public static void lenght() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Gibt die Länge des Strings aus.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        int lenght = input.length();
        System.out.println(lenght);
    }
    public static void replace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt einen String zurück, bei dem alle Vorkommen von oldChar durch newChar ersetzt wurden.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gebe ein Buchstaben ein der Ersetzt werden soll:");
        String input2 = scanner.nextLine();
        System.out.println("Gib einen Buchstaben welcher eingesetzt werden soll:");
        String input3 = scanner.nextLine();
        String replace = input.replace(input2,input3);
        System.out.println(replace);
    }
    public static void split() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teilt den String überall da, wo der Delimiter gefunden wird, und gibt die einzelnen Strings in einem Array zurück.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String[] wörter = input.split(" ");
        for (String wort : wörter) {
            System.out.println(wort);
        }
    }
    public static void startsWith() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt den booleschen Wert true zurück, falls der String mit der im Parameter str übergebenen Zeichenkette beginnt. Ansonsten wird false zurückgegeben.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gebe ein Buchstaben ein mit welchem dein Satz beginnt:");
        String input2  =scanner.nextLine();
        boolean starswith = input.startsWith(input2);
        System.out.println(starswith);
    }
    public static void strip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt einen String zurück, bei dem alle Leerzeichen am Anfang und am Ende des Strings entfernt wurden. Leerzeichen in der Mitte bleiben erhalten. Der String selbst wird nicht verändert.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String strip = input.strip();
        System.out.println(strip);
    }
    public static void substring() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt einen String zurück, bei dem alle Leerzeichen am Anfang und am Ende des Strings entfernt wurden. Leerzeichen in der Mitte bleiben erhalten. Der String selbst wird nicht verändert.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gebe einen Index ein");
        int indx = scanner.nextInt();
        String substring = input.substring(indx);
        System.out.println(substring);
    }
    public static void substring2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt den Teilstring der bei Position from-idx beginnt und vor Position to-idx endet.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        System.out.println("Gebe Index an:");
        int idx = scanner.nextInt();
        System.out.println("Gebe Index an:");
        int idx2 = scanner.nextInt();
        String substring = input.substring(idx,idx2);
        System.out.println(substring);
    }
    public static void tolowercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt den String in Kleinbuchstaben zurück – der String selbst wird nicht verändert.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String lower = input.toLowerCase();
        System.out.println(lower);
    }
    public static void touppercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gibt den String in Großbuchstaben zurück – der String selbst wird nicht verändert.");
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String upper = input.toUpperCase();
        System.out.println(upper);
    }
}