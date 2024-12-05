package lesson5.discount;

public class DiscountRegularStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
