package info.ashutosh.lambda.scenario14;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TEts {

	public static void main(String[] args) {
		int[] input = { 1, 1, 1, 1, 1, 2, 2, 3, 1, 4, 2, 5 };

		ConcurrentMap<Integer, Long> collect = Arrays.stream(input).boxed()
				.collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()));

		System.out.println(collect);
		for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
			if (entry.getValue() > 1) {
				collect.remove(entry.getKey());
			}
		}
		System.out.println(collect);

	}

}
