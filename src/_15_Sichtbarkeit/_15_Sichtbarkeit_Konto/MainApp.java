package _15_Sichtbarkeit._15_Sichtbarkeit_Konto;

import java.util.Random;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        Konto[] kontoArray = new Konto[200];
        boolean run = true;
        while (run) {
            System.out.println(" Felix's Bank ");
            System.out.println("| Kontoerstellen [1] | Konto Login [2] |");
            int input1 = new Scanner(System.in).nextInt();
            Konto konto = null;
            if (input1 == 1) {
                System.out.println("| Kontoerstellung |");
                System.out.print("Name: ");
                String inhaber = new Scanner(System.in).nextLine();
                System.out.print("Alter: ");
                int input = new Scanner(System.in).nextInt();

                konto = new Konto(inhaber, input);
                konto.setKontoNummer(new Random().nextInt(10000000, 100000000));
                konto.setKontoStand(0);
                for (int i = 0; i < kontoArray.length; i++) {
                    if (kontoArray[i] == null) {
                        kontoArray[i] = konto;
                    }
                }
                //StandardVertrag standardVertrag = new StandardVertrag();
                //Benutzerdaten Ausgabe
                System.out.println("_________________________________________");
                System.out.println("Name: " + konto.getInhaber());
                System.out.println("Alter: " + konto.getAlter());
                System.out.println("Kontonumer: " + konto.getKontoNummer());
                System.out.println("Kontostand: " + konto.getKontoStand());
                //Welcher Vertrag wird hinzugefügt
                if (input < 18) {
                }
                //Vertrags Details
                /*System.out.println("  - Kontoführungsgebühren: " + standardVertrag.getKontofuehrungsgebuehren());
                System.out.println("  - Guthaben Zinsen: " + standardVertrag.getGuthabenZinsen());
                System.out.println("  - Darlehen Zinsen: " + standardVertrag.getDarlehenZinsen());
                System.out.println("  - max Darlehens Summe: " + standardVertrag.getMaxDarlehensSumme());
                System.out.println("  - max Abhebebetrag: " + standardVertrag.getMaxAbhebebetrag());
                System.out.println("  - ist gesperrt: " + konto.isGesperrt());
                 */
            } else if (input1 == 2) {
                System.out.println("| Konto Login |");
                System.out.print("| Kontonummer: ");
                int kontonummer = new Scanner(System.in).nextInt();
                System.out.print(" |");
                KontoVerwaltung kontoVerwaltung = new KontoVerwaltung();
            }


        }
    }
}