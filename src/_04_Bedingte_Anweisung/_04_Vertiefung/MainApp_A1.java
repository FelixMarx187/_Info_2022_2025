package _04_Bedingte_Anweisung._04_Vertiefung;

public class MainApp_A1 {
    public static void main(String[] args) {

        int x = 17;
        int y = 9;
        int z = x;

        boolean ergebnis;
        ergebnis = x > y; // ergebnis = true
        ergebnis = x >= y; // ergebnis = true
        ergebnis = x < y; // ergebnis = false
        ergebnis = x <= y; // ergebnis = false
        ergebnis = x == y; // ergebnis = false
        ergebnis = x == z; //ergebnis = true
        ergebnis = x != y; // ergebnis = true
        ergebnis = x != z; // ergebnis = false

        String str1 = "ABC";
        String str2 = "abc";

        boolean ergebnis1;
        ergebnis1 = str1.equals(str2); // ergebnis = false
        ergebnis1 = !str1.equals(str2); // ergebnis = true

        double x1 = -2.3;
        double y1 = 7.9;
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = x1 > y1;
        boolean b4 = x1 < y1;

        boolean ergebnis2;
        ergebnis2 = b1; // true
        ergebnis2 = b2; // false
        ergebnis2 = b3; // false
        ergebnis2 = b4; // true

        ergebnis2 = b1 && b3; //false
        ergebnis2 = b1 && b2; //false
        ergebnis2 = b2 && b3; //false

        ergebnis2 = (b1 || b2) && b3; //false
        ergebnis2 = !(b1 && b3) || !b4; //true

        String str11 = "Gymnasium";
        String str22 = "Hückelhoven";

        double ergebnis3;
        ergebnis3 = str11.compareTo(str22);
        ergebnis3 = str22.compareTo(str11);
        ergebnis3 = str11.compareTo(str11);
        ergebnis3 = str11.compareTo(str11);


        String str111 = "Gymnasium";
        String str222 = "Hückelhoven";

        int vergleich;
        boolean ergebnis4;

        vergleich = str111.compareTo(str222);
        ergebnis4 = vergleich > 0; //false
        ergebnis4 = vergleich < 0; //true
        ergebnis4 = vergleich == 0; //false
        ergebnis4 = vergleich != 0; //true

    }
}
