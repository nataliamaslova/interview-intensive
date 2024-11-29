package hw3.task8;

/**
 * Задача 8: Банковский счет и принципы ООП
 * Описание:
 * Создайте приложение для управления банковскими счетами, которое включает следующие классы:
 * Абстрактный класс BankAccount:
 * Поля: accountNumber (номер счета), balance (баланс).
 * Методы:
 * Абстрактный метод calculateInterest().
 * Реализация метода deposit(double amount) для пополнения счета.
 * Реализация метода withdraw(double amount) с проверкой на достаточность средств.
 * Класс SavingsAccount:
 * Наследуется от BankAccount.
 * Реализует метод calculateInterest(), добавляя 5% годовых к балансу.
 * Класс CheckingAccount:
 * Наследуется от BankAccount.
 * Реализует метод calculateInterest() без начисления процентов.
 * Инкапсуляция:
 * Поля accountNumber и balance должны быть приватными, с геттерами и сеттерами.
 * Полиморфизм:
 * Используйте массив объектов BankAccount, чтобы показать работу методов для разных типов счетов.
 */
public abstract class BankAccount {
    protected final long accountNumber;
    protected double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
        }
        else {
            throw new IllegalArgumentException("Not enough money");
        }
    }
}
