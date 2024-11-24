package hw2.ifswitch;

import java.util.Scanner;

/**
 Задача 4: Проверка возраста
 Напишите программу, которая определяет категорию человека по возрасту:
 0-12: Ребёнок
 13-17: Подросток
 18-64: Взрослый
 65+: Пенсионер.
 Используйте if-else.
 Пример:
 Введите возраст: 30
 Результат: Взрослый
 */
public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Некорректный возраст");
        }
        if (a >= 0 && a <= 12) {
            System.out.println("Ребёнок");
        }
        if (a >= 13 && a <= 17) {
            System.out.println("Подросток");
        }
        if (a >= 18 && a <= 64) {
            System.out.println("Взрослый");
        }
        else {
            System.out.println("Пенсионер");
        }

        scanner.close();
    }
}
