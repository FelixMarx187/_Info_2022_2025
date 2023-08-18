package _13_Konstruktoren._13_Konstruktoren_Konstruktoren;

public class Viereck {
    public Punkt obenlinks;
    public int hoehe;
    public int breite;

    public Viereck(int pX, int pY, int pHoehe, int pBreite ) {
        obenlinks = new Punkt(pX, pY);
        hoehe = pHoehe;
        breite = pBreite;
    }
}
