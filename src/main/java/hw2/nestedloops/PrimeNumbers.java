package hw2.nestedloops;

import java.util.Scanner;

/**
 * Задача 4: Поиск простых чисел
 * Найдите все простые числа от 2 до N. Используйте вложенные циклы для проверки делимости.
 * Пример:
 * Введите N: 10
 * Простые числа: 2 3 5 7
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Введите N: ");
        int n = scanner.nextInt();

        System.out.print("Простые числа: ");
        for (int i = 2; i < n; i++) {
            int count = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // Простое число имеет всего два делителя:
            // делится без остатка только на 1 и на само себя
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
