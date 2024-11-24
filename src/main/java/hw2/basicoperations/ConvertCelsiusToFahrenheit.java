package hw2.basicoperations;

import java.util.Scanner;

/**
 Задача 4: Перевод градусов Цельсия в Фаренгейты
 Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
 Формула: F = C * 9/5 + 32.
 Пример:
 Введите температуру в Цельсиях: 25
 Температура в Фаренгейтах: 77
 */

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в Цельсиях: ");
        int n = scanner.nextInt();

        int result =  n * 9/5 + 32;
        System.out.printf("Температура в Фаренгейтах: %d\n", result);

        scanner.close();
    }
}
