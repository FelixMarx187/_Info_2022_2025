package Challenge;

import java.util.Arrays;
import java.util.Random;

public class Challenge1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];
        int i = 0;
        while (i < array.length) {
            array[i] = random.nextInt(0, 2);
            i++;
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        int count = 0;
        int counter = 0;
        while (counter < array.length) {
            if (array[counter] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            }else {
                count = 0;
            }
            counter++;
        }
        System.out.println(max);
    }
}
