package info.ashutosh.lambda.scenario10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NonRepeatedNumbers {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 1);

		// 1st way
		Set<Integer> integers = new HashSet<>();
//		System.out.println(integers);
//
//		for (Integer integer : asList) {
//			integers.add(integer);
//		}

		 asList.stream().filter(in -> integers.add(in)).forEach(System.out::println);

//		System.out.println(collect);

	}
}
