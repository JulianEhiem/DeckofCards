package com.company;

public class Main {

    public static void main(String[] args) {
        int[] cards = new int[52];
        for(int i = 0; i < cards.length; i++){
            cards[i] = i + 1;
        }
        int randomNumber = (int)(Math.random() * cards.length);
        int card = cards[randomNumber];
        getCardValue(card);
    }

    public static void getCardValue(int card){
        String[] suites = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] cardTypes = {"Ace","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
        int suite = card/13;
        int cardType;
        if (card < 13) {
            cardType = card;
        } else {
            cardType = card % 13;
        }
        System.out.println("A random card from the deck is " + cardTypes[cardType] + " of " + suites[suite]);
    }
}
