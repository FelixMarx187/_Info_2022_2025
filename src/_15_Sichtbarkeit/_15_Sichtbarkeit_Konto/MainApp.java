package _15_Sichtbarkeit._15_Sichtbarkeit_Konto;

import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        Konto[] kontoArray = new Konto[Integer.MAX_VALUE];
        boolean run = true;
        while (run){
            System.out.println(" Felix's Bank ");
            System.out.println("| Kontoerstellen [1] | Konto Login [2] |");
            int input1 = new Scanner(System.in).nextInt();
            if (input1 == 1) {
                System.out.println("| Kontoerstellung |");
                System.out.print("Name: ");
                String inhaber = new Scanner(System.in).nextLine();
                System.out.print("Alter: ");
                int input = new Scanner(System.in).nextInt();

                Konto konto = new Konto(inhaber,input);
                StandardVertrag standardVertrag = new StandardVertrag();
                System.out.println("_________________________________________");
                System.out.println("Name: " + konto.getInhaber());
                System.out.println("Alter: " + konto.getAlter());
                System.out.println("Kontonumer: " + konto.getKontoNummer());
                System.out.println("Kontostand: " + konto.getKontoStand());
                if (input < 18) {
                    standardVertrag.juniorVertrag();
                    System.out.println("Konto Vertrag: " + standardVertrag.getName());
                } else {
                    standardVertrag.standardVertrag();
                    System.out.println("Konto Vertrag: " + standardVertrag.getName());
                }
                System.out.println("  - Kontoführungsgebühren: " + standardVertrag.getKontofuehrungsgebuehren());
                System.out.println("  - Guthaben Zinsen: " + standardVertrag.getGuthabenZinsen());
                System.out.println("  - Darlehen Zinsen: " + standardVertrag.getDarlehenZinsen());
                System.out.println("  - max Darlehens Summe: " + standardVertrag.getMaxDarlehensSumme());
                System.out.println("  - max Abhebebetrag: " + standardVertrag.getMaxAbhebebetrag());

            }


        }
    }
}