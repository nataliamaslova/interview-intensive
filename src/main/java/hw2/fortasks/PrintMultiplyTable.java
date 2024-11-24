package hw2.fortasks;

import java.util.Scanner;

/**
 Задача 3: Таблица умножения для числа
 Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
 Пример:
 Введите число: 3
 3 x 1 = 3
 3 x 2 = 6
 ...
 3 x 10 = 30
 */
public class PrintMultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        scanner.close();
    }
}
