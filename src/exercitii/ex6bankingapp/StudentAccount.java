package exercitii.ex6bankingapp;

public class StudentAccount extends BankAccount{

    private int maxDepositAmount;

    public StudentAccount(String accountNumber, int maxDepositAmount) {
        super(accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public int getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void setMaxDepositAmount(int maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > getBalance() ){
            System.out.println("esti sarac");
        } else {
            setBalance(getBalance()-amount);
        }
    }

    @Override
    public void deposit(int amount) {
        if (amount > maxDepositAmount ){
            System.out.println("vrei tu sa pari bogat, saracule!");
        } else {
            setBalance(getBalance()+amount);
        }
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "maxDepositAmount=" + maxDepositAmount +
                "balance=" + getBalance() +
                "acccount number=" + getAccountNumber() +
                '}';
    }
}
