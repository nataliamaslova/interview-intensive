package hw4;

/**
 * Задача 4: Стеки (Stacks)
 * Написать функцию, использующую стек для проверки правильности
 * последовательности скобок в строке (например, "([]{})"
 * является правильной, а "([)]" — нет).
 */
import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        String input1 = "([]{})";
        String input2 = "([)]";

        System.out.println("Строка \"" + input1 + "\" корректна? " + isValid(input1));
        System.out.println("Строка \"" + input2 + "\" корректна? " + isValid(input2));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Открывающая скобка добавляется в стек
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Закрывающая скобка совпадает с верхней скобкой в стеке
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // То же для квадратных скобок
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // То же для фигурных скобок
            } else {
                return false; // Некорректная закрывающая скобка или стек пуст
            }
        }

        return stack.isEmpty(); // Если стек пуст, то последовательность корректна
    }
}
