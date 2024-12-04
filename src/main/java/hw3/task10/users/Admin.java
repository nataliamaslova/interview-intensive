package hw3.task10.users;

import hw3.task10.products.Product;

/**
 * Подкласс Admin:
 * добавляет метод для изменения цены товара.
 */
public class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void updatePrice(Product product, double price) {
        product.setPrice(price);
    }
}
