package algortimica;

import java.util.ArrayList;
import java.util.List;

public class Deck {


    private List<String> suit;
    private List<String> rank;

    private List<String> cards;

    private List<String> playedCards;

    public Deck(List<String> suit, List<String> rank) {
        this.suit = suit;
        this.rank = rank;
        this.cards = new ArrayList<>();
    }

    public List<String> getSuit() {
        return suit;
    }

    public void setSuit(ArrayList<String> suit) {
        this.suit = suit;
    }

    public List<String> getRank() {
        return rank;
    }

    public void setRank(ArrayList<String> rank) {
        this.rank = rank;
    }

    public List<String> getCards() {
        return cards;
    }

    public void setCards(ArrayList<String> cards) {
        this.cards = cards;
    }

    public void generateCards () {
        //parcurgem cu for in for rank si suit
           //formam string-uri cu toate cominatiile si adaugam in cards
    }

    public void shuffleDeck (){
        //sa vedem daca este metoda care amesteaca
    }
}
