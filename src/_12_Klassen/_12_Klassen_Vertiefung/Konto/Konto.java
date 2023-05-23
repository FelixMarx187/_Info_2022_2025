package _12_Klassen._12_Klassen_Vertiefung.Konto;

import java.util.Random;

public class Konto {
    private String inhaber;
    private int kontoNummer;
    private int kontoStand;
    private int kontoFuehrungsGebueren;
    private double guthabenZinsen;
    private int darlehenzinsen;
    private int maxDarlehensSumme;

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public int getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(int kontoStand) {
        this.kontoStand = kontoStand;
    }

    public int getKontoFuehrungsGebueren() {
        return kontoFuehrungsGebueren;
    }

    public void setKontoFuehrungsGebueren(int kontoFuehrungsGebueren) {
        this.kontoFuehrungsGebueren = kontoFuehrungsGebueren;
    }

    public double getGuthabenZinsen() {
        return guthabenZinsen;
    }

    public void setGuthabenZinsen(double guthabenZinsen) {
        this.guthabenZinsen = guthabenZinsen;
    }

    public int getDarlehenzinsen() {
        return darlehenzinsen;
    }

    public void setDarlehenzinsen(int darlehenzinsen) {
        this.darlehenzinsen = darlehenzinsen;
    }

    public int getMaxDarlehensSumme() {
        return maxDarlehensSumme;
    }

    public void setMaxDarlehensSumme(int maxDarlehensSumme) {
        this.maxDarlehensSumme = maxDarlehensSumme;
    }

    public int getMaxAbhebeBetrag() {
        return maxAbhebeBetrag;
    }

    public void setMaxAbhebeBetrag(int maxAbhebeBetrag) {
        this.maxAbhebeBetrag = maxAbhebeBetrag;
    }

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
