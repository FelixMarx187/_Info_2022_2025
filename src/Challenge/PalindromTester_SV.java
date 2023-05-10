package Challenge;

import java.util.Locale;

/*
Ein Palindrom ist ein Wort, Satz, eine Zahl oder irgendeine Aneinanderreihung von Zeichen, die von
vorne oder hinten gelesen gleich ist.

Aufgabenstellung:
  - Schreibe einen Palindrom-Tester.
  - Schreibe dazu die Methode istPalindrom, die eine Zeichenlette entgegennimmt.
  - Löse die Aufgabe auf unterschiedliche Weise, aber mindestens mit diesen drei String-Methoden:
    - chatAt()
    - compareTo()
    - equals()
  - Du kannst alle Methoden in einer Klasse schreiben, indem du sie entsprechend benennst, z. B.
    - istPalindrom_charAt
    - istPalindrom_compareTo
    - istPalindrom_equals
Tipp:
  - Benutze der Einfachheit halber eine while-Schleife.
  - Wandle das Eingabewort in Klein- oder Großbuchstaben um.
  - Entferne alle Leerzeichen.
 */
public class PalindromTester_SV {


    public static void main(String[] args) {
        // TestStrings
        String[] testStringArray = {"Tim", "Anna", "012210", "Trug Tim eine so helle Hose nie mit Gurt","Amok Oma"};

        // Test für charAt()
        System.out.println("#####################################");
//        System.out.println("Test für Methode charAt()");
        System.out.println(testStringArray[0] + ": " + istPalindrom_charAt(testStringArray[0]));
        System.out.println(testStringArray[1] + ": " + istPalindrom_charAt(testStringArray[1]));
        System.out.println(testStringArray[2] + ": " + istPalindrom_charAt(testStringArray[2]));
        System.out.println(testStringArray[3] + ": " + istPalindrom_charAt(testStringArray[3]));
        System.out.println(testStringArray[4] + ": " + istPalindrom_charAt(testStringArray[4]));
        System.out.println("#####################################");

        System.out.println("\n-------------------------------------\n");

        // Test für compareTo()
        System.out.println("#####################################");
        System.out.println("Test für Methode compareTo()");
//        System.out.println(testStringArray[0] + ": " + istPalindrom_compareTo(testStringArray[0]));
//        System.out.println(testStringArray[1] + ": " + istPalindrom_compareTo(testStringArray[1]));
//        System.out.println(testStringArray[2] + ": " + istPalindrom_compareTo(testStringArray[2]));
//        System.out.println(testStringArray[3] + ": " + istPalindrom_compareTo(testStringArray[3]));
        System.out.println("#####################################");

        System.out.println("\n-------------------------------------\n");

        // Test für equals()
        System.out.println("#####################################");
        System.out.println("Test für Methode equals()");
//        System.out.println(testStringArray[0] + ": " + istPalindrom_equals(testStringArray[0]));
//        System.out.println(testStringArray[1] + ": " + istPalindrom_equals(testStringArray[1]));
//        System.out.println(testStringArray[2] + ": " + istPalindrom_equals(testStringArray[2]));
//        System.out.println(testStringArray[3] + ": " + istPalindrom_equals(testStringArray[3]));
        System.out.println("#####################################");
    }

    public static boolean istPalindrom_charAt(String pText) {
        boolean istPalindrom = true;
        pText = pText.toLowerCase();
        pText = pText.replace(" ", "");
            for (int i = 0; i < pText.length()/2; i++) {
                if (pText.charAt(i) != pText.charAt(pText.length()-1-i)) {
                    istPalindrom = false;
                }
            }
            return istPalindrom;
    }
}