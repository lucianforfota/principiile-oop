package exercitii.arraysoo.ex1;

import java.util.ArrayList;

public class Phone {

    private ArrayList<String> validNumbers;
    private ArrayList<String> blockedNumbers;


    public Phone(ArrayList<String> validNumbers, ArrayList<String> blockedNumbers) {
        this.validNumbers = validNumbers;
        this.blockedNumbers = blockedNumbers;
    }

    public ArrayList<String> getValidNumbers() {
        return validNumbers;
    }

    public void setValidNumbers(ArrayList<String> validNumbers) {
        this.validNumbers = validNumbers;
    }

    public ArrayList<String> getBlockedNumbers() {
        return blockedNumbers;
    }

    public void setBlockedNumbers(ArrayList<String> blockedNumbers) {
        this.blockedNumbers = blockedNumbers;
    }

    public void addToBlackList(String number){
        int numberPosition = validNumbers.indexOf(number);
        blockedNumbers.add(validNumbers.get(numberPosition));
        validNumbers.remove(numberPosition);

    }
}
