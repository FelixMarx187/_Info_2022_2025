package _03_Benutzereingabe._03_Vertiefung;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        //Nr.1
        Scanner zahl1 = new Scanner(System.in);
        Scanner zahl2 = new Scanner(System.in);

        System.out.println("Geben sie nun ihrere erste Ziffer an");
        int zahl11 = zahl1.nextInt();
        System.out.println("Geben sie nun ihre zweite Ziffer an");
        int zahl22 = zahl2.nextInt();

        int ergebnis1 = zahl11 / zahl22;
        int ergebnis2 = zahl11 % zahl22;
        System.out.println("Das ergebnis ihrer Rechnung lautet:" + " " + zahl11 + " / " + zahl22 + " = " + ergebnis1 + " Rest " + ergebnis2);

        //Nr. 2
        Scanner sek1 = new Scanner(System.in);

        System.out.println("Geben sie ihre Sekunden an:");
        int sek11 = sek1.nextInt();

        int ergebnismin = sek11 / 60;
        int ergenissek = sek11 % 60;

        System.out.println("Die angegebenden Sekunden wären in Minuten: " + ergebnismin + " Minuten und " + ergenissek + " Sekunden");

        //Nr. 3

        Scanner name1 = new Scanner(System.in);
        Scanner entwickler1 = new Scanner(System.in);
        Scanner preis1 = new Scanner(System.in);
        Scanner fsk1 = new Scanner(System.in);
        Scanner kategorie1 = new Scanner(System.in);

        System.out.println("Geben sie den Names ihres Spiels an:");
        String name2 = name1.nextLine();
        System.out.println("Geben sie ihren Namen(Entwickler) an:");
        String entwickler2 = entwickler1.nextLine();
        System.out.println("Legen sie den Preis ihres Spiels Fest(in Euro),(bitte mit Komma angeben sonst wird Fehler angezeigt)");
        double preis2 = preis1.nextDouble();
        System.out.println("Legen sie nun die FSK fest (Bsp.:\"Usk 0,6,12,16,18\")");
        int fsk2 = fsk1.nextInt();
        System.out.println("Geben sie nun die Kategorie ihres Spiels an (\" MMMORPG, Shooter, Simulator, etc. \")");
        String kategorie2 = kategorie1.nextLine();

        System.out.println(" ");
        System.out.println("Zusammenfassung ihres Spiels:" + "\n" + " Name: " + name2 + ",\n " + "Entwickler:" + entwickler2 + ",\n " + "Preis: " + preis2 + "€" + ",\n " + "Fsk: " + fsk2 + ",\n " + "Spiele-Kategorie: " + kategorie2);


        //Nr.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe, bitte");
        double input = scanner.nextDouble();
        input *= 1000;
        int zwischenwert = (int) input;
        zwischenwert += 5;
        zwischenwert /= 10;
        double output = zwischenwert / 100.0;
        System.out.println("Ergebnis: " + output);
        //Das Program gibt eine Ganzzahlige Zahl in Dezimalzahl aus.
    }
}
