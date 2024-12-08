package hw6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача 1: 35 min
 *
 * Двусуммный (Two Sum): Дан массив целых чисел nums и целое число target.
 * Найдите два числа в массиве так, чтобы их сумма была равна target.
 * Верните их индексы. Вы можете предположить, что каждый вход будет иметь
 * ровно одно решение, и вы не можете использовать один и тот же элемент
 * дважды. Вы можете вернуть ответ в любом порядке.
 *
 * Вход: nums = [2, 7, 11, 15], target = 9 Выход: [0, 1]
 * Выход объяснение: nums[0] + nums[1] == 9, мы возвращаем [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        // if output is [0, 0] it means no such elements were found in array

        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }

    // My solution: O(n^2)
    public static int[] twoSum(int[] array, int target) {
        int[] result = {0, 0};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] + array[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // from chatGPT: O(n)
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

}
