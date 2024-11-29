package hw3.task8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(2600380000790L, 100);
        CheckingAccount checkingAccount = new CheckingAccount(2600380000789L, 100);
        List<BankAccount> accounts = List.of(savingsAccount, checkingAccount);
        System.out.println("Start accounts:");
        System.out.println(accounts);
        for (BankAccount account : accounts) {
            account.deposit(300);
            account.withdraw(200);
            account.calculateInterest();
        }
        System.out.println("Finish accounts:");
        System.out.println(accounts);
    }
}
