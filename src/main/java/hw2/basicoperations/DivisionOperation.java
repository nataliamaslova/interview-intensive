package hw2.basicoperations;

import java.util.Scanner;

public class DivisionOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.printf("Результат деления: %d\n", a / b);
        System.out.printf("Остаток: %d\n", a % b);

        scanner.close();
    }
}
