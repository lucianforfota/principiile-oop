package exercitii.ex7paymentsapprevised;

public class CreditCard extends Card {

    private int maxOverDraft;


    public CreditCard(int pin, String cardNumber, int maxOverDraft) {
        super(pin, cardNumber);
        this.maxOverDraft = maxOverDraft;
    }

    public int getMaxOverDraft() {
        return maxOverDraft;
    }

    public void setMaxOverDraft(int maxOverDraft) {
        this.maxOverDraft = maxOverDraft;
    }

    @Override
    public void pay(int amount) {
        //suprascriu cod in credit card
    }
}
