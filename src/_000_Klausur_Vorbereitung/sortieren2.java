package _000_Klausur_Vorbereitung;

import java.util.Arrays;

public class sortieren2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 2,6,3,8,10};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] bubbleSort(int[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            boolean isGetauscht = false;
            for (int j = 1; j < pArray.length; j++) {
                if (pArray[j] < pArray[j-1]) {
                    int temp = pArray[j-1];
                    pArray[j-1] = pArray[j];
                    pArray[j] = temp;

                    isGetauscht = true;
                }
            }
            if (!isGetauscht) {
                break;
            }
        }
        return pArray;
    }
    public static int[] selectionSort(int[] pArray) {
        for (int i = 1; i < pArray.length; i++) {
            int min = i;
            for (int j = i +1; j < pArray.length; j++) {
                if (pArray[j] < pArray[min]) {
                    min = j;
                }
            }
            int temp = pArray[min];
            pArray[min] = pArray[i];
            pArray[i] = temp;
        }
        return pArray;
    }

    public static int[] insertionSort(int[] pArray) {
        for (int i = 1; i < pArray.length; i++) {
            for (int j = i-1; j > 0; j--) {
                if (pArray[j] > pArray[i]){
                    int temp = pArray[i];
                    pArray[i] = pArray[j];
                    pArray[j] = temp;
                }
            }
        }
        return pArray;
    }
}