package hw2.ifswitch;

import java.util.Scanner;

/**
 Задача 3:  Определение времени года
 Пользователь вводит номер месяца (1-12). Выведите название
 соответствующего времени года, используя switch.
 Пример:
 Введите номер месяца: 12
 Результат: Зима
 */
public class PrintSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
        }
    }
}
