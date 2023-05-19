package _12_Klassen._12_Klassen_Vertiefung.Brüche;

public class Bruch {
    public double berechnen(int pZaehler, int pNenner) {
        return pZaehler / pNenner;
    }
    public String getString(int pZaehler, int pNenner) {
        return pZaehler + "/" + pNenner;
    }
    public String erweitern(int faktor, int pZaehler, int pNenner) {
        return faktor * pZaehler + "/" + faktor * pNenner;
    }
    public boolean gekuerzt(int faktor, int pZaehler, int pNenner) {
        boolean gekürzt = false;
        if (pZaehler % faktor == 0 && pNenner % faktor == 0) {
            gekürzt = true;
        }
        return gekürzt;
    }
}
