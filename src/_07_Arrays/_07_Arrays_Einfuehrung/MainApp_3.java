package _07_Arrays._07_Arrays_Einfuehrung;

public class MainApp_3 {
    public static void main(String[] args) {

        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};

        System.out.println(farben.length);
        int i = 0;
        while (i < farben.length) {
            System.out.println("Farben " + i + " = " + farben[i]);
            i++;
        }
    }
}
