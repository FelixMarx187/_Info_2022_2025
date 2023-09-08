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

    public boolean isStandardVertrag() {
        return standardVertrag;
    }

    public boolean isGesperrt() {
        return gesperrt;
    }

    private int alter;
    private int kontoNummer;
    private int kontoStand;
    private boolean standardVertrag;
    private boolean gesperrt;

    public Konto(String pInhaber,int pAlter) {
        StandardVertrag standardVertrag = new StandardVertrag();
        Random random = new Random();
        this.inhaber = pInhaber;
        this.alter = pAlter;
        if (pAlter < 18) {
            this.standardVertrag = false;
            standardVertrag.juniorVertrag();
        } else {
            this.standardVertrag = true;
            standardVertrag.standardVertrag();
        }
        this.kontoNummer = random.nextInt(10000000,100000000);
        this.kontoStand = 0;
        this.gesperrt = false;
    }
}
