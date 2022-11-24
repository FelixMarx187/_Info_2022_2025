package Challenge;

import java.util.Arrays;
import java.util.Random;

public class Challenge2 {
    public static void main(String[] args) {
        //Aufgabenbeschreibung:
        //Erstelle ein Array mit 20 Zufallszahlen von -1000 bis +1000.
        //Gib die geraden und die ungeraden Zahlen separat aus.
        //Zähle zudem, wie viele Gerade und wie viele ungerade Zahlen es jweils gibt.

        Random random = new Random();
        int[] meinarray = new int[20];
        int i = 0;
        while (i < meinarray.length) {
            meinarray[i] = random.nextInt(-1000, 1000);
            i++;
        }
        System.out.println(Arrays.toString(meinarray));

        int counter = 0;
        int[] gerade = new int[20];
        int[] ungerade = new int[20];

        while (counter < meinarray.length) {
            if (meinarray[counter] % 2 == 0) {
                meinarray[counter] = gerade[counter];
            } else {
                meinarray[counter] = ungerade[counter];
            }
            counter++;
            System.out.println(Arrays.toString(gerade));
            System.out.println(Arrays.toString(ungerade));
        }

        int counter2 = 0;
        int count = 0;
        int max = 0;
        while (counter2 < meinarray.length) {
            if (meinarray[counter2] % 2 == 0) {
                count++;
                if (count < max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            counter2++;
        }
        System.out.println(max);
    }
}
