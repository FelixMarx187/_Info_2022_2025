package _0_Package._000_Klausur_Vorbereitung;

import java.util.Arrays;

public class SortierenStringArray {
    public static void main(String[] args) {
        String[] arr = {"Jocelin","Felix","Max","Anna","Linnea","Michael Lehnen","Luan","Ben","Lamborghini", "Lars"};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
    }
    public static void bubbleSort(String[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 1; j < pArray.length; j++) {
                if (pArray[j].charAt(0) < pArray[j-1].charAt(0)) {
                    String temp = pArray[j];
                    pArray[j] = pArray[j-1];
                    pArray[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(pArray));
    }
}
