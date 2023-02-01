package _01_Arbeit;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {

        ArrayList<Integer> playerCards = new ArrayList<Integer>();
        ArrayList<Integer> dealerCards = new ArrayList<Integer>();
        boolean run = true;
        while (run) {
            // Start the game by dealing two cards to the player and two cards to the dealer
            playerCards.add((int) (Math.random() * 10) + 1);
            playerCards.add((int) (Math.random() * 10) + 1);
            dealerCards.add((int) (Math.random() * 10) + 1);
            dealerCards.add((int) (Math.random() * 10) + 1);

            Scanner input = new Scanner(System.in);
            boolean playerTurn = true;
            int playerTotal = 0;
            while (playerTurn) {
                playerTotal = 0;
                for (int i : playerCards) {
                    playerTotal += i;
                }
                System.out.println("Your cards: " + playerCards + " (Total: " + playerTotal + ")");
                System.out.println("Dealer's cards: " + dealerCards.get(0) + " and [hidden]");
                System.out.println("What would you like to do? (1) Hit (2) Stand");
                int choice = input.nextInt();
                if (choice == 1) {
                    playerCards.add((int) (Math.random() * 10) + 1);
                    if (playerTotal > 21) {
                        System.out.println("Bust! Your cards: " + playerCards + " (Total: " + playerTotal + ")");
                        playerTurn = false;
                    }
                } else {
                    playerTurn = false;
                }
            }
            // Dealer's turn
            int dealerTotal = 0;
            for (int i : dealerCards) {
                dealerTotal += i;
            }
            while (dealerTotal < 17) {
                dealerCards.add((int) (Math.random() * 10) + 1);
                dealerTotal = 0;
                for (int i : dealerCards) {
                    dealerTotal += i;
                }
            }
            System.out.println("Dealer's cards: " + dealerCards + " (Total: " + dealerTotal + ")");
            if (dealerTotal > 21) {
                System.out.println("Dealer busts! You win!");
            } else if (dealerTotal > playerTotal) {
                System.out.println("Dealer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.println("Would you like to try again? Yes [1] No [2]");
            int ende = input.nextInt();
            if (ende == 1) {
                run = true;
            } else {
                System.out.println("Bye!");
                run = false;
            }
        }
    }
}
