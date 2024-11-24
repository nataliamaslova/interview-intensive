package hw2.basicoperations;

import java.util.Scanner;
/**
 Задача 2: Площадь прямоугольника
 Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
 Пример:
 Ширина: 4
 Длина: 6
 Площадь: 24
 */
public class RectangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ширина: ");
        int a = scanner.nextInt();
        System.out.print("Длина: ");
        int b = scanner.nextInt();

        System.out.println("Площадь: " + (a * b));

        scanner.close();
    }
}
