package _01_Arbeit.PolizeiKontrolle;

import LineareDatenstruktur.List;
import LineareDatenstruktur.Queue;

public class MainApp {
    private List<Fahrzeug> fahrzeugSchaeden = new List<>();

    private static Queue<Fahrzeug> fließverkehr = new Queue<>();
    private static Queue<Fahrzeug> parkBucht = new Queue<>();
    public static void main(String[] args) {
        fließverkehr.enqueue(new Fahrzeug("NRW","WV", false));
        
    }

    public static void HerausWinken() {

    }
}
