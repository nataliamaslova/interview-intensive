package hw2.fortasks;

import java.util.Scanner;

/**
 Задача 4: Факториал числа
 Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
 Пример:
 Введите N: 4
 Факториал: 24
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Факториал: " + result);
    }
}
