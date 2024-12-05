package hw5.discount;

/**
 * Исходный код (плохой)
 * Задание: подумать над улучшением кода
 */
public class DiscountCalculatorInitial {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("regular")) {
            return amount * 0.05;
        } else if (customerType.equals("vip")) {
            return amount * 0.10;
        } else if (customerType.equals("employee")) {
            return amount * 0.30;
        } else {
            return 0;
        }
    }

}
