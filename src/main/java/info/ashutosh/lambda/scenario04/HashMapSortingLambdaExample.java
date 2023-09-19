package info.ashutosh.lambda.scenario04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapSortingLambdaExample {
	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 30);
		map.put("Bob", 25);
		map.put("Charlie", 35);
		map.put("David", 28);

		// Sort the entries using lambda and Stream API
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue((c1, c2) -> -c1.compareTo(c2)))
				.collect(LinkedHashMap::new, 
						(map1, entry) -> map1.put(entry.getKey(), entry.getValue()), 
						LinkedHashMap::putAll);

		// Print the sorted map
		System.out.println("Sorted Map: " + sortedMap);
	}
}
