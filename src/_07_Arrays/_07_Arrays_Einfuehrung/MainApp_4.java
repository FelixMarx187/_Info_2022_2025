package _07_Arrays._07_Arrays_Einfuehrung;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp_4 {
    public static void main(String[] args) {
        String[] farben = {"Karo", "Pik", "Kreuz", "Herz"};

        System.out.println(Arrays.toString(farben));
        Arrays.sort(farben);
        System.out.println(Arrays.toString(farben));

    }
}
