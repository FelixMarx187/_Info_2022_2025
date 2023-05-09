package _10_For_Schleifen._10_For_Schleifen_Vertiefung;

//Einmaleins
public class MainApp_A4 {
    public static void main(String[] args) {
        System.out.println("Kleines Einmaleins:");
        kleineseinmaleins();
        System.out.println("Großes Einmaleins:");
        großeseinmaleins();

    }

    public static void kleineseinmaleins() {
        int ergebnis = 0;
        int j = 1;
        for (int i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                ergebnis = i * j;
                System.out.println(i + " x " + j + " = "+ergebnis);
            }
        }
    }
    public static void großeseinmaleins() {
        int ergebnis = 0;
        int j = 1;
        for (int i = 10; i <= 100; i++) {
            for (j = 1; j <= 10; j++) {
                ergebnis = i * j;
                System.out.println(i + " x " + j + " = "+ergebnis);
            }
        }
    }

}
