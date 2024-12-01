package hw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Задача 5: Очереди (Queues)
 * Разработать метод, который использует очередь для ротации
 * элементов массива вправо на n позиций.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Исходный массив: " + Arrays.toString(array));

        rotateArray(array, n);

        System.out.println("Массив после ротации на " + n + " позиций:" + Arrays.toString(array));
    }

    public static void rotateArray(int[] array, int n) {
        int length = array.length;

        // Ротация на length или больше эквивалентна ротации на (n % length)
        n = n % length;
        if (n == 0) return; // Если ротация не требуется

        // Используем очередь
        Queue<Integer> queue = new LinkedList<>();

        // Сначала добавляем последние n элементов массива в очередь
        for (int i = length - n; i < length; i++) {
            queue.add(array[i]);
        }

        // Затем добавляем оставшиеся элементы массива
        for (int i = 0; i < length - n; i++) {
            queue.add(array[i]);
        }

        // Перезаписываем массив из очереди
        for (int i = 0; i < length; i++) {
            array[i] = queue.poll();
        }
    }
}
