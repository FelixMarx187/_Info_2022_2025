package _08_Mehrdimensionale_Arrays._08_Einfuehrung;

public class MainApp_1 {
    public static void main(String[] args) {
        String[] texte = new String[5];

        int i = 0;
        while (i < texte.length) {
            texte[i] = Integer.toString(i);
            System.out.println(texte[i]);
            i++;
        }
    }
}
