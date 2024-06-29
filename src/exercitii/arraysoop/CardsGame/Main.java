package exercitii.arraysoop.CardsGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> suit = Arrays.asList("spades","hearts","diamonds","clubs");
        List<String> rank = Arrays.asList("ace","2","3","4","5");
        Deck deck= new Deck(suit,rank);
        deck.generateCards();
        deck.shuffleDeck();
        Player player1 = new Player("player1");
        player1.dealHand(3,deck);
        Player player2 = new Player("player2");
        player2.dealHand(3,deck);
    }
}
