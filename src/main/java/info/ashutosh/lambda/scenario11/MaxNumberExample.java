package info.ashutosh.lambda.scenario11;

import java.util.Arrays;
import java.util.List;

public class MaxNumberExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 8, 6, 2, 9, 7);

		System.out.println("Max Number: " + findLargestNumber(numbers));
		
		System.out.println("Max Number: " + findMinNumber(numbers));

		int po = 2;
		System.out.println(po + " Largest Number: " + findXthLargestNumber(numbers, po));

	}

	private static int findLargestNumber(List<Integer> numbers) {
		return numbers.stream()
				.max((num1, num2) -> num1.compareTo(num2))
				.get();
	}
	
	private static int findMinNumber(List<Integer> numbers) {
		return numbers.stream()
				.min((num1, num2) -> num1.compareTo(num2))
				.get();
	}

	private static int findXthLargestNumber(List<Integer> numbers, int po) {
		return numbers.stream()
				.sorted((a, b) -> b.compareTo(a))
				.distinct()
				.skip(po - 1)
				.findFirst()
				.get();
	}
}
