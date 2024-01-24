package Q1_ArbeitsAufgabe_Herauswinken;
import LineareDatenstruktur.Queue;
import LineareDatenstruktur.List;

import java.util.Random;

public class MainApp {
    private static Queue<Autos> Fließverkehr = new Queue<>();
    private static Queue<Autos> Haltenbucht = new Queue<>();

    private List<Autos> maengelFahrzeuge = new List<>();
    public static void main(String[] args) {

    }
    public void FließverkehrFuellen() {
        for (int i = 0; i < 100; i++) {
            String marke = "";
            int ascii = new Random().nextInt(56,91);
            char randomChar = (char) ascii;
            int number = new Random().nextInt(1,5);
            switch (number) {
                case 1:
                    marke = "Audi";
                case 2:
                    marke = "Mercedes";
                case 3:
                    marke = "Fiat";
                case 4:
                    marke = "Toyota";
                case 5:
                    marke = "Ford";
            }
            Fließverkehr.enqueue(new Autos(randomChar,marke, new Random().nextBoolean()));
        }
    }

    public static void herauswinken() {
        while (!Fließverkehr.isEmpty()) {
            Haltenbucht.enqueue(Fließverkehr.front());
            Fließverkehr.dequeue();
        }
    }
    public static void HaltebuchtAusloesen() {
        while (!Haltenbucht.isEmpty()) {
            Fließverkehr.enqueue(Haltenbucht.front());
            Haltenbucht.dequeue();
        }
    }
    public void maengelFahrzeugeProtokollieren() {
        if (Haltenbucht.front().getSchaeden() == true) {
            maengelFahrzeuge.append(Haltenbucht.front());
        } else if (Haltenbucht.front().getSchaeden() == false) {
            
        }
    }
}
