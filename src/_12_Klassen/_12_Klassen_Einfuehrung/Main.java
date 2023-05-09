package _12_Klassen._12_Klassen_Einfuehrung;

import java.util.Scanner;

public class Main {
    /* Code 1
    public static void main(String[] args) {

        String[][] schulklasse = new String[10][3];

        String[] schueler1 = {"Tom","Meier","10"};
        schulklasse[0] = schueler1;
        String[] schueler2 = {"Tina","Müller","10"};
        schulklasse[1] = schueler2;

        for (String[] schueler : schulklasse) {
            System.out.println(schueler[0] + " " + schueler[1] + ", " + schueler[2]);
        }
    }
     */

    public static void main(String[] args) {
        Schueler[] schulklasse = new Schueler[10];

        Schueler tom = new Schueler();
        tom.vorname = "Tom";
        tom.nachname = "Meier";
        tom.klasse = 10;
        schulklasse[0] = tom;

        Schueler tina = new Schueler();
        tina.vorname = "Tina";
        tina.nachname = "Müller";
        tina.klasse = 10;
        schulklasse[1] = tina;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißen sie? (Vor- und Nachname)");
        String input = scanner.nextLine();
        String[] woerter = input.split(" ");
        System.out.println("Wie alt bist du?");
        int input2 = scanner.nextInt();
        Schueler newSchueler = new Schueler();
        newSchueler.vorname = woerter[0];
        newSchueler.nachname = woerter[1];
        newSchueler.klasse = input2;
        schulklasse[2] = newSchueler;




        for (Schueler s : schulklasse) {
            if (s != null)
                System.out.println(s.vorname + " " + s.nachname + ", " + s.klasse);

        }
    }

}
