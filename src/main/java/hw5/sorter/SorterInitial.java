package hw5.sorter;

/**
 * Исходный код (плохой)
 * Задание: подумать над улучшением кода
 */
public class SorterInitial {
    public void sort(int[] array, String algorithm) {
        if (algorithm.equals("bubble")) {
            // Реализация пузырьковой сортировки
            System.out.println("Sorting using bubble sort");
        } else if (algorithm.equals("merge")) {
            // Реализация сортировки слиянием
            System.out.println("Sorting using merge sort");
        } else if (algorithm.equals("quick")) {
            // Реализация быстрой сортировки
            System.out.println("Sorting using quick sort");
        } else {
            throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithm);
        }

    }
}
