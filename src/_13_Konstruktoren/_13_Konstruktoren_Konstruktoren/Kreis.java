package _13_Konstruktoren._13_Konstruktoren_Konstruktoren;

public class Kreis {
    public Punkt mittelpunkt;
    public int radius;

    public Kreis(int x1,int y1) {
        mittelpunkt = new Punkt(x1,y1);
        radius = 10;
    }

    public Kreis (Punkt pMittelpunkt) {
        mittelpunkt = new Punkt(pMittelpunkt.x, pMittelpunkt.y);
        radius = 10;
    }
}
