package hw5.discount;

public class DiscountCalculator {
    public double calculateDiscount(CustomerType customerType, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        return amount * customerType.getDiscountRate();
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        double regularDiscount = calculator.calculateDiscount(CustomerType.REGULAR, 200.0);
        double vipDiscount = calculator.calculateDiscount(CustomerType.VIP, 200.0);
        double employeeDiscount = calculator.calculateDiscount(CustomerType.EMPLOYEE, 200.0);

        System.out.println("Regular Discount: " + regularDiscount);
        System.out.println("VIP Discount: " + vipDiscount);
        System.out.println("Employee Discount: " + employeeDiscount);
    }
}
