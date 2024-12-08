package hw6;

import java.util.Stack;

/**
 * Задача 3: 30 min
 * Валидная скобочная последовательность (Valid Parentheses):
 * Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']',
 * определите, является ли входная строка валидной.
 * Входная строка валидна, если:
 * Открытые скобки закрыты скобками того же типа.
 * Открытые скобки закрыты в правильном порядке.
 * Каждая закрывающая скобка имеет соответствующую парную открывающую скобку.
 * Пример:
 * Вход: s = "()[]{}"
 * Выход: true
 */
public class ParenthesesValidator {
    public static void main(String[] args) {
        String input1 = "()[]{}";
        String input2 = "([]{}";
        String input3 = "([{)]}";
        String input4 = "([{}])";
        System.out.println("Строка " + input1 + " корректна? "  + isValid(input1));
        System.out.println("Строка " + input2 + " корректна? "  + isValid(input2));
        System.out.println("Строка " + input3 + " корректна? "  + isValid(input3));
        System.out.println("Строка " + input4 + " корректна? "  + isValid(input4));

    }

    public static boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Кладем открывающую скобку в стек
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Достаем открывающую круглую скобку из стека
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Достаем открывающую квадратную скобку из стека
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Достаем открывающую фигурную скобку из стека
            } else {
                return false; // Некорректная закрывающая скобка или стек пуст
            }
        }
        return stack.isEmpty(); // Если стек пуст, то последовательность корректна
    }
}
