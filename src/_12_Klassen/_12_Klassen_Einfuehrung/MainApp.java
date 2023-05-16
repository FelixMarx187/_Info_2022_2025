package _12_Klassen._12_Klassen_Einfuehrung;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib deinen Namen ein: ");
        String input = scanner.nextLine();
        System.out.println("Gib deinen Nachnamen ein: ");
        String input2 = scanner.nextLine();
        System.out.println("Gib deine Klasse ein: ");
        int input3 = scanner.nextInt();
        Schuelererstellen(input, input2, input3);
    }
    public static void Schuelererstellen(String name, String nachname, int klasse) {
        Schueler[] schulklassen = new Schueler[10];
        Schueler neu = new Schueler();
        neu.vorname = name;
        neu.nachname = nachname;
        neu.klasse = klasse;
        schulklassen[0] = neu;
        System.out.println(Arrays.deepToString(schulklassen));
    }
    public static void main(String[] args) {
        input();
    }
}
