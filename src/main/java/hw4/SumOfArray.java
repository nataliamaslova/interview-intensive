package hw4;

/**
 * Задача 1: Массивы (Arrays)
 * Написать метод, который принимает массив целых чисел
 * и возвращает сумму всех элементов массива.
 */
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {8, 10, 3, 9, 2, 6, 5};
        System.out.println(sum(array));
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
