package _09_Methoden._09_Methoden_Vertiefung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_A2 {
    public static String getRandomValueFromArray(String[] array, Random random){
        return array[random.nextInt(array.length)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personen = {"Felix", "Jocelin", "Jasper", "Cedric", "Joel","Weronika","Semiha","Domenik 1", "Domenik 2","Kastje","Tom"};
        String[] verben = {"fliegt", "geht", "hustet"};
        String[] adverben = {"lustig", "bunt", "schnell"};
        String[] preapositionen = {"in", "auf", "unter"};
        String[] Artikel = {"der", "die", "das"};
        String[] Nomen = {"Badewanne", "Fußballtor", "Goldfischglas"};
        Random random = new Random();
        boolean run = true;

        while (run) {
            System.out.println(getRandomValueFromArray(personen, random)+ " " +
                    getRandomValueFromArray(verben, random)+ " " +
                    getRandomValueFromArray(adverben, random) + " "+
                    getRandomValueFromArray(preapositionen, random) + " "+
                    getRandomValueFromArray(Artikel,random)+ " "+
                    getRandomValueFromArray(Nomen, random));
            System.out.println("Noch einmal? JA[1] | Nein[2]");
            int again = scanner.nextInt();
            if (again == 2) {
                run = false;
            }
        }


    }
}
