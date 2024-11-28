package lesson2;

import java.util.Arrays;

/**
 * Задача 10: Сортировка массива
 * Напишите программу, которая сортирует массив целых чисел по возрастанию
 * с использованием алгоритма сортировки пузырьком.
 * Подсказка: Используйте два вложенных цикла для сравнения и обмена
 * элементов.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
    }

    public static void bubbleSort1(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
