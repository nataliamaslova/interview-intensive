package lesson5.discount;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountVipStrategy = new DiscountStrategyHandler().getStrategy(CustomerType.VIP);
        System.out.println(discountVipStrategy.calculate(200));

        DiscountStrategy discountEmployeeStrategy = new DiscountStrategyHandler().getStrategy(CustomerType.EMPLOYEE);
        System.out.println(discountEmployeeStrategy.calculate(200));

        DiscountStrategy discountRegularStrategy = new DiscountStrategyHandler().getStrategy(CustomerType.REGULAR);
        System.out.println(discountRegularStrategy.calculate(200));

    }
}
