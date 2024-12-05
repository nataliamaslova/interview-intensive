package lesson5.discount;

public class DiscountStrategyHandler {
    public DiscountStrategy getStrategy(CustomerType customerType) {
        return switch (customerType) {
            case VIP -> new DiscountVipStrategy();
            case REGULAR -> new DiscountRegularStrategy();
            case EMPLOYEE -> new DiscountEmployeeStrategy();
            default -> throw new IllegalArgumentException("Unknown Customer type");
        };
    }
}
