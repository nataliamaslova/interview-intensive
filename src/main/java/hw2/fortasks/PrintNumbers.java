package hw2.fortasks;
/**
 Задача 1: Вывод чисел от 1 до 10
 Напишите программу, которая выводит все числа от 1 до 10.
 Пример вывода:
 1 2 3 4 5 6 7 8 9 10
 */
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
