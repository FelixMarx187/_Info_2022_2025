package _15_Sichtbarkeit._15_Sichtbarkeit_Konto;

public class StandardVertrag {
    private String name;
    private int kontofuehrungsgebuehren;
    private double guthabenZinsen;
    private int darlehenZinsen;
    private int maxDarlehensSumme;
    private int maxAbhebebetrag;

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

    public int getMaxDarlehensSumme() {
        return maxDarlehensSumme;
    }

    public int getMaxAbhebebetrag() {
        return maxAbhebebetrag;
    }

    public void standardVertrag(){
        this.name = "Standard Vertrag";
        this.kontofuehrungsgebuehren = 5;
        this.guthabenZinsen = 0.5;
        this.darlehenZinsen = 10;
        this.maxDarlehensSumme = 1000;
        this.maxAbhebebetrag = 2000;
    }

    public void juniorVertrag(){
        this.name = "Junior Vertrag";
        this.kontofuehrungsgebuehren = 0;
        this.guthabenZinsen = 1.5;
        this.darlehenZinsen = 0;
        this.maxDarlehensSumme = 0;
        this.maxAbhebebetrag = 500;
    }
}
