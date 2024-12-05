package lesson5.discount;

public class DiscountEmployeeStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.30;
    }
}
