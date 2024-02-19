package _0_Package._0_Facharbeit;

public class Auto {
    private String marke;
    private String modell;
    private int baujahr;

    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public void fahren() {
        System.out.println("Der/Die/Das " + marke + " " + modell + " (" + baujahr + ") " + "fährt");
    }

}
