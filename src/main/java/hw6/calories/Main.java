package hw6.calories;

public class Main {
    public static void main(String[] args) {
        Dish breakfast1 = new Dish("eggs with bacon, buckwheat porridge, cabbage salad, tea", 400);
        Dish lunch1 = new Dish("borsch with meat, bread, juice", 400);
        Dish snack1 = new Dish("sandwich and tea", 200);
        Dish dinner1 = new Dish("cottage cheese pancakes and johurt", 200);

        Dish breakfast2 = new Dish("oatwheat porridge, salmon, avocado, bread and a tea", 350);
        Dish lunch2 = new Dish("soup with fish, bread, juice", 350);
        Dish snack2 = new Dish("cottage and cookies", 180);
        Dish dinner2 = new Dish("pizza with meat", 300);

        DayCaloriesTracker dayTracker1 = new DayCaloriesTracker();
        dayTracker1.addDish(breakfast1);
        dayTracker1.addDish(lunch1);
        dayTracker1.addDish(snack1);
        dayTracker1.addDish(dinner1);

        dayTracker1.displayDishes();
        System.out.println("Total calories: " + dayTracker1.getTotalCalories() + '\n');

        DayCaloriesTracker dayTracker2= new DayCaloriesTracker();
        dayTracker2.addDish(breakfast2);
        dayTracker2.addDish(lunch2);
        dayTracker2.addDish(snack2);
        dayTracker2.addDish(dinner2);
        dayTracker2.removeDish("Cottage and Cookies");

        dayTracker2.displayDishes();
        System.out.println("Total calories: " + dayTracker2.getTotalCalories() + '\n');

        CaloriesHistory history = new CaloriesHistory();
        history.storeDay(dayTracker1.getTotalCalories());

        history.storeDay(dayTracker2.getTotalCalories());

        System.out.println("Average calories: " + history.getAverageCalories());
    }
}
