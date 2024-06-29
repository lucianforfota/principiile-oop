package algortimica;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;


    private List<String> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void dealHand (int numberOfCards, Deck deck){
        //din pachetu care vine ca parametru sa iau ultimele nuberOFCardsCarti (sa vedem daca avem ceva metoda) si astea le adauin hand
        //sterg cartile din cards a lui deck si le pun in playedCards l lui deck
    }

    public void clearHand(){
        hand.clear();
    }


}
