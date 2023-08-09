package _12_Klassen._12_Klassen_Vertiefung.Konto_und_Kontoverwaltung;

import java.util.Random;

public class Konto {
    private String inhaber;
    private int kontoNummer;
    private int kontoStand;

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void setKontoNummer() {
        this.kontoNummer = new Random().nextInt(99999999);
    }

    public void setKontoStand(int kontoStand) {
        this.kontoStand = kontoStand;
    }
    public String getInhaber() {
        return inhaber;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public int getKontoStand() {
        return kontoStand;
    }
}
