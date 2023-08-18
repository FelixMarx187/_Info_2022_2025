package _13_Konstruktoren._13_Konstruktoren_Konstruktoren;

public class Dreieck {
    public Punkt p1;
    public Punkt p2;
    public Punkt p3;

    public Dreieck(Dreieck pDreieck) { //copy Konstruktor
        p1 = pDreieck.p1;
        p2 = pDreieck.p2;
        p3 = pDreieck.p3;
    }

    public Dreieck(int x1, int y1, int x2, int y2, int x3, int y3) { //Konstruktor
        p1 = new Punkt(x1, y1);
        p2 = new Punkt(x2, y2);
        p3 = new Punkt(x3, y3);
    }
}
