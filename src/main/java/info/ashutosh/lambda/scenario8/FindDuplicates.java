package info.ashutosh.lambda.scenario8;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 1, 5, 4, 1, 2, 6, 7, 8);

		List<Integer> duplicates = numbers.stream()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("Duplicates: " + duplicates);

		Set<Integer> integers = new HashSet<>();
		numbers.stream().filter((in) -> !integers.add(in)).distinct().sorted((o1, o2) -> -o1.compareTo(o2));

		System.out.println(integers);
	}
}