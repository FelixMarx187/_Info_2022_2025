package _09_Methoden._09_Methoden_Vertiefung;

import java.util.Random;

public class MainApp_A1 {
    public static int getValue(){
        Random random = new Random();
        return random.nextInt(0,100);
    }

    public static int multiply(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        System.out.println(getValue());
        int a = 2;
        int b = 2;
        int ergebnis = multiply(a,b);
        System.out.println(ergebnis);
    }
}
