package _0_Package._0_Facharbeit._4_1_Codebeispiele;

public class MainApp_LambdaExpression {
    public static void main(String[] args) {
        begruessen begruessen = () -> System.out.println("Hallo");

        begruessen.sagHallo();
    }
    interface begruessen {
        void sagHallo();
    }
}
