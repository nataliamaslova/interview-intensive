package hw2.ifswitch;

import java.util.Scanner;
/**
Задача 1: Проверка чётности числа
Напишите программу, которая проверяет, является ли число чётным или нечётным.
Пример:
Введите число: 8
Результат: Чётное
 */
public class PrintOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
