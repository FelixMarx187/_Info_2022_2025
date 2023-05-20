package _12_Klassen._12_Klassen_Vertiefung.Konto;

import java.util.Random;

public class Konto {
    public String inhaber;
    public int kontoNummer;
    public int kontoStand;
    public int kontoFuehrungsGebueren;
    public double guthabenZinsen;
    public int darlehenzinsen;
    public int maxDarlehensSumme;
    public int maxAbhebeBetrag;


    public Konto(String pInhaber, int pKontoStand) {
        Random random = new Random();
        this.inhaber = pInhaber;
        this.kontoStand = pKontoStand;
        this.kontoFuehrungsGebueren = 5;
        this.guthabenZinsen = 0.01;
        this.darlehenzinsen = 10;
        this.maxDarlehensSumme = 1000;
        this.maxAbhebeBetrag = 2000;
        this.kontoNummer = random.nextInt(99999999);
    }
}
