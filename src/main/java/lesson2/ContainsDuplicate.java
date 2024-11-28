package lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача 9: Проверка наличия дубликатов в массиве
 * Напишите программу, которая проверяет, содержатся ли дубликаты в
 * массиве. Если дубликаты найдены, верните true, если нет — false.
 * Подсказка: Используйте HashSet для хранения уникальных элементов.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println(isContainsDuplicateImproved(nums));
    }

    public static boolean isContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean flag = false;
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isContainsDuplicateImproved(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

}
