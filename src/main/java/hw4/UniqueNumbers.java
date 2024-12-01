package hw4;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача 6: Множества (Sets)
 * Написать функцию, которая принимает массив целых чисел и
 * возвращает количество уникальных чисел в этом массиве.
 */
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {5, 9, 6, 9, 0, 5, -3, 4};
        System.out.println(countUniqueNumbers(array));
    }

    public static int countUniqueNumbers(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int i : array) {
            set.add(i);
        }
        return set.size();
    }
}
