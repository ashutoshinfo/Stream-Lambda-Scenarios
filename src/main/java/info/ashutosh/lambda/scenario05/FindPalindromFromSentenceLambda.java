package info.ashutosh.lambda.scenario05;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPalindromFromSentenceLambda {
    public static void main(String[] args) {
        String sentence = "ok ok    okoko";
        List<String> findPalindrom = findPalindroms(sentence);
        System.out.println("Palindrome(s) : " + findPalindrom);
    }

    private static List<String> findPalindroms(String input) {
        if (input == null) {
            return new ArrayList<>();
        }

        String[] words = input.split("\\s+");

        List<String> palindromes = Stream.of(words)
                .map(FindPalindromFromSentenceLambda::trimString)
                .filter(FindPalindromFromSentenceLambda::isPalindrome)
                .collect(Collectors.toList());

        return palindromes;
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
