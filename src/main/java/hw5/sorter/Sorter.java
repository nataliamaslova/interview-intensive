package hw5.sorter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sorter {
    private final Map<String, SortingStrategy> strategies = new HashMap<>();

    public Sorter () {
        strategies.put("bubble", new BubbleSort());
        strategies.put("merge", new MergeSort());
        strategies.put("quick", new QuickSort());
    }

    public void sort(int[] array, String algorithm) {
        SortingStrategy strategy = strategies.get(algorithm);
        strategy.sort(array);
    }

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] array = {8, 5, 15, 7, -9, 0, -1};
        sorter.sort(array, "bubble");
        System.out.println(Arrays.toString(array));
    }
}