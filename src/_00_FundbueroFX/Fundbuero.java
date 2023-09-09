package _00_FundbueroFX;

public class Fundbuero {
    public static String Fundstueck;
    public static String Fundort;
    public static String Datum;
    public static String finderName;
    public static String finderAdresse;
    public static int preisSchaetzung;

    public Fundbuero(String pFundstueck, String pFundort, String pDatum, String pFinderName, String pFinderAdresse, int pPreisSchaetzung) {
        Fundstueck = pFundstueck;
        Fundort = pFundort;
        Datum = pDatum;
        finderName = pFinderName;
        finderAdresse = pFinderAdresse;
        preisSchaetzung = pPreisSchaetzung;
    }
}
