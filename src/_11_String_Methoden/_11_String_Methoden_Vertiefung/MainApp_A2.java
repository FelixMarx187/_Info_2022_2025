package _11_String_Methoden._11_String_Methoden_Vertiefung;

import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Welche Methode willst du verwenden? \nConcat-Operator[1] \nCharAt[2] \ncompareTo[3] \ncontains[4] \nendsWith[5] \nequals[6] \nindexOf[7] \nindexOf2.0[8] \nisEmpty[9] \njoin[10] \nlength[11] \nreplace[12] \nsplit \nstartsWith \nstrip \nsubstring \nsubstring2.0 \ntoLowerCase \ntoUpperCase");
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

    }

    public static void equalss() {

    }

    public static void indexOf() {

    }

    public static void indexOf2() {

    }

    public static void isEmpty() {

    }

    public static void join() {

    }

    public static void lenght() {

    }

    public static void replace() {

    }

    public static void split() {

    }

    public static void startsWith() {

    }

    public static void strip() {

    }

    public static void substring() {

    }

    public static void substring2() {

    }

    public static void tolowercase() {

    }

    public static void touppercase() {

    }
}

