package _11_String_Methoden._11_String_Methoden_Einführung;

public class MainApp_1 {
    public static void main(String[] args) {

        String word = "Hückelhoven";
        for (int i = 0; i< word.length(); i++) {
            System.out.println("i = " +i);
            System.out.println(word.charAt(i));
            System.out.println(word.substring(i));
            System.out.println();
        }
    }
}
