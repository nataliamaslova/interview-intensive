package hw3.task10.order;

import hw3.task10.products.Product;
import hw3.task10.users.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Order:
 * Поля: orderId, customer, productList, totalPrice.
 * Метод для расчета общей стоимости заказа.
 */
public class Order {
    private final int orderId;
    private Customer customer;
    private List<Product> productList;
    double totalPrice;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = new ArrayList<>(customer.getCart());
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void calculateTotalPrice() {
        totalPrice = 0d;
        for (Product product : productList) {
            product.applyDiscount();
            totalPrice += product.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", productList=" + productList +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
