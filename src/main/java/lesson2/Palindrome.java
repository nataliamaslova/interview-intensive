package lesson2;

/**
 * Напишите программу, которая проверяет, является ли строка палиндромом.
 * Палиндром — это строка, которая читается одинаково слева направо и
 * справа налево (например, "level", "madam").
 * Подсказка: Используйте метод equalsIgnoreCase для сравнения строк,
 * и StringBuilder или цикл для переворота строки.
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "manka";//"level";
        if (isPalindrome2(s)) {
            System.out.printf("%s is a palindrome\n", s);
        } else {
            System.out.printf("%s is not a palindrome\n", s);
        }
    }

    public static boolean isPalindrome(String s) {
        String sReverse = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(sReverse);
    }

    public static boolean isPalindrome2(String s) {
        char[] array = s.toLowerCase().toCharArray();
        boolean flag = true;
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            if (array[i] != array[len - 1 - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
