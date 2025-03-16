package design.task_restaurant;


public class Main {
    public static void main(String[] args) {
        Printable hotDish = new HotDish(70);
        Printable drink = new Drink(450);

        Manager manager = new Manager();
        manager.addDish(hotDish);
        manager.addDish(drink);
        manager.representDescription(hotDish);
        manager.representDescription(drink);

        manager.representDescriptionAll();
    }
}
