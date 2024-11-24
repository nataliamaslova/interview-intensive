package hw2.fortasks;

import java.util.Scanner;

/**
Задача 5: Чётные числа до N
Пользователь вводит число N. Выведите все чётные числа от 1 до N.
Пример:
Введите N: 10
Чётные числа: 2 4 6 8 10
 */
public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        System.out.print("Чётные числа: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }
}
