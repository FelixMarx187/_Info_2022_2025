package _10_For_Schleifen._10_For_Schleifen_Einfuehrung;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------");

        for (int j = 0; j < 10; j = j + 2) {
            System.out.println(j);
        }

        System.out.println("-----------------------------------------------");

        for (int k = 0; k >= 0; k--) {
            System.out.println(k);
        }

        System.out.println("-----------------------------------------------");

        int[] zahlen = new int[10];
        for (int z = 0; z < zahlen.length; z++) {
            zahlen[z]= z;
        }
        System.out.println(Arrays.toString(zahlen));

        System.out.println("-----------------------------------------------");

        String[][] tabelle = new String[5][4];
        for (int r= 0; r< tabelle.length; r++) {
            String[] row = tabelle[r];
            for (int c = 0;c < row.length; c++){
                tabelle[r][c] = String.valueOf(r) + "_"+ String.valueOf(c);
            }
        }
        System.out.println(Arrays.deepToString(tabelle));

        System.out.println("-----------------------------------------------");

        for (int x = 0; x < 100; x++) {
            if (x == 15)
                break;
            System.out.println(x);
        }

        System.out.println("-----------------------------------------------");

        String[][] tabelle2 = new String[5][4];
        for (int r = 0; r < tabelle.length; r++) {
            String[] row = tabelle[r];
            for (int c = 0; c < row.length; c++) {
                tabelle[r][c] = String.valueOf(r) + "_" + String.valueOf(c);
                if (r == c)
                    break;
            }
        }
        System.out.println(Arrays.deepToString(tabelle));

        System.out.println("-----------------------------------------------");

        String[] moebel = new String[5];
        moebel[0] = "Tisch";
        moebel[1] = "Stuhl";
        moebel[2] = "Sofa";
        moebel[3] = "Bett";
        moebel[4] = "Schrank";

        for (String item : moebel) {
            System.out.println(item);
        }

        System.out.println("-----------------------------------------------");

        String[] moebel2 = new String[5];
        moebel[0] = "Tisch";
        moebel[1] = "Stuhl";
        moebel[2] = "Sofa";
        moebel[3] = "Bett";
        moebel[4] = "Schrank";

        System.out.println("Meine Möbel:");
        for (String item : moebel) {
            if (item.equals("Bett"))
                break;

            System.out.println(item);
        }
        System.out.println("Mehr hab ich nicht.");

        System.out.println("-----------------------------------------------");

    }
}
