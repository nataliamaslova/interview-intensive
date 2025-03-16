package live_coding.interview_0;

/**
 * * input =hello this is a XYZ interview
 *  *
 *  * output =weivretni xyz a is this olleh
 */
public class ReverseWordsAndString {
    public static void main(String[] args) {
        String input = "hello this is a TCS interview";

        String output = processString(input);

        System.out.println(output);
    }

    public static String processString(String input) {
        String[] words = input.toLowerCase().split(" ");

        StringBuilder output = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0 || i == words.length - 1) {
                StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
                output.append(reversedWord);
            } else {
                output.append(words[i]);
            }
            if (i > 0) {
                output.append(" ");
            }
        }
        return output.toString();
    }
}