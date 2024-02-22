package _0_Package._0_Facharbeit.functionalInterfaces;

public class MainApp {
    public static void main(String[] args) {
        Begruessen begruessen = () -> System.out.println("Hallo, Welt!");

        begruessen.sagHallo();
    }

    interface Begruessen {
        void sagHallo();
    }
}
