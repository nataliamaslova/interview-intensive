package hw2.basicoperations;

import java.util.Scanner;

/**
 Задача 1: Сложение и вычитание чисел
 Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
 Пример ввода:
 10
 5
 Пример вывода:
 Сумма: 15
 Разность: 5
 */

public class SumAndSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));

        scanner.close();
    }
}
