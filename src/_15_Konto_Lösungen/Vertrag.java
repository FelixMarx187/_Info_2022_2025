package _15_Konto_Lösungen;

public class Vertrag {
    private final String name;
    private final double kontofuehrungsgebuehren;
    private final double guthabenzinsen;
    private final double darlehnszinsen;
    private final double maxDarlehnssumme;
    private final double maxAbhebebetrag;

    public Vertrag(String pName, double pKontofuehrungsgebuehren, double pGuthabenzinsen, double pDarlehnszinsen, double pMaxDarlehnssumme, double pMaxAbhebebetrag) {
        this.name = pName;
        this.kontofuehrungsgebuehren = pKontofuehrungsgebuehren;
        this.guthabenzinsen = pGuthabenzinsen;
        this.darlehnszinsen = pDarlehnszinsen;
        this.maxDarlehnssumme = pMaxDarlehnssumme;
        this.maxAbhebebetrag = pMaxAbhebebetrag;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getKontofuehrungsgebuehren() {
        return kontofuehrungsgebuehren;
    }

    public double getGuthabenzinsen() {
        return guthabenzinsen;
    }

    public double getDarlehnszinsen() {
        return darlehnszinsen;
    }

    public double getMaxDarlehnssumme() {
        return maxDarlehnssumme;
    }

    public double getMaxAbhebebetrag() {
        return maxAbhebebetrag;
    }

    public void detailsAnzeigen() {
        System.out.println("Vertrag:");
        System.out.println("\tArt:\t\t\t\t" + this.getName());
        System.out.println("\tGebühren:\t\t\t" + this.getKontofuehrungsgebuehren());
        System.out.println("\tGuthabenzinsen:\t\t" + this.getGuthabenzinsen());
        System.out.println("\tDarlehenszinsen:\t" + this.getDarlehnszinsen());
        System.out.println("\tMax. Darlehnssumme:\t" + this.getMaxDarlehnssumme());
        System.out.println("\tMax. Abhebebetrag:\t" + this.getMaxAbhebebetrag() + "\n");
    }
}
