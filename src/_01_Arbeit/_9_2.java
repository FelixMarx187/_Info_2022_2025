package _01_Arbeit;

import java.util.Random;
import java.util.Scanner;

public class _9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] persons = {"Papa", "Oma", "Tim", "Lisa"};
        String[] verbs = {"plätschert", "geht", "hustet"};
        String[] adverbs = {"lustig", "bunt", "schnell"};
        String[] prepositions = {"in", "auf", "unter"};
        String[] articles = {"der", "die", "das"};
        String[] nouns = {"Badewanne", "Fußballtor", "Goldfischglas"};
        Random random = new Random();

        while (true) {
            System.out.println(getRandomValueFromArray(persons, random) + " " +
                    getRandomValueFromArray(verbs, random) + " " +
                    getRandomValueFromArray(adverbs, random) + " " +
                    getRandomValueFromArray(prepositions, random) + " " +
                    getRandomValueFromArray(articles, random) + " " +
                    getRandomValueFromArray(nouns, random) + ".");
            System.out.print("Weiter (ja/nein)? ");
            String input = sc.nextLine();
            if (input.equals("nein")) {
                break;
            }
        }
        sc.close();
    }

    public static String getRandomValueFromArray(String[] array, Random random) {
        return array[random.nextInt(array.length)];
    }
}

