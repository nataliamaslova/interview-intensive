package hw6.calories;

import java.util.ArrayList;
import java.util.List;

public class CaloriesHistory {
    List<Integer> dailyCalories;

    public CaloriesHistory() {
        dailyCalories = new ArrayList<>();
    }

    public void storeDay(int calories) {
        dailyCalories.add(calories);
    }

    public double getAverageCalories() {
        if (dailyCalories.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int i : dailyCalories) {
            sum += i;
        }
        return sum / dailyCalories.size();
    }
}
