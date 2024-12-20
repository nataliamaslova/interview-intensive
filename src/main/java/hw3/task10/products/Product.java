package hw3.task10.products;

/**
 * Класс Product:
 * Поля: id, name, price.
 * Абстрактный метод applyDiscount().
 */
public abstract class Product {
    protected final int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void applyDiscount();
}
