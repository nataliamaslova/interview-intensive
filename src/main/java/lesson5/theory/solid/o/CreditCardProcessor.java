package lesson5.theory.solid.o;

/**
 * O (Open/Closed Principle): Код должен быть открыт для
 * расширения, но закрыт для модификации.
 * Пример: Используйте интерфейсы.
 */
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        // Обработка оплаты картой
    }
}
