package info.ashutosh.lambda.scenario05;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPalindromFromSentenceLambda {
    public static void main(String[] args) {
        String sentence = "oo okko oo i oo okko oo";
        List<String> findPalindrom = findPalindroms(sentence);
        System.out.println("Palindrome(s) : " + findPalindrom);
    }

    private static List<String> findPalindroms(String input) {
        if (input == null) {
            return new ArrayList<>();
        }

        String[] words = input.split("\\s+");
 Map<String, Long> collect = Stream.of(words)
                .map(FindPalindromFromSentenceLambda::trimString)
                .filter(FindPalindromFromSentenceLambda::isPalindrome)
                .collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(collect);
        return null;
    }

    private static boolean isPalindrome(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString().equals(input);
    }

    private static String trimString(String input) {
        if (input == null) {
            return "";
        }

        String trim = input.trim();
        return trim.isEmpty() ? "" : trim;
    }
}
