package hw2.nestedloops;

/**
 Задача 1: Таблица умножения
 Выведите таблицу умножения от 1 до 10 в формате:
 1 x 1 = 1
 1 x 2 = 2
 ...
 10 x 10 = 100
 */
public class MultiplyTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
