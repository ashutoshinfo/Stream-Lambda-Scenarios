package info.ashutosh.lambda.scenario10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NonRepeatedNumbers {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 1);

		List<Integer> findDuplicatesLmbda = findDuplicates(asList);
		System.out.println(findDuplicatesLmbda);

		Set<Integer> findDuplicates2nd = findDuplicates2nd(asList);
		System.out.println(findDuplicates2nd);

		List<Integer> collect = findDuplicatesLmbda(asList);
		System.out.println(collect);

	}

	private static Set<Integer> findDuplicates2nd(List<Integer> asList) {

		Set<Integer> nonDuplicates = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (Integer integer : asList) {
			if (!nonDuplicates.add(integer)) {
				duplicates.add(integer);
			}

		}

		ArrayList<Integer> arrayList = new ArrayList<>(duplicates);
		Collections.sort(arrayList, (a, b) -> -a.compareTo(b));
		Set<Integer> fSet = new LinkedHashSet<>(arrayList);
		return fSet;

	}

	private static List<Integer> findDuplicates(List<Integer> asList) {
		List<Integer> duplicates = new ArrayList<>();
		List<Integer> distinctNumbers = new ArrayList<>();

		for (Integer number : asList) {
			if (distinctNumbers.contains(number)) {
				if (!duplicates.contains(number)) {
					duplicates.add(number);
				}
			} else {
				distinctNumbers.add(number);
			}
		}
		return duplicates;
	}

	private static List<Integer> findDuplicatesLmbda(List<Integer> asList) {
		Set<Integer> integersLambda = new HashSet<>();
		List<Integer> collect = asList.stream().filter(in -> !integersLambda.add(in)).collect(Collectors.toList());
		return collect;
	}
}
