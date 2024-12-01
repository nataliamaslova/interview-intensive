package hw4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задача 3: Списки (Lists)
 * Разработать метод, который принимает список целых чисел и
 * удаляет из него все четные числа.
 */
public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 9, 6, 3, 0, 77, -3, 4));
        System.out.println("Initial list: " + list);

        removeEvenNumbers(list);
//        removeEvenNumbersWithIterator(list);
        System.out.println("List without even numbers: " + list);
    }

    public static void removeEvenNumbers(List<Integer> list) {
        list.removeIf(number -> number % 2 == 0);
    }

    public static void removeEvenNumbersWithIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
