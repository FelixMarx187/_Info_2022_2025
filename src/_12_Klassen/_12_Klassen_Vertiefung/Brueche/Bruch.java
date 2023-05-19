package _12_Klassen._12_Klassen_Vertiefung.Brueche;

public class Bruch {
    public int zaehler;
    public int nenner;
    public int faktor;
    public int zaehler2;
    public int nenner2;

    public Bruch(int zaehler, int nenner, int faktor, int zaehler2, int nenner2) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.faktor = faktor;
        this.zaehler2 = zaehler2;
        this.nenner2 = nenner2;
    }
    public double berechnen() {
        return (double) zaehler / nenner;
    }

    public String getString() {
        return zaehler + "/" + nenner;
    }

    public String erweitern() {
        return faktor * zaehler + "/" + faktor * nenner;
    }
    public boolean kuerzen() {
        return zaehler % nenner == 0;
    }
    public String addieren() {
        int nenner1_1_2_2 = nenner * nenner2;
        int zaehler1_1 = zaehler * nenner2;
        int zaehler2_2 = zaehler2 * nenner;
        int ergebnisZaehler = zaehler1_1 + zaehler2_2;
        return ergebnisZaehler + "/" + nenner1_1_2_2;
    }
    public String multiplizieren() {
        return zaehler * zaehler2 + "/" + nenner * nenner2;
    }
}
