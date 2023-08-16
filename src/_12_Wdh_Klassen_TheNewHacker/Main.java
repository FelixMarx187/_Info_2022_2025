package _12_Wdh_Klassen_TheNewHacker;

public class Main {
    public static Auto[] objektListe(){
        Auto[] autos = new Auto[10];

        //Auto1, Auto2, Auto3 wurden in eine Java Klasse gepackt (AUTO)
        Auto auto1 = new Auto();
        auto1.hersteller = "Mercedes";
        auto1.modell = "A-Klasse";
        auto1.ps = 109;

        Auto auto2 = new Auto();
        auto2.hersteller = "VW";
        auto2.modell = "Polo";
        auto2.ps = 80;

        Auto auto3 = new Auto();
        auto3.hersteller = "Dacia";
        auto3.modell = "Sandero";
        auto3.ps = 67;

        autos[0] = auto1; //Man fängt bei 0 an zuzählen
        autos[1] = auto2;
        autos[2] = auto3;
        return autos;
    }
    private static void objektAusgeben(Auto[] pArray) {
        for (Auto s : pArray) {
            if (s != null) {
                System.out.println(s.hersteller + " " + s.modell + " mit " + s.ps + "PS.");
            } else {
                System.out.println("Das Auto gibt es nicht"); //null macht keine Sinn
                break;
            }
        }
    }
    public static void main(String[] args){
        objektAusgeben(objektListe());
    }
}
