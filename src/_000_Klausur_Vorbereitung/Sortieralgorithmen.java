package _000_Klausur_Vorbereitung;

import java.util.Arrays;

public class Sortieralgorithmen {
    public static void main(String[] args) {
        int[] pArray = {20,30,10,12,9,20,10,23};

        System.out.println(Arrays.toString(bubbleSort(pArray)));
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(selectionSort(pArray)));
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(insertionSort(pArray)));
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(bubblesortMeine(pArray)));
        System.out.println("");
        System.out.println(Arrays.toString(selectionSortMeine(pArray)));

    }
    public static int[] bubbleSort(int[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            // Annahme, dass nicht getauscht werden muss.
            boolean getauscht = false;
            for (int j = 1; j < (pArray.length - i); j++) {
                if (pArray[j - 1] > pArray[j]) {
                    // Tausch der Elemente
                    int temp = pArray[j - 1];
                    pArray[j - 1] = pArray[j];
                    pArray[j] = temp;
                    // Da getauscht wurde, wird die äußere for-Schleife nochmals ausgeführt und damit das Array nochmals
                    // mit der inneren for-Schleife durchlaufen. Das findet so lange statt, bis die if-Abfrage der inneren
                    // for-Schleife nicht mehr zu false ausgewertet wird.
                    getauscht = true;
                }
            }
            if (!getauscht) {
                break;
            }
        }
        return pArray;
    }
    public static int[] selectionSort(int[] pArray) {
        for (int i = 0; i < pArray.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < pArray.length; j++) {
                if (pArray[j] < pArray[min]) {
                    min = j;
                }
            }
            // Tausch der Elemente
            int temp = pArray[min];
            pArray[min] = pArray[i];
            pArray[i] = temp;
        }
        return pArray;
    }
    public static int[] insertionSort(int[] pArray){
        for (int i = 1; i < pArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (pArray[j] < pArray[j - 1]) {
                    // Tausch der Elemente
                    int temp = pArray[j];
                    pArray[j] = pArray[j - 1];
                    pArray[j - 1] = temp;
                }
            }
        }
        return pArray;
    }

    public static int[] bubblesortMeine(int[] pArray){
        for (int i = 0; i < pArray.length; i++) {
            boolean isGetauscht = false;
            for (int j = 1; j < pArray.length; j++) {
                if (pArray[j-1] > pArray[j]) {
                    int temp = 0;
                    temp = pArray[j-1];
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

    public static int[] selectionSortMeine(int[] pArray){
        for (int i = 0; i < pArray.length; i++) {
            int min = i;
            for (int j = i + 1; j < pArray.length; j++) {
                if (pArray[j] < pArray[min]) {
                    min = pArray[j];
                }
            }
            int temp = -1;
            temp = pArray[min];
            pArray[min] = pArray[i];
            pArray[i] = temp;
        }
        return pArray;
    }

}
