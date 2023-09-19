package _15_Sichtbarkeit._15_Sichtbarkeit_Lebensmittel_Nährwerte;

public class Naehrwert {
    public int getKilokalorien() {
        return kilokalorien;
    }

    public void setKilokalorien(int kilokalorien) {
        this.kilokalorien = kilokalorien;
    }

    public double getFett() {
        return fett;
    }

    public void setFett(double fett) {
        this.fett = fett;
    }

    public double getKohlenhydrate() {
        return kohlenhydrate;
    }

    public void setKohlenhydrate(double kohlenhydrate) {
        this.kohlenhydrate = kohlenhydrate;
    }

    public double getEiweiss() {
        return Eiweiss;
    }

    public void setEiweiss(double eiweiss) {
        Eiweiss = eiweiss;
    }

    private int kilokalorien;
    private double fett;
    private double kohlenhydrate;
    private double Eiweiss;
}
