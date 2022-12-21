package _08_Mehrdimensionale_Arrays._08_Einfuehrung;

import java.util.Arrays;

public class MainApp_2 {
    public static void main(String[] args) {
        String[][] tabelle = new  String[10][5];

        int r = 0;
        while (r < tabelle.length) {
            int c = 0;
            String[] row = tabelle[r];
            while (c < row.length) {
                row[c] = "r" + Integer.toString(r) + "-c" + Integer.toString(c);
                c++;
            }
            r++;
        }
        System.out.println(Arrays.deepToString(tabelle));

        System.out.println();
        System.out.println("Speicheradresse von Tabelle[0] = " + tabelle[0]);
        String[] row0 = tabelle[0];
        System.out.println("Speicheradresse von row0 = tabelle[0] = " + row0);
    }
}
