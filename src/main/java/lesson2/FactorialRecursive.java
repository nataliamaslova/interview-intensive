package lesson2;

/**
 * Задача 11: Вычисление факториала числа с использованием рекурсии
 * Напишите программу, которая вычисляет факториал числа с помощью
 * рекурсии.
 * Подсказка: Факториал числа n вычисляется как
 * n * (n - 1) * (n - 2) * ... * 1.
 */
public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n* factorial(n - 1);
        }
    }
}
