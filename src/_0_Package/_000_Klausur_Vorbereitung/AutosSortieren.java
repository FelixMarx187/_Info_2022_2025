package _0_Package._000_Klausur_Vorbereitung;

public class AutosSortieren {
    public static void main(String[] args) {
        Auto[] autos = new Auto[10];
        Auto ford = new Auto();
        ford.setMarke("Ford");
        Auto mercedes = new Auto();
        mercedes.setMarke("Mercedes");
        Auto toyota = new Auto();
        toyota.setMarke("Toyota");
        autos[5] = ford;
        autos[3] = toyota;
        autos[0] = mercedes;
        autosAusgeben(AutosSortieren(autos));

    }
    public static Auto[] AutosSortieren(Auto[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray.length -1; j++) {
                if (pArray[j+1] != null && pArray[j] == null) {
                    Auto temp = pArray[j];
                    pArray[j] = pArray[j+1];
                    pArray[j+1] = temp;
                } else if (pArray[j+1] != null && pArray[j] != null) {
                    int temp = pArray[j].getMarke().compareTo(pArray[j+1].getMarke());
                    if (temp > 0) {
                        Auto tmp = pArray[j+1];
                        pArray[j+1] = pArray[j];
                        pArray[j] = tmp;

                    }
                }
            }
        }
        return pArray;
    }

    public static void autosAusgeben(Auto[] pArray){
        for (int i = 0; i < pArray.length; i++) {
            if (pArray[i] != null) {
                System.out.print(" " + pArray[i].getMarke() + " ");
            }
        }
    }
}
