package _06_While_Schleifen._06_Vertiefung;

public class MainApp_A1 {
    public static void main(String[] args) {

        boolean run = true;
        do {
            int counter = 0;
            int value = 0;
            do {
                int faktor = value * 7;
                System.out.println(counter + " :" + faktor);
                counter++;
                value++;
            } while (counter < 101 && value < 701); {
                System.out.println("Das sind die ersten 100 Vielfachen von sieben!");
                run = false;
            }
        } while (run);
    }
}
