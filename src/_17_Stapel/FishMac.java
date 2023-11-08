package _17_Stapel;

public class FishMac {
    private String name;
    private double preis;
    private int kcal;
    private int rating;

    public FishMac(String pName,double pPreis, int pKcal, int pRating) {
        this.name = pName;
        this.preis = pPreis;
        this.kcal = pKcal;
        this.rating = pRating;
    }
    public String toString() {
        return "Name: "+name+"\nPreis: " + preis+" €" + "\nKalorien: " + kcal + "\nRating: " + rating + "/10";
    }
}
