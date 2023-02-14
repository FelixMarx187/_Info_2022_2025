package _10_For_Schleifen._10_For_Schleifen_Vertiefung;

public class MainApp_A2 {
    public static String fahrradcode(){
        int stelle1 = 4;
        int stelle2 = 5;
        int stelle3 = 2;

        String code = stelle1+ "-" + stelle2 + "-" + stelle3;
        return code;
    }

    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println(fahrradcode());
        System.out.println("-------------------------");
    }
}
