package _15_Sichtbarkeit._15_Sichtbarkeit_Konto;

public class StandardVertrag {
    private String name;
    private int kontofuehrungsgebuehren;
    private double guthabenZinsen;
    private int darlehenZinsen;
    private double maxDarlehensSumme;
    private double maxAbhebebetrag;
    public StandardVertrag(String pName, int pKontofuehrungsgebueren, double pGuthabenZinsen, double pDarlehenZinsen, double pMaxDarlehensSumme, double pMaxAbhebebetrat){

    }

    public String getName() {
        return name;
    }

    public int getKontofuehrungsgebuehren() {
        return kontofuehrungsgebuehren;
    }

    public double getGuthabenZinsen() {
        return guthabenZinsen;
    }

    public int getDarlehenZinsen() {
        return darlehenZinsen;
    }

    public double getMaxDarlehensSumme() {
        return maxDarlehensSumme;
    }

    public double getMaxAbhebebetrag() {
        return maxAbhebebetrag;
    }

}
