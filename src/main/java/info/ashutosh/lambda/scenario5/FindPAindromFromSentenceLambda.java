package info.ashutosh.lambda.scenario5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPAindromFromSentenceLambda {
	public static void main(String[] args) {

		String sentence = null;
		List<String> findPalindromLambda = findPalindromsLambda(sentence);
		System.out.println("Palindrome(s) : " + findPalindromLambda);
	}

	// Central Service method
	private static List<String> findPalindromsLambda(String input) {
		String trimString = trimString(input);

		if (trimString == null) {
			return null;
		}

		String[] words = input.split(" ");


		List<String> palindromes = Stream.of(words)
				.map(FindPAindromFromSentenceLambda::trimString)
				.filter(FindPAindromFromSentenceLambda::isPalindrome)
				.collect(Collectors.toList());
		
		return palindromes;

	}


	// logic to determine the word i Palindrome or not
	private static boolean isPalindrome(String input) {
		StringBuilder reversed = new StringBuilder();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed.append(input.charAt(i));
		}
		return reversed.toString().equals(input);
	}

	// Utility method
	private static String trimString(String input) {
		if (input == null) {
			return null;
		}

		String trim = input.trim();
		if (trim.isEmpty()) {
			return null;
		}
		return trim;
	}
}
