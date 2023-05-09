package _10_For_Schleifen._10_For_Schleifen_Vertiefung;

public class MainApp_A2 {
    public static String fahrradcode(){
        int code1 = 9;
        int code2 = 2;
        int code3 = 8;


        int i;
        int j;
        int k;
        for (i = 0; i < 10; i++) {
            System.out.println(i+"-"+"0"+"-"+"0");
            if (i == code1) {
                break;
            }
        }
        for (j = 0; j < 10; j++) {
            System.out.println(i+"-"+j+"-"+"0");
            if (j == code2) {
                break;
            }
        }
        for (k = 0;k<10; k++) {
            System.out.println(i+"-"+j+"-"+k);
            if (k == code3) {
                break;
            }
        }
        String code = "Code found: " + i + "-" + j + "-"+ k;
        return code;
    }
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println(fahrradcode());
        System.out.println("-------------------------");



    }
}
