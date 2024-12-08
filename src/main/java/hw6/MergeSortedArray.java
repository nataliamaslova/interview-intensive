package hw6;

import java.util.Arrays;

/**
 * Задача 4: 1h
 * Объединение двух отсортированных массивов (Merge Sorted Array):
 * Даны два отсортированных массива nums1 и nums2 размерами m и n соответственно. nums1 имеет достаточно места (размер равен m + n), чтобы вместить дополнительные элементы из nums2. Объедините элементы nums2 в nums1 так, чтобы новый массив nums1 остался отсортированным.
 * Пример:
 * Вход:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Выход:
 * [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    public static void main(String[] args) {
//        int[] num1 = {1, 2, 3, 0, 0, 0};
//        int[] num2 = {2, 5, 6};

        int[] num1 = {7, 15, 19, 0, 0, 0};
        int[] num2 = {2, 5, 6};

        int m = 3, n = 3;
        merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p2 = n - 1; // индекс последнего элемента в nums1
        int p1 = m - 1; // индекс последнего элемента в nums2
        int k = n + m - 1; // индекс последней позиции в nums1
        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[k--] = nums1[p1--];
            } else {
                nums1[k--] = nums2[p2--];
            }
        }
        // Если остались элементы в nums2, переносим их
        while (p2 >= 0) {
            nums1[k--] = nums2[p2--];
        }
    }
}
