package hw2.ifswitch;

import java.util.Scanner;
/**
 Задача 2: Калькулятор с использованием switch
 Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
 Пример:
 Введите первое число: 7
 Введите оператор: *
 Введите второе число: 3
 Результат: 21
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите оператор: ");
        String operator = scanner.next();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println("Результат: " + (a + b));
                break;
            case "-":
                System.out.println("Результат: " + (a - b));
                break;
            case "*":
                System.out.println("Результат: " + (a * b));
                break;
            case "/":
                System.out.println("Результат: " + (a / b));
                break;
        }
    }
}
