package info.ashutosh.lambda.scenario15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromicSubstrings {
	public static List<String> findAllPalindromicSubstrings(String input) {
		List<String> palindromes = new ArrayList<>();
		int n = input.length();

		for (int center = 0; center < 2 * n - 1; center++) {
			int left = center / 2;
			int right = left + center % 2;

			while (left >= 0 && right < n && input.charAt(left) == input.charAt(right)) {
				palindromes.add(input.substring(left, right + 1));
				left--;
				right++;
			}
		}

		return palindromes;
	}

	public static void main(String[] args) {
		String input = "oookkoooioookkooo";
		List<String> palindromes = findAllPalindromicSubstrings(input);
		Map<String, Long> collect = palindromes.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);
//		for (String palindrome : palindromes) {
//		}

		for (Map.Entry<String, Long> entrySet : collect.entrySet()) {
			System.out.println(entrySet);

		}
	}
}
