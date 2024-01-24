package Q1_ArbeitsAufgabe_Herauswinken;

public class Autos {
    private char kennzeichen;
    private String Marke;
    private boolean hatSchäden;

    public Autos(char kennzeichen, String marke, boolean pHatSchaeden) {
        this.kennzeichen = kennzeichen;
        Marke = marke;
    }
    public boolean getSchaeden() {
        return hatSchäden;
    }
    public String getMarke() {
        return Marke;
    }
    public char getKennzeichen() {
        return kennzeichen;
    }
}
