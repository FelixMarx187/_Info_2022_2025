package _11_String_Methoden._11_String_Methoden_Einführung;

public class MainApp_2 {
    public static void main(String[] args) {
        String word = "Hückelhoven";
        String buffer = " ";
        for (int l = 0; l <= word.length()/2; l++) {
            System.out.println(l + buffer + word.substring(l, word.length()-l));
            buffer += " ";
        }
    }
}
