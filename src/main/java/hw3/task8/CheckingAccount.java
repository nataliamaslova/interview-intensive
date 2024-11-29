package hw3.task8;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
