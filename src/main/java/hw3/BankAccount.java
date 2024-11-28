package hw3;

/**
 * Задача 2: Класс для представления банковского счета
 * Описание:
 * Создайте класс BankAccount, который будет представлять банковский счет.
 * Класс должен содержать:
 * Поля:
 * Номер счета (accountNumber).
 * Баланс (balance).
 * Методы:
 * deposit(double amount): пополнение счета.
 * withdraw(double amount): снятие денег с проверкой на достаточность средств.
 * getBalance(): возвращает текущий баланс.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Attention: not enough money");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("123456777", 100.0);
        System.out.println(ba);
        ba.deposit(50);
        System.out.println(ba);
        ba.withdraw(200);
        System.out.println(ba);
        ba.withdraw(25);
        System.out.println(ba);
    }
}
