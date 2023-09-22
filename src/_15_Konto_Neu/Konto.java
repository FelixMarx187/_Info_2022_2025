package _15_Konto_Neu;

import _15_Sichtbarkeit._15_Sichtbarkeit_Konto.StandardVertrag;

public class Konto {
    private String inhaber;
    private int alter;
    private int kontonummer;
    private double kontostand;
    private boolean istGesperrt;

    public Konto(String pInhaber, int pAlter){
        this.inhaber = pInhaber;
        this.alter = pAlter;
        //Kontonummer
        this.kontostand = 0;
        //Vertrag
        if (pAlter < 18) {
            StandardVertrag standardVertrag = new StandardVertrag("Junior Vertrag",0,1.5,0,0,500);
        } else if (pAlter > 18){
            StandardVertrag standardVertrag = new StandardVertrag("Standard Vertrag",5,0.5,10.0,1000,2000);
        }
        this.istGesperrt = false;
    }
}
