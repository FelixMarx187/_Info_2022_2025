package _11_String_Methoden._11_String_Methoden_Einführung;

import java.util.Arrays;
import java.util.Locale;

public class MainApp_1 {
    public static void main(String[] args) {

        System.out.println("1.1");
        String word = "Hückelhoven";
        for (int i = 0; i < word.length(); i++) {
            System.out.println("i = " + i);
            System.out.println(word.charAt(i));
            System.out.println(word.substring(i));
            System.out.println();
        }

        System.out.println("1.2");
        String word2 = "Hückelhoven";
        String buffer = " ";
        for (int l = 0; l <= word.length() / 2; l++) {
            System.out.println(l + buffer + word2.substring(l, word2.length() - l));
            buffer += " ";
        }

        System.out.println("1.3");
        String word3 = "Hückelhoven";
        String gross = word3.toUpperCase();
        String klein = word3.toLowerCase();
        System.out.println(gross + " und " + klein);

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " + klein.indexOf(c));
        }

        System.out.println("1.4");
        String word4 = "Hueckelhoven";
        String groß1 = word4.toUpperCase();
        String klein2 = word4.toLowerCase();
        System.out.println(groß1 + " und " + klein2);

        for (char c = 'a'; c <= 'z'; c++) {
            int idx = klein2.indexOf(c);
            while (idx >= 0) {
                System.out.println(c + " : " + idx);
                idx = klein.indexOf(c, idx + 1);
            }
        }

        System.out.println("1.5");
        for (char c2 = 'A'; c2 <= 'z'; c2++) {
            int ascii = (int) c2;
            System.out.println(c2 + " = " + Integer.toString(ascii));
        }

        System.out.println("1.6");
        for (int ascii2 = 65; ascii2 <= 122; ascii2++) {
            char c3 = (char) ascii2;
            System.out.println(Integer.toString(ascii2) + " = " + c3);
        }

        System.out.println("1.7");
        String[] moebel = {"Esstisch", "Deckenlampe", "Nachttisch", "Bürotisch", "Küchentisch","Bürostuhl", "Couchtisch", "Barhocker", "Schaukelstuhl", "Büroschrank", "Gartenstuhl", "Kommode", "Sofaecke", "Decke"};
        int tische = 0;
        int stuehle = 0;
        int bueromoebel = 0;
        int ecken = 0;
        for (String item : moebel) {
            if (item.startsWith("Büro"))
                bueromoebel++;
            if (item.endsWith("tisch"))
                tische++;
            if (item.endsWith("stuhl"))
                stuehle++;
            if (item.contains("eck"))
                ecken++;
        }
        System.out.println("Ich habe " + bueromoebel + " Büromöbel, " + tische + " Tische und " + stuehle + "Stühle und " + ecken + " Eckmöbel.");

        System.out.println("1.8");
        String[] moebel2 = {"Esstisch", "Deckenlampe", "Nachttisch", "Bürotisch", "Küchentisch","Bürostuhl", "Couchtisch", "Barhocker", "Schaukelstuhl", "Büroschrank", "Gartenstuhl", "Kommode", "Sofaecke", "Decke"};
        String moebel_mit_semikolon = String.join(";",moebel2);
        String moebel_mit_unterstrich = String.join("_",moebel2);
        System.out.println(moebel_mit_semikolon);
        System.out.println(moebel_mit_unterstrich);
        String[] einzelne_moebel = moebel_mit_semikolon.split(";");
        System.out.println(Arrays.toString(einzelne_moebel));
        String[] quatsch = moebel_mit_unterstrich.split("o");
        System.out.println(Arrays.toString(quatsch));

        System.out.println("1.9");
        String word11 = "";
        String word22 = " ";
        String word33 = " some text";

        System.out.println("word11 = " + word11 + " length = "+ word11.length() + " isEmpty = " + String.valueOf(word11.isEmpty()));
        System.out.println("word22 = " + word22 + " length = " + word22.length() + " isEmpty = " + String.valueOf(word22.isEmpty()));
        System.out.println("word33 = " + word33 + " length = " + word33.length() + " isEmpty = " + String.valueOf(word33.isEmpty()));

        System.out.println("1.10");
        String wort_mit_leerzeichen = "   String mit Leerzeichen   ";
        String wort = wort_mit_leerzeichen.strip();
        System.out.println(wort);

        System.out.println("1.11");
        String wort1 = "Teebeutel";
        String w1 = wort1.replace("e", "o");
        System.out.println(w1);

        System.out.println("1.12");
        String zweizeilen = "Das sind\nZwei Zeilen!";
        String tabulator = "1\t2\t3\t4";
        String tabulator2 = "5\t6\t7\t8";
        String anfuehrungszeichen = "Manchmal möchte man auch \" oder \' oder \\ in der Console sehen.";
        System.out.println(zweizeilen);
        System.out.println(tabulator);
        System.out.println(tabulator2);
        System.out.println(anfuehrungszeichen);
    }
}
