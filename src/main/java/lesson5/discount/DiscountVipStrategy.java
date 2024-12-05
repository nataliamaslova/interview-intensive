package lesson5.discount;

public class DiscountVipStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.10;
    }
}
