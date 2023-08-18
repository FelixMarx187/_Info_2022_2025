package _13_Konstruktoren._13_Konstruktoren_Konstruktoren;

public class MainApp {
    public static void main(String[] args) {
        //Punkt
        Punkt punkt = new Punkt(10,10);

        //Dreieck
        Dreieck dreieck = new Dreieck(20,10,10,20,20,10);
        //Kreis
        Kreis kreis = new Kreis(10,10);
        Kreis kreis1 = new Kreis(kreis.mittelpunkt);

        //Gerade
        Gerade gerade = new Gerade();
        gerade.p1 = new Punkt(10,10);
        gerade.p2 = new Punkt(20,20);

        //viereck
        Viereck viereck = new Viereck(10,10,20,20);
    }
}
