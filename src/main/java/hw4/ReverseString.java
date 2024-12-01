package hw4;

/**
 * Задача 2: Строки (Strings)
 * Создать функцию, которая принимает строку и возвращает её
 * в обратном порядке.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Interview is going on..."));
        System.out.println(reverseStringAlgorithm("Interview is going on..."));
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseStringAlgorithm(String s) {
        char[] sReversed = s.toCharArray();
        for (int i = 0; i < sReversed.length / 2; i++) {
            char c = sReversed[i];
            sReversed[i] = sReversed[sReversed.length - 1 - i];
            sReversed[sReversed.length - 1 - i] = c;
        }
        return String.valueOf(sReversed);
    }
}
