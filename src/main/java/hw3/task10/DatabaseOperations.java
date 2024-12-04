package hw3.task10;

import hw3.task10.order.Order;

/**
 * Интерфейс DatabaseOperations:
 * Методы: saveOrder(Order order) и getOrder(int orderId).
 */
public interface DatabaseOperations {
    void saveOrder(Order order);
    Order getOrder(int orderId);
}
