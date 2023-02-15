package _01_Arbeit;

import java.util.Random;
import java.util.Scanner;

public class Little_GAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//--------------------- ARRAY ------------------------
        String[] farben = {"Herz","Karo","Pik","Kreuz"};
        String[] bilder = {"7","8","9","10","Bauer","Dame","König","Ass"};
//--------------------- ARRAY ------------------------

//--------------------- INTRO ------------------------
        System.out.println("|-------------------| Star Trek: Black Jack |-------------------|");
        System.out.println("|--------------------------| Regeln |---------------------------|");
        System.out.println("|--|---------------------------------------------------------|--|");
        System.out.println("|--| Wenn du [1] drückst ziehst du eine Karte aus einem Scat |--|");
        System.out.println("|--| Deck. Die gezogene Karte wird dir als Punkte zu         |--|");
        System.out.println("|--| gerechnet. wenn du 21 Punkte erreicht hast, hast du     |--|");
        System.out.println("|--| gewonnen. Wenn du über 21 Punkt kommst hast du verloren.|--|");
        System.out.println("|--| Bevor du über 21 Punkte kommst kannst du auch früher    |--|");
        System.out.println("|--| Aufhöhren. Dabei muss deine Punkte anzahl über 15       |--|");
        System.out.println("|--| Punkte liegen um zu gewinnen                            |--|");
        System.out.println("|--|---------------------------------------------------------|--|");
//--------------------- INTRO ------------------------

        boolean run = true;
        boolean runin = true;
        while (runin) {
            int punkte = 0;
            while (run) {
                int farbenrandom = random.nextInt(0,4);
                int bilderrandom = random.nextInt(0,8);

                System.out.println("|--| Karte Ziehen [1] |--------|--------| Stehen bleiben [2] |--|");
                int hitstand = scanner.nextInt();
                if (hitstand == 1) {
                    System.out.println("|--|---------------------------------------------------------|--|");
                    System.out.println("|--|---| Deine Karte: " + farben[farbenrandom] + " " + bilder[bilderrandom] +  " |---------------------------|--|");

                    int value;
                    if (bilder[bilderrandom].equals("Bauer") || bilder[bilderrandom].equals("Dame") || bilder[bilderrandom].equals("König")) {
                        value = 10;
                    } else if (bilder[bilderrandom].equals("Ass")) {
                        value = 11;
                    } else {
                        value = Integer.parseInt(bilder[bilderrandom]);
                    }

                    punkte += value;

                    System.out.println("|--|---| Punkte: " + punkte +" |----------------------------------------|--|");
                    System.out.println("|--|---------------------------------------------------------|--|");
                    if (punkte > 21) {
                        System.out.println("|--|------- Du hast Verloren!! ------------------------------|--|");
                        System.out.println("|--|---------------------------------------------------------|--|");
                        punkte = 0;
                    } else if (punkte == 21) {
                        System.out.println("|--|------- Du hast Gewonnen!! ------------------------------|--|");
                        System.out.println("|--|---------------------------------------------------------|--|");
                        break;
                    }
                } else if (hitstand == 2) {
                    if (punkte < 15) {
                        System.out.println("|--|------- Du hast Verloren!! ------------------------------|--|");
                        System.out.println("|--|---------------------------------------------------------|--|");
                        break;
                    } else if (punkte > 15 && punkte < 21) {
                        System.out.println("|--|------- Du hast Gewonnen!! ------------------------------|--|");
                        System.out.println("|--|---------------------------------------------------------|--|");
                        break;
                    }
                }
            }
            System.out.println("|--|------- Willst du nochmal spielen? Ja [1] Nein [2] ------|--|");
            int again = scanner.nextInt();
            if (again == 1) {
                System.out.println("|--|---------------------------------------------------------|--|");
                run = true;
            } else if (again == 2) {
                run = false;
            }

        }
    }
}
