package com.pluralsight;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter player1 name: ");
        String player1Name = scan.nextLine();
        System.out.print("Enter player2 name: ");
        String player2Name = scan.nextLine();

        // Players hands
        Hand player1 = new Hand();
        Hand player2 = new Hand();

        Deck deck = new Deck();
        deck.shuffle();

        player1.deal(deck.deal());
        player2.deal(deck.deal());
        player1.deal(deck.deal());
        player2.deal(deck.deal());

        System.out.println(player1Name + " : " + player1.getValue());
        System.out.println(player2Name + " : " + player2.getValue());
        if (player1.getValue() > player2.getValue()) {
            System.out.println("Player 1 wins!");
        } else if (player1.getValue() < player2.getValue()) {
            System.out.println("Player 2 wins!");
        } else System.out.println("Tie!");
    }
}
