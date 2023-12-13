package _17_Münzen_Sortieren;

import java.util.Random;

public class Muenzen {
    public Muenzen(boolean euro) {
        this.euro = euro;
        if (euro == true) {
            wert = new Random().nextInt(1, 3);
        } else {

        }
    }

    private boolean euro;
    private int wert;

}
