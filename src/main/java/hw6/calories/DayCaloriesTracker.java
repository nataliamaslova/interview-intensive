package hw6.calories;

import java.util.ArrayList;
import java.util.List;

public class DayCaloriesTracker {
    private List<Dish> dishes;

    public DayCaloriesTracker() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(String name) {
        dishes.removeIf(dish -> dish.getName().equalsIgnoreCase(name));
    }

    public int getTotalCalories() {
        int totalCalories = 0;
        for (Dish dish : dishes) {
            totalCalories += dish.getCalories();
        }
        return  totalCalories;
    }

    public void displayDishes() {
        if (dishes.isEmpty()) {
            System.out.println("No dishes for today");
        } else {
            for (Dish dish : dishes) {
                System.out.println(dish);
            }
        }
        System.out.println();
    }
}
