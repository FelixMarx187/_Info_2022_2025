package Challenge;

import java.util.Arrays;
import java.util.Random;

public class Challenge1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[20];
        int i = 0;
        while (i < arr.length) {
            arr[i] = random.nextInt(0, 2);
            i++;
        }
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        int max = 0;
        int counterwhile = 0;
        while (counterwhile > arr.length) {
            if (arr[counterwhile] == 1) {
                counter++;
                if (max < counter) {
                    max = counter;
                }
            }
            counter = 0;
            counterwhile++;
        }
        System.out.println(max);
    }
}
