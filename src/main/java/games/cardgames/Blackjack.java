package games.cardgames;


import interfaces.GamblingGame;
import interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import player.FatCatDealer.BlackjackDealer;
import player.Player;

import java.util.ArrayList;

public class Blackjack implements Game, GamblingGame {
    Console console;
    private ArrayList<Card> cards;
    private Integer integer;

    public Blackjack(Console console) {
        this.console = console;
    }

    public Blackjack(ArrayList<Card> deck) {
        this.cards = deck;
    }

    public Blackjack(Integer integer) {
        this.integer = integer;
    }

    //TODO:
    BlackjackDealer blackjackDealer = new BlackjackDealer();

    public void addPlayer(Player player) {
//        BlackjackEngine blackjackEngine = new BlackjackEngine();
    }

    public void removePlayer(Player player) {

    }

    public void startGame() {
        console.println("Welcome to BlackJack!");

        //Create playing deck
        DeckOfCards playingDeck = new DeckOfCards();
 //       playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        //Test Print
      // console.print(playingDeck.toString());
    }

    public void endGame() {

    }

    public String results(ArrayList<java.lang.Integer> scores) {
        return null;
    }

    public void startPlayersTurn() {

    }

    public void finishTurn() {

    }

    public java.lang.Integer getPlayerBet() {
        return null;
    }

    public java.lang.Integer payWinnings() {
        return null;
    }

//    public int handValue() {
//        int totalValue = 0;
//        int aceCount = 0;
//        for (Card card : this.cards) {
//            switch (card.getCardValue()) {
//                case TWO:
//                    totalValue += 2;
//                    break;
//                case THREE:
//                    totalValue += 3;
//                    break;
//                case FOUR:
//                    totalValue += 4;
//                    break;
//                case FIVE:
//                    totalValue += 5;
//                    break;
//                case SIX:
//                    totalValue += 6;
//                    break;
//                case SEVEN:
//                    totalValue += 7;
//                    break;
//                case EIGHT:
//                    totalValue += 8;
//                    break;
//                case NINE:
//                    totalValue += 9;
//                    break;
//                case TEN:
//                    totalValue += 10;
//                    break;
//                case JACK:
//                    totalValue += 10;
//                    break;
//                case QUEEN:
//                    totalValue += 10;
//                    break;
//                case KING:
//                    totalValue += 10;
//                    break;
//                case ACE:
//                    aceCount++;
//                    break;
//            }
//        }
//        for (int i = 0; i < aceCount; i++) {
//            if (totalValue > 10) {
//                totalValue += 1;
//            } else {
//                totalValue += 11;
//            }
//
//        }
//        return totalValue;
//    }

    // taking a new card from the stake into player's array of cards
    public Card hit(){
        return null;
    }
    // taking a new card from the stack into the player's array of cards & doubling player's current bet & only hitting 1x
    public Card doubleDown(java.lang.Integer bet) {
        return null;
    }
    // taking no more cards into player's array of cards continue game until winner is found
    public Boolean stand() {
        return null;
    }

    public Card split() {
        return null;
    }
}
