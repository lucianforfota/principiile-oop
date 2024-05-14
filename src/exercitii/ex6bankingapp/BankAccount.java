package exercitii.ex6bankingapp;

public abstract class BankAccount {

    private int balance;
    private String accountNumber;

    public abstract void withdraw(int amount);
    public abstract void deposit(int amount);
}
