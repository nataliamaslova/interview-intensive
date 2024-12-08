package lesson6;

public class RepeatedLetters {
    public static void main(String[] args) {
        System.out.println(removeRepeatedLetters("root"));
        System.out.println(removeRepeatedLetters("r"));
        System.out.println(removeRepeatedLetters(""));
        System.out.println(removeRepeatedLetters(" "));
        System.out.println(removeRepeatedLetters("roott"));
        System.out.println(removeRepeatedLetters("rrroott"));

        System.out.println("=====");
        System.out.println(removeRepeatedLettersRegEx("root"));
        System.out.println(removeRepeatedLettersRegEx("r"));
        System.out.println(removeRepeatedLettersRegEx(""));
        System.out.println(removeRepeatedLettersRegEx(" "));
        System.out.println(removeRepeatedLettersRegEx("roott"));
        System.out.println(removeRepeatedLettersRegEx("rrroottt"));

//        System.out.println("=====");
//        System.out.println(removeRepeatedLettersRegEx("aabbccddeeff"));

//        String input = "aabbccddeeff";
//        String output = input.replaceAll("(\\w)\\1+", "$1");
    }

    public static String removeRepeatedLetters(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }
        char prev = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(prev);
        for (int i = 1; i < str.length(); i++) {
            if (prev != str.charAt(i)) {
                prev = str.charAt(i);
                sb.append(prev);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicatesInLecture(String str) {
        StringBuilder res = new StringBuilder();

        if (str.isEmpty()) throw new IllegalStateException("Str is empty");
        char currentSymbol = str.charAt(0);

        if (str.length() == 1) res.append(currentSymbol);

        for (int i = 0; i < str.length(); i++) {
            if (currentSymbol != str.charAt(i)) {
                res.append(currentSymbol);
                currentSymbol = str.charAt(i);
            }
            if (i == str.length() - 1) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public static String removeRepeatedLettersRegEx(String input) {
        return input.replaceAll("(\\w)\\1+", "$1");
    }
}
