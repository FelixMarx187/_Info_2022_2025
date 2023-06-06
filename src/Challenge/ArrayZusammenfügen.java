package Challenge;

import java.util.Arrays;

public class ArrayZusammenfügen {
    public static void main(String[] args) {
        int[] arr1 = {1,5,9};
        int[] arr2 = {2,3,0,4,101};
        int[] zusammen = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            zusammen[i] += arr1[i];
        }
        int i = arr1.length;
        for (int k = 0; k < arr2.length; k++) {
            zusammen[i] += arr2[k];
            i++;
        }

        System.out.println(Arrays.toString(zusammen));
        Arrays.sort(zusammen);
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(zusammen));
    }
}
