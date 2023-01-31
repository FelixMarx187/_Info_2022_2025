package _09_Methoden._09_Methoden_Einführung;

public class MainApp_3 {
    public static int giveMeFive(){
        return 5;
    }
    public static int giveMeTen(){
        return 10;
    }
    public static void main(String[] args) {
        int x=giveMeFive();
        x+=giveMeTen();
        x+=giveMeFive();
        System.out.println(x);
    }
}
