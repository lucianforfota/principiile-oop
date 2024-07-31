package exercitii.ex7paymentsapprevised;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingAccount {

    private String name;

    private List<Address> addresses;

    private List<Card> cards;

    private Card currentCard;

    private Address currentAddress;

    public ShoppingAccount(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void addPaymentMethod(Card card){
        cards.add(card);
    }

    public void addAddress(Address address){
        addresses.add(address);
    }

    public void removePaymentMethod(String cardNumber) throws Exception{
        Card card = findCardByCardNumber(cardNumber);
        cards.remove(card);
    }

    public void removeAddress(String street){

    }

    public Card findCardByCardNumber (String cardNumber) throws Exception{
        Optional<Card> cardOptional = cards.stream()
                .filter(card -> card.getCardNumber().equals(cardNumber))
                .findFirst();
        if (cardOptional.isEmpty()){
            throw new Exception("card does not exist");
        }
        return cardOptional.get();
    }

    public void selectPaymentMethod(String cardNumber) throws Exception{
        Card card = findCardByCardNumber(cardNumber);
        currentCard = card;

    }

    public void selectCurrentAddress(String street){

    }

    public void changeCardPin(String cardNumber, int newPin) throws Exception {
        Card card = findCardByCardNumber(cardNumber);
        card.changePin(newPin);
    }


}
