package _15_Konto_Lösungen;

import java.text.DecimalFormat;
import java.util.Random;

public class Konto {
    // Startwerte beim Anlegen eines Kontos
    private final String inhaber;
    private final int kontonummer;
    private double kontostand;
    private final Vertrag vertrag;
    private boolean istGesperrt;

    public Konto(Vertrag pVertrag, String pInhaber) {
        this.inhaber = pInhaber;
        kontonummer = erzeugeKontonummer();
        this.vertrag = pVertrag;
        istGesperrt = false;
    }

    private int erzeugeKontonummer() { // Die Methode gibt eine zufällige 8-stellige Kontonummer zurück.
         return new Random().nextInt(10000000, 99999999);
    }

    // Ein Konto kann testen, ob man von ihm abheben kann
    public boolean kannAbheben(double pAbhebesumme) { // Prüft, ob die Abhebesumme abgehoben werden kann.
        boolean kannAbheben = true;
        if (this.istGesperrt) {
            System.out.println("Ihr Konto ist gesperrt!");
            kannAbheben = false;
        } else if (pAbhebesumme > vertrag.getMaxAbhebebetrag()) {
            System.out.println("Der maximale Abhebebetrag wurde überschritten!");
            kannAbheben = false;
        } else if (this.kontostand + vertrag.getMaxDarlehnssumme() < pAbhebesumme) {
            System.out.println("Ihr Guthaben und die maximale Darlehenssumme reichen zum Abheben nicht aus!");
            kannAbheben = false;
        }
        return kannAbheben;
    }

    public void abheben(double pAbhebesumme) { // Hebt die Abhebesumme ab, wenn sie abgehoben werden kann.
        if (kannAbheben(pAbhebesumme)) {
            this.kontostand -= pAbhebesumme;
        }
    }

    public void einzahlen(double pBetrag) { // Zahlt den Betrag ein, wenn das Konto nicht gesperrt ist.
        if (this.istGesperrt) {
            System.out.println("Konto ist gesperrt.");
        } else {
            this.kontostand += pBetrag;
        }
    }

    // Die Methode berechnet die Gebühren, rechnet sie auf das Konto an und gibt den Kontostand zurück.
    public void gebuehrenErheben() {
        double guthaben;
        if (this.kontostand > 0) {
            guthaben = this.kontostand;
        } else guthaben = 0;

        double darlehen;
        if (this.kontostand < 0) {
            darlehen = -this.kontostand;
        } else darlehen = 0;

        double kontofuehrung = vertrag.getKontofuehrungsgebuehren();
        double guthabenzinsen = guthaben * vertrag.getGuthabenzinsen();
        double darlehenszinsen = darlehen * vertrag.getGuthabenzinsen();
        double gebuehren = kontofuehrung - guthabenzinsen + darlehenszinsen;
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.printf("Monatliche Gebühren in Höhe von %s € wurden erhoben!\n", df.format(gebuehren));
        System.out.println("Im Einzelnen: ");
        System.out.println("\tKontoführung:\t\t" + df.format(kontofuehrung) + " €");
        System.out.println("\tGuthabenzinsen:\t\t" + df.format(guthabenzinsen) + " €");
        System.out.println("\tDarlehenszinsen:\t" + df.format(darlehenszinsen) + " €");
        this.kontostand -= gebuehren;
    }

    public void detailsAnzeigen() {
        System.out.println("Konto:");
        System.out.println("\tKontoinhaber:\t" + inhaber);
        System.out.println("\tKontostand:\t\t" + kontostand);
        System.out.println("\tKontonummer:\t" + kontonummer);
        System.out.println("\tGesperrt:\t\t" + istGesperrt);
        vertrag.detailsAnzeigen();
    }

    // Getter
    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    // Setter
    public void setKontostand(double pKontostand) {
        this.kontostand = pKontostand;
    }

    public void setIstGesperrt(boolean pIstGesperrt) {
        this.istGesperrt = pIstGesperrt;
    }
}
