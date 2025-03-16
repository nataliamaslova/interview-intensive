package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ["foo", "1bar", "a2b"] -> ["foo", "bar", "ab"]
 */
public class RemoveDigits {
    public static void main(String[] args) {
        String[] input = {"foo", "1bar", "a2b"};
        System.out.println(Arrays.toString(removeDigits(input)));

        List<String> inputList = List.of("foo", "1bar", "a2b");
        System.out.println(removeDigits(inputList));
    }

    public static String[] removeDigits(String[] sArray) {
        String[] newSArray = new String[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            newSArray[i] = sArray[i].replaceAll("\\d", "");
        }
        return newSArray;
    }

    public static List<String> removeDigits(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            result.add(s.replaceAll("\\d", ""));
        }
        return result;
    }
}
