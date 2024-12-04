package hw3.task10.products;

/**
 * Подкласс Electronics:
 * скидка 10% при покупке свыше $100.
 */
public class Electronics extends Product {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 100) {
            this.setPrice(this.getPrice() * 0.90);
        } else {
            System.out.println("No discount: price is less than 100$");
        }

    }

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
