package hw3.task10.products;

/**
 * Подкласс Clothing:
 * скидка 15% при покупке свыше $50.
 */
public class Closing extends Product {

    public Closing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if(this.getPrice() > 50) {
            this.setPrice(this.getPrice() * 0.85);
        } else {
            System.out.println("No discount: price is less than 50$");
        }
    }

    @Override
    public String toString() {
        return "Closing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}