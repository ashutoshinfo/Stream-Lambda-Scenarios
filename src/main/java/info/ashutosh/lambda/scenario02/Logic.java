package info.ashutosh.lambda.scenario02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logic {
	/**
	 * This method will take Integer[] an return the number of occurrence of it and
	 * give count of it.
	 * 
	 * @param Integer[]
	 * @return Map<Integer, Long>
	 */
	public static Map<Integer, Long> countAccurencs(Integer[] input) {

		Map<Integer, Long> finalCounts = new ConcurrentHashMap<>();

		for (int i = 0; i < input.length; i++) {

			if (finalCounts.containsKey(input[i])) {
				finalCounts.put(input[i], finalCounts.get(input[i]) + 1);
			} else {
				finalCounts.put(input[i], 1L);
			}
		}

		for (Entry<Integer, Long> entry : finalCounts.entrySet()) {
			if (entry.getValue() == 1) {
				finalCounts.remove(entry.getKey());
			}
		}

		return finalCounts;

	}

	public static List<Integer> removeDuplicateandSort(Integer[] input) {

		List<Integer> noDuplicate = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {

			if (!noDuplicate.contains(input[i])) {
				noDuplicate.add(input[i]);
			}
		}

		Collections.sort(noDuplicate, (o1, o2) -> -o1.compareTo(o2));
		return noDuplicate;

	}
	
	/**
	 * This Method usage lambda Function.
	 * @param input
	 * @return
	 */
	public static Map<Integer, Long> countAccurencsLambda(Integer[] input) {
		return Stream.of(input)
				.collect(Collectors.groupingByConcurrent(
						Function.identity(), // i -> i
						ConcurrentHashMap::new, 
						Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
				.collect(Collectors.toConcurrentMap(
						Map.Entry::getKey, 
						Map.Entry::getValue));

	}
}
