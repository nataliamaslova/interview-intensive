package hw4;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача 7: Словари (Maps)
 * Создать метод, который считает количество вхождений каждого
 * символа в переданной строке и возвращает результат в виде карты (map).
 */
public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String input = "Happy New Year";
        Map<Character, Integer> frequencyMap = countCharacterOccurrences(input);

        System.out.println("Количество вхождений символов:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacterOccurrences(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
