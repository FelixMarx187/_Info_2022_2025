package _07_Arrays._07_Arrays_Einfuehrung;

public class MainApp_A6 {
    public static void main(String[] args) {

        String[] farben = {"Karo", "Pik", "Kreuz", "Herz"};
        String[] bilder = {"7", "8", "9", "10", "Bauer", "Dame", "König", "As"};

        int i = 0;
        while (i < bilder.length) {
            String bild = bilder[i];
            int value = 0;
            if (bild.equals("Bauer") || bild.equals("Dame") || bild.equals("König")) {
                value = 10;
            } else if (bild.equals("As")) {
                value = 11;
            } else {
                value = Integer.valueOf(bild);
            }
            System.out.println(bild + " hat den Wert " + value);
            i++;
        }
    }
}
