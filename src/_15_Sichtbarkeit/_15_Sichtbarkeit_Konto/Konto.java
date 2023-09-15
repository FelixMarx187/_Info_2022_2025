package _15_Sichtbarkeit._15_Sichtbarkeit_Konto;

import java.util.Random;

public class Konto {
    private String inhaber;

    public String getInhaber() {
        return inhaber;
    }

    public int getAlter() {
        return alter;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public int getKontoStand() {
        return kontoStand;
    }

    public boolean isGesperrt() {
        return gesperrt;
    }

    private int alter;
    private int kontoNummer;

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public void setKontoStand(int kontoStand) {
        this.kontoStand = kontoStand;
    }

    private int kontoStand;
    private boolean gesperrt = false;

    public Konto(String pInhaber,int pAlter) {
        StandardVertrag standardVertrag = new StandardVertrag();
        Random random = new Random();
        this.inhaber = pInhaber;
        this.alter = pAlter;
        if (pAlter < 18) {
            standardVertrag.juniorVertrag();
        } else {
            standardVertrag.standardVertrag();
        }
        this.gesperrt = false;
    }
}
