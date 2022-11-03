package _07_Arrays._07_Arrays_Einfuehrung;

import java.util.Arrays;

public class MainApp_1 {
    public static void main(String[] args) {

        String[] farben = new String[4];
        farben[0] = "Herz";
        farben[1] = "Karo";
        farben[2] = "Pik";
        farben[3] = "Kreuz";

        System.out.println("----Einzelne Array ausgeben----");
        System.out.println(farben[0]);
        System.out.println(farben[1]);
        System.out.println(farben[2]);
        System.out.println(farben[3]);
        System.out.println();

        System.out.println("----System.out.println(farben)----");
        System.out.println(farben);
        System.out.println();

        System.out.println("----System.out.println(Arrays.toString(farben))----");
        System.out.println(Arrays.toString(farben));
        System.out.println();

    }
}
