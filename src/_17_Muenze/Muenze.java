package _17_Muenze;

import java.util.Random;

public class Muenze {
    private boolean Cent;
    private boolean Euro;

    private int WertCent;
    private double WertEuro;

    public Muenze(boolean isCent, boolean isEuro) {
        if (isCent == true) {
            this.WertCent = new Random().nextInt(1,101);
        } else if (isEuro == true) {

        } else if (isCent == true && isEuro == true) {
            boolean random = new Random().nextBoolean();
            if (random == true) {

            } else {

            }
        }
    }
}
