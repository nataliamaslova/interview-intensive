package hw2.ifswitch;

import java.util.Scanner;

/**
 Задача 5: Проверка делимости
 Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.
 Пример:
 Введите число: 15
 Результат: Делится на 3 и 5

 */
public class PrintDivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Результат: Делится на 3 и 5");
        }
        else {
            System.out.println("Результат: Не делится на 3 и 5");
        }
    }
}
