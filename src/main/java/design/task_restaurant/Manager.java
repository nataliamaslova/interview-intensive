package design.task_restaurant;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Printable> dishes;

    public Manager() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Printable dish) {
        dishes.add(dish);
    }

    public void representDescription(Printable dish) {
        dish.print();
    }

    public void representDescriptionAll() {
        for(Printable dish: dishes) {
            dish.print();
        }
    }
}
