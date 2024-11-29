package hw3.task8;

import hw3.task8.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        this.balance *= 1.05;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
