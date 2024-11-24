package hw2.nestedloops;

import java.util.Scanner;
/**
Задача 3: Пирамида из звёздочек
Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
Пример:
   *
  ***
 *****
 */

public class StarPyramyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту пирамиды N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Печать пробелов
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Печать звёздочек
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
