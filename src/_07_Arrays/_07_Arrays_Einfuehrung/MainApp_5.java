package _07_Arrays._07_Arrays_Einfuehrung;

public class MainApp_5 {
    public static void main(String[] args) {
        String[] farben = {"Karo", "Pik", "Kreuz", "Herz"};
        String[] bilder = {"7", "8", "9", "10", "Bauer", "Dame", "König", "As"};

        int i = 0;
        while (i < bilder.length) {
            String bild = bilder[i];
            int value = Integer.parseInt(bild);
            System.out.println(bild + " hat den Wert " + value);
            i++;
        }
    }
}
