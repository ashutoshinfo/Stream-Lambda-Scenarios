package info.ashutosh.lambda.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicateNumbers {

	public static void main(String[] args) {
		Integer[] a = { 5, 8, 6, 2, 9, 7 };
		Integer[] b = { 6, 2, 5, 8, 1, 3 };

		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();

		for (Integer num : a) {
			setA.add(num);
		}

		for (Integer num : b) {
			setB.add(num);
		}

		List<Integer> result = new ArrayList<>();

		for (Integer num : a) {
			if (!setB.contains(num)) {
				result.add(num);
			}
		}

		for (Integer num : b) {
			if (!setA.contains(num)) {
				result.add(num);
			}
		}

		System.out.println("Non-duplicate numbers: " + result);
	}
}
