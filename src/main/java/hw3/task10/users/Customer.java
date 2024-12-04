package hw3.task10.users;

import hw3.task10.products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Подкласс Customer:
 * добавляет поле cart (корзина), метод для добавления товара в корзину.
 */
public class Customer extends User {
    private List<Product> cart = new ArrayList<>();

    public Customer(int id, String name, String email) {
        super(id, name, email);
    }

    public List<Product> getCart() {
        return cart;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cart=" + cart +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
