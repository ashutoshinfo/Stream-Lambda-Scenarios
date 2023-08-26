package info.ashutosh.lambda.scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logic {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("F");
		list.add("C");
		list.add("D");
		list.add("A");

		// filter
		List<String> collect = list.stream().filter(in -> in.equals("A")).collect(Collectors.toList());
		System.out.println(collect);

		// map
		List<String> collect2 = list.stream().map(in -> {
			if (in.equals("A")) {
				return in.concat("A");
			}
			return in;
		}).collect(Collectors.toList());
		System.out.println(collect2);
		// map
		List<String> collectx = list.stream().map(in -> in.equals("A") ? in.concat("A") : in)
				.collect(Collectors.toList());
		System.out.println(collectx);

		List<String> collect3 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect3);

		List<String> collect4 = list.stream().distinct().sorted((o1, o2) -> -o1.compareTo(o2))
				.collect(Collectors.toList());
		System.out.println(collect4);

//		list.stream().collect(Collectors.groupingBy(),Collectors.counting());

		Integer[] integers = { 1, 2, 3, 4, 5, 6 };
		Integer collect5 = Stream.of(integers).collect(Collectors.summingInt(in -> in + in));
		System.out.println(collect5);

	}

}
