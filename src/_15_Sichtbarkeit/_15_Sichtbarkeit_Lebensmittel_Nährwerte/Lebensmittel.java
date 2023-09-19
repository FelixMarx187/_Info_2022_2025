package _15_Sichtbarkeit._15_Sichtbarkeit_Lebensmittel_Nährwerte;

public class Lebensmittel {
    public String name;
    public Naehrwert naehrwert;
    public boolean istGesund;

    public Lebensmittel(Lebensmittel[] pArray, Naehrwert naehrwert, String pName, boolean pIstGesund, int pKilokalorien, double pFett, double pKohlenhydrate, double pEiweiss){
        this.name = pName;
        this.istGesund = pIstGesund;
    }

    public void LebensmittelListe(Lebensmittel[] pArray, Naehrwert naehrwert) {
        for (int i = 0; i < pArray.length; i++) {
            if (pArray[i] != null) {

            } else {
                System.out.println("Liste leer");
            }
        }
    }
}
