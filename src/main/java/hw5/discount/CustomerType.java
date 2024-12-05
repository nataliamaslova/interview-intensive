package hw5.discount;

public enum CustomerType {
    REGULAR(0.05),
    VIP(0.10),
    EMPLOYEE(0.30);

    private final double discountRate;

    CustomerType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
