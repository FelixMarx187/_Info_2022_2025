package _01_Arbeit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
