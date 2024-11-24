package hw2.nestedloops;

import java.util.Scanner;

/**
Задача 2: Прямоугольник из звёздочек
Напишите программу, которая выводит прямоугольник из
звёздочек размером M x N (пользователь вводит размеры).
 */
public class StarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество звездочек в строке M: ");
        int m = scanner.nextInt();
        System.out.print("Введите количество строк N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Печать строки звёздочек
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            // Переход на следующую строку
            System.out.println();
        }

        scanner.close();
    }
}
