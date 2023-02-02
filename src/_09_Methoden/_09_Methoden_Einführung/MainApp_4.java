package _09_Methoden._09_Methoden_Einführung;

public class MainApp_4 {
    public static void giveMeSomething(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        giveMeSomething(5);
        giveMeSomething(10);

        int value = 7;
        giveMeSomething(value);
        giveMeSomething(2*value+7);

        int x = 1;
        System.out.println("Main: " + x);
        giveMeSomething(x);
        System.out.println("Main: " + x);
    }
}