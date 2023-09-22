package _15_Konto_Neu;

public class Vertrag {
    public String getName() {
        return name;
    }

    public int getKontofuehrungsGebueren() {
        return kontofuehrungsGebueren;
    }

    public double getGuthabenZinsen() {
        return guthabenZinsen;
    }

    public double getDarlehenZinsen() {
        return darlehenZinsen;
    }

    public int getMaxDarlehensSumme() {
        return maxDarlehensSumme;
    }

    public int getMaxAbhebeSumme() {
        return maxAbhebeSumme;
    }

    private String name;
    private int kontofuehrungsGebueren;
    private double guthabenZinsen;
    private double darlehenZinsen;
    private int maxDarlehensSumme;
    private int maxAbhebeSumme;

    public Vertrag(String pName, int pKontofuehrungsGebueren, double pGuthabenZinsen, double pDarlehenZinsen, int pMaxDarlehensSumme, int pMaxAbhebenSumme){
        this.name = pName;
        this. kontofuehrungsGebueren = pKontofuehrungsGebueren;
        this.guthabenZinsen = pGuthabenZinsen;
        this.darlehenZinsen = pDarlehenZinsen;
        this.maxDarlehensSumme = pMaxDarlehensSumme;
        this.maxAbhebeSumme = pMaxAbhebenSumme;
    }
}
