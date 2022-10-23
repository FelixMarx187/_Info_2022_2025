package _02_Datentypen_Variablen._02_Einfuehrung;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Hello World");
        String message = "Hallo Welt!";
        System.out.println(message);
        String word1 = "Hallo";
        String word2 = "Welt";
        System.out.println(word1 + word2);
        System.out.println(word1 + " " + word2 + "!!");
        String message2 = word1 + " " + word2 + "!!";
        System.out.println(message2);
        String message3;
        message3 = "Hello";
        System.out.println(message3);
        message3 = message3 + " World";
        System.out.println(message3);
        message3 += "!!";
        message3 = message3 + " World";
        String str1 = "A";
        char letter1 = 'A';
        System.out.println(str1);
        System.out.println(letter1);

        str1 = "ABC";
        letter1 = 'A';
        System.out.println(str1);
        System.out.println(letter1);
        System.out.println(17);
        System.out.println(17 + 4);
        System.out.println("17" + "4");
        int zahl1 = 17;
        System.out.println(zahl1);
        int zahl2 = 4;
        System.out.println(zahl1 + zahl2);
        System.out.println(zahl1 + " + " + zahl2 + " = " + zahl1 + zahl2);
        int ergebnis1 = zahl1 + zahl2;
        System.out.println(ergebnis1);
        int ergebnis2 = zahl1 - zahl2;
        System.out.println(ergebnis2);
        int ergebnis3 = zahl1 * zahl2;
        System.out.println(ergebnis3);
        int ergebnis4 = zahl1 / zahl2;
        System.out.println(ergebnis4);
        int ergebnis5 = zahl1 % zahl2;
        System.out.println(ergebnis5);
        zahl1 = 16;
        zahl2 = 4;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);

        zahl1++;
        ergebnis1 = zahl1 / zahl2;
        ergebnis2 = zahl1 % zahl2;
        System.out.print(zahl1 + "/" + zahl2 + "=" + ergebnis1 + "     ");
        System.out.println(zahl1 + "%" + zahl2 + "=" + ergebnis2);
        double ergebnis = 17 / 4;
        System.out.println(ergebnis);

        ergebnis = 17.0 / 4.0;
        System.out.println(ergebnis);
    }
}
