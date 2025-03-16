package exercise;

import java.util.HashMap;

/**
 * Пример задачи. Посчитать количество букв в строке
 */
public class CountLettersInString {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "Пример задачи. Посчитать количество букв в строке";
        for(char i : s.toLowerCase().toCharArray()) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }
        System.out.println(map);
    }
}
