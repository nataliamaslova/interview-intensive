package hw2.fortasks;

import java.util.Scanner;

/**
 Задача 2: Сумма чисел от 1 до N
 Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
 Пример:
 Введите N: 5
 Сумма: 15
 */
public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма: " + sum);
    }
}
