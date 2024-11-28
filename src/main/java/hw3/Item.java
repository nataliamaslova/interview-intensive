package hw3;

/**
 * Задача 3: Класс для представления единицы товара
 * Описание:
 * Создайте класс Item, который будет представлять товар.
 * Класс должен содержать:
 * Поля:
 * Название товара (name).
 * Цена товара (price).
 * Количество на складе (quantity).
 * Методы:
 * sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
 * restock(int amount): добавляет указанное количество на склад.
 * getInfo(): возвращает строку с информацией о товаре.
 */
public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (this.quantity > amount) {
            this.quantity -= amount;
        }
        else {
            System.out.println("Attention: not enough items");
        }
    }

    public void restock(int amount) {
        this.quantity += amount;
    }

    public String getInfo() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        Item item = new Item("copy-book", 2.5, 15);
        System.out.println(item.getInfo());
        item.sell(20);
        item.restock(21);
        System.out.println(item.getInfo());
        item.sell(20);
        System.out.println(item.getInfo());
    }
}
