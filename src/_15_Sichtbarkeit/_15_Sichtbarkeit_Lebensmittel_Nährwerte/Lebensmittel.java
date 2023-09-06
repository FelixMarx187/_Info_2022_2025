package _15_Sichtbarkeit._15_Sichtbarkeit_Lebensmittel_Nährwerte;

import java.util.Scanner;

public class Lebensmittel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Naehrwerte getNaehrwerte() {
        return naehrwerte;
    }

    public void setNaehrwerte(Naehrwerte naehrwerte) {
        this.naehrwerte = naehrwerte;
    }

    public boolean isIstGesund() {
        return istGesund;
    }

    public void setIstGesund(boolean istGesund) {
        this.istGesund = istGesund;
    }

    private String name;
    private Naehrwerte naehrwerte;
    private boolean istGesund;

    public Lebensmittel[] lebensmittelsErzeugen(Lebensmittel[] lebensmittel) {
        Scanner scanner = new Scanner(System.in);
        Naehrwerte[] naehrwertes = new Naehrwerte[100];
        Lebensmittel lebensmittel1 = new Lebensmittel();
        Naehrwerte naehrwerte = new Naehrwerte();
        for (int i = 0; i < lebensmittel.length; i++) {
            if (lebensmittel[i] == null) {
                System.out.println("Lebensmittel erzeugen");
                System.out.print("Name: ");
                lebensmittel1.setName(scanner.nextLine());
                System.out.print("Kilokalorien: ");
                naehrwerte.setKilokalorien(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Fett: ");
                naehrwerte.setFett(scanner.nextDouble());
                System.out.print("Kohlenhydrate: ");
                naehrwerte.setKohlenhydrate(scanner.nextDouble());
                System.out.print("Eiweiß: ");
                naehrwerte.setEiweiss(scanner.nextDouble());
                scanner.nextLine();
                System.out.print("Ist Gesund: ");
                lebensmittel1.setIstGesund(scanner.nextBoolean());
                System.out.println("----------------------------------------------------------------------------------------------------------");
                naehrwertes[i] = naehrwerte;
                lebensmittel1.setNaehrwerte(naehrwertes[i]);
                lebensmittel[i] = lebensmittel1;
                break;
            }
        }
        return lebensmittel;
    }

    public void lebensmittelAusgeben(Lebensmittel[] pArray) {
        Naehrwerte s1 = new Naehrwerte();
        for (Lebensmittel s : pArray) {
            if (s != null) {
                System.out.println("Lebensmittel: " + s.getName() + "\nKilokalorien: " + s1.getKilokalorien() + "\nFett: " + s1.getFett() + "\nKohlenhydrate: " + s1.getKohlenhydrate() + "\nEiweiß: " + s1.getEiweiss() + "\nist Gesund: " + s.isIstGesund());
            } else {
                System.out.println("Liste Ende");
                break;
            }
        }
    }
}
