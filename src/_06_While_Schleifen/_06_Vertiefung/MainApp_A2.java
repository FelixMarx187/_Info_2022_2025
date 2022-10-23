package _06_While_Schleifen._06_Vertiefung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int zufallZahl = 0;

        boolean run = true;

        String antwort = "";

        while(run){

            System.out.println("Lustiges Zahlenraten");
            System.out.println("---------------------");
            System.out.println("Erraten Sie die Zufahlszahl in moeglichst wenigen Schritten!");
            System.out.println("Die Zahl kann zwischen 1 und 100 liegen");

            zufallZahl = random.nextInt(1, 100);
            int eingabe = 0;
            int versuche = 0;

            while(versuche < 5){
                System.out.println("Bitte eine Zahl eingeben: ");
                eingabe = scanner.nextInt();
                System.out.println(zufallZahl);

                if(eingabe < 0 || eingabe > 100){
                    System.out.println("Ungültige Eignabe. Bitte Eingabe wiederholen:");
                }else if(eingabe < zufallZahl){
                    System.out.println("Die gesuchte Zahl ist groesser!");
                    versuche++;
                }else if(eingabe > zufallZahl){
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                    versuche++;
                }else if(eingabe == zufallZahl){
                    System.out.println("Sie haben die gesuchte Zahl gefunden!");
                    break;
                }
            }
            System.out.println("Weiter spielen? (J/N)");
            antwort = scanner.next();
            if(antwort.toLowerCase().equals("j")) {
                run = true;
                System.out.println();
            }else{
                run = false;
            }
        }
    }
}
