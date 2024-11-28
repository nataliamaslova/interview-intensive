package lesson2;

/**
 * Задача 8: Поиск максимальной суммы в подмассиве
 * Напишите программу, которая находит максимальную сумму всех чисел в
 * подмассиве для заданного массива. Например, для массива
 * {1, -2, 3, 4, -1, 2, 1, -5, 4} максимальная сумма подмассива будет
 * равна 9 (для подмассива {3, 4, -1, 2, 1}).
 * Подсказка: Используйте алгоритм Кадана (Kadane's Algorithm).
 */
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println("Максимальная сумма подмассива: " +
                maxSubarraySum(nums));
    }

    public static int maxSubarraySum(int[] nums) {
        int maxSoFar = nums[0];        // Максимальная сумма подмассива
        int maxEndingHere = nums[0];   // Текущая максимальная сумма подмассива, который заканчивается текущим элементом

        for (int i = 1; i < nums.length; i++) {
            // Выбираем: добавить текущий элемент к текущей сумме или начать новый подмассив
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            // Обновляем глобальный максимум
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
