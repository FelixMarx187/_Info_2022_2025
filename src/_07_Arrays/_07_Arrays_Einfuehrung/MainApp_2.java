package _07_Arrays._07_Arrays_Einfuehrung;

public class MainApp_2 {
    public static void main(String[] args) {

        String[] farben = new String[4];
        farben[0] = "Herz";
        farben[1] = "Karo";
        farben[2] = "Pik";
        farben[3] = "Kreuz";

        System.out.println(farben.length);
        int i = 0;
        while (i < farben.length) {
            System.out.println("Farbe " + i + " = " + farben[i]);
            i++;
        }

    }
}
