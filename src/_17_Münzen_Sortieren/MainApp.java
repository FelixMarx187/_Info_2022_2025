package _17_Münzen_Sortieren;

import LineareDatenstruktur.List;
import LineareDatenstruktur.Stack;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        List<Muenzen> listeEuroCent = new List<>();

        Stack<Integer> listeCent = new Stack<>();

        Stack<Integer> listeEuro = new Stack<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listeEuroCent.append(new Muenzen(random.nextBoolean()));
        }

        while (!listeEuroCent.isEmpty()) {

        }
    }
}
