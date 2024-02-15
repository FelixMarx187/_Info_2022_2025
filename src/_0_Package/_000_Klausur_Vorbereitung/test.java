package _0_Package._000_Klausur_Vorbereitung;

public class test {
    public static void main(String[] args) {
        String[] arr = new String[10];

        arr[3] = "Harri";
        arr[5] = "Benni";

    }
    public static String[] sortieren(String[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray.length; j++) {
                if (pArray[i] != null && pArray[j] == null) {
                    String temp = pArray[j];
                    pArray[j] = pArray[i];
                    pArray[i] = temp;
                } else if (pArray[i] != null && pArray[j] != null) {
                    pArray[i].compareTo(pArray[j]);
                }
            }
        }
        return pArray;
    }
}
