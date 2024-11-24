package hw2.basicoperations;
/**
 Задача 5: Обмен значениями переменных
 Поменяйте значения двух переменных местами без использования третьей переменной.
 Пример:
 До обмена: a = 5, b = 10
 После обмена: a = 10, b = 5
 */

public class ExchangeVariables {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.printf("До обмена: a = %d, b = %d\n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("После обмена: a = %d, b = %d\n", a, b);
    }
}
