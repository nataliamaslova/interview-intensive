package lesson6.bank_app;

import java.util.List;

public class BankApp {
    private List<Account> accounts;
    private Account activeAccount;

    public BankApp(List<Account> accounts) {
        if (accounts.isEmpty()) throw new IllegalStateException("No account for bank app");
        this.accounts = accounts;
        this.activeAccount = accounts.get(0);
    }

    public void showBalance() {
        System.out.println("Balance is: " + activeAccount.getBalance());
    }

    public void transferTo(Account account, int amount) {
        activeAccount.transferTo(account, amount);
    }

    public void switchActiveAccountTo(Account account) {
        if (activeAccount.getId().equals(account.getId())) throw new IllegalStateException("You are already using the same account");
        activeAccount = account;
    }
}
