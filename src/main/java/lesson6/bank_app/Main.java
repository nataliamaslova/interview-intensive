package lesson6.bank_app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account corporate = new Account("1", "123344", AccountType.CORPORATE, 100);
        Account personal = new Account("2", "12233", AccountType.PERSONAL, 20);

        BankApp bankApp = new BankApp(List.of(corporate, personal));

//        bankApp.switchActiveAccountTo(corporate);

        bankApp.showBalance();
        bankApp.transferTo(personal, 20);
        bankApp.switchActiveAccountTo(personal);
        bankApp.showBalance();
    }
}
