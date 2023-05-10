package _01_Arbeit;

import java.util.Arrays;

public class MorseCode {
    public static String[] morsecode() {
        String[] arr = new String[]{
                ".-",       //A
                "-...",     //B
                "-.-.",     //C
                "-..",      //D
                ".",        //E
                "..-.",     //F
                "--.",      //G
                "....",     //H
                "..",       //I
                ".---",     //J
                "-.-",      //K
                ".-..",     //L
                "--",       //M
                "-.",       //N
                "---",      //O
                ".--.",     //P
                "--.-",     //Q
                ".-.",      //R
                "...",      //S
                "-",        //T
                "..-",      //U
                "...-",     //V
                ".--",      //W
                "-..-",     //X
                "-.--",     //Y
                "--.."      //Z
        };
        return arr;
    }

    public static String textToMorse(String[] pArray, String pText) {
        String text = "";
        for (int i = 0; i < pArray.length; i++) {
            text += pArray[pText.charAt(i) - 65];
        }
        return text;
    }

    private static int getIdx(String pArray, String pMorseCode){
        int idx = -1;
        for (int i = 0; i < pArray.length(); i++) {
            if (pArray.equals(pMorseCode)) {
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(textToMorse(morsecode(), "HALLOWELT"));
    }
}
