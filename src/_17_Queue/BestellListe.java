package _17_Queue;

public class BestellListe {
    private int bestellNummer;
    private double gesamtPreis;
    public BestellListe(int pBestellNummer, double pGesamtPreis) {
        this.bestellNummer = pBestellNummer;
        this.gesamtPreis = pGesamtPreis;
    }
    public String toString() {
        return "Bestellnummer: " + bestellNummer + "\n" + "Gesamtpreis: " + gesamtPreis + " €";
    }
}
