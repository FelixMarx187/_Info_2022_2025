package _09_Methoden._09_Methoden_Einführung;

public class MainApp_5 {
    public static int add(int x, int y) {
        return x+y;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c= add(a,b);
        System.out.println("Die Summe von " + a + " und " + b+ " ist " + c);
    }
}
