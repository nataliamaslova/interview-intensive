package hw2.nestedloops;

import java.util.Scanner;

/**
 Задача 5: Шахматная доска
 Выведите шахматную доску размером N x N, где клетки чередуются символами # и ..
 Пример:
 #.#.
 .#.#
 #.#.
 .#.#

 */
public class ChessBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер шахматной доски N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) { // строки
            for (int j = 0; j < n; j++) { // столбцы
                // Если сумма индексов чётная, выводим '#', иначе - '.'
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println(); // переход на новую строку

            scanner.close();
        }
    }
}
