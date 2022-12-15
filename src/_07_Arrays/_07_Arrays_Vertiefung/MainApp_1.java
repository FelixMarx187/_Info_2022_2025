package _07_Arrays._07_Arrays_Vertiefung;

public class MainApp_1 {
    public static void main(String[] args) {

        int[] primzahlen = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; //Int Array wird Deklariert
        double[] temperaturen = {7.9, 8.1, 5.2, 10.3, 9.5}; //double Array wird deklariert
        boolean[] aussagen = {true, true, false, false, true}; // boolean Array wird Deklariert
        String[] personen = {"Harry Müller", "Silke Meier", "John Doe", "Angela Schmitz"}; //string Array wird Deklariert

        int x1 = primzahlen.length; //x1  bekommt die Länge des Arrays Primzahlen [primzahlen.lenght = 10]
        int x2 = primzahlen[10]; //x2  bekommt die den Index 10 des Arrays Primzahlen zugewisen
        double x3 = temperaturen[3];
        boolean x4 = aussagen[aussagen.length];
        String x5 = personen[0];
        boolean x6 = aussagen[aussagen.length-1];
        String x7 = personen[1];
        int x8 = personen.length;
        String[] x9 = personen;
        System.out.println();
    }
}
