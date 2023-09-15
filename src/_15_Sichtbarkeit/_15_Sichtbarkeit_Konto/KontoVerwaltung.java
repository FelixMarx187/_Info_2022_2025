package _15_Sichtbarkeit._15_Sichtbarkeit_Konto;

public class KontoVerwaltung {
    private int kontostand;
    private int kontonummer;

    public void kontoLogin(Konto konto,Konto[] pKontoArray,int pKontonummer) {
        for (int i = 0; i < pKontoArray.length; i++) {
            pKontoArray[i] = konto;
            if (konto.getKontoNummer() == kontonummer){
                System.out.println("Hallo, " + konto.getInhaber());
            }
        }
        System.out.println("| Kontonummer: " + pKontonummer + " |");
    }
}
