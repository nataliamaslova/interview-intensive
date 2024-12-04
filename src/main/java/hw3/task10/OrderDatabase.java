package hw3.task10;

import hw3.task10.order.Order;
import hw3.task10.products.Closing;
import hw3.task10.products.Electronics;
import hw3.task10.users.Customer;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * Дополнительно:
 * Реализуйте интерфейс для работы с базой данных заказов, используя HashMap.
 */
public class OrderDatabase implements DatabaseOperations {
    private HashMap<Integer, Order> orders = new HashMap<>();

    @Override
    public void saveOrder(Order order) {
        orders.put(order.getOrderId(), order);
        System.out.printf("Order saved with id = %s\n", order.getOrderId());
    }

    @Override
    public Order getOrder(int orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new NoSuchElementException("Order not found");
        }
        return order;
    }

    @Override
    public String toString() {
        return "OrderDatabase{" +
                "orders=" + orders +
                '}';
    }

    public static void main(String[] args) {
        OrderDatabase orderDatabase = new OrderDatabase();
        Customer customer = new Customer(1, "Masha", "masha@gmail.com");
        Electronics eProduct = new Electronics(11, "mixer", 75);
        Closing cProduct = new Closing(22, "coat", 60);
        customer.addProduct(eProduct);
        customer.addProduct(cProduct);
        Order order = new Order(111, customer);
        order.calculateTotalPrice();
        orderDatabase.saveOrder(order);
        System.out.println(orderDatabase);
    }
}
