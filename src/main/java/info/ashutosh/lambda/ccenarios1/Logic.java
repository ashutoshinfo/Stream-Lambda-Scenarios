package info.ashutosh.lambda.ccenarios1;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Logic {

	/**
	 * This method takes a list of Employee objects and performs parallel processing
	 * to count occurrences of each Employee. It returns a ConcurrentMap where each
	 * key is an Employee and the corresponding value is the count of its
	 * occurrences in the input list. The method uses Java streams and collectors to
	 * achieve this.
	 * 
	 * After collecting the initial counts using Collectors.groupingByConcurrent,
	 * the method filters out entries where the count is not greater than 1 using
	 * the .filter(entry -> entry.getValue() > 1) operation. Only the entries with a
	 * count greater than 1 are further processed.
	 * 
	 * The final result is a filtered ConcurrentMap containing only those Employee
	 * instances that occur more than once in the input list, along with their
	 * corresponding counts of occurrences.
	 * 
	 * @param List<Employee>
	 * @return Map<Employee, Long>
	 */
	public static Map<Employee, Long> countAccurencsLambda2(List<Employee> input) {
		return input.stream()
				.collect(Collectors.groupingByConcurrent(
	                    Function.identity(),
	                    ConcurrentHashMap::new,
	                    Collectors.counting()))
	            .entrySet().stream()
	            .filter(entry -> entry.getValue() > 1)
	            .collect(Collectors.toConcurrentMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (count1, count2) -> count1, // Merge function for duplicate keys (not needed in this case)
	                    ConcurrentHashMap::new));
	}

	/**
	 * This method takes a list of Employee objects and performs parallel processing
	 * to count occurrences of each Employee. It returns a ConcurrentMap where each
	 * key is an Employee and the corresponding value is the count of its
	 * occurrences in the input list. The method uses Java streams and collectors to
	 * achieve this.
	 * 
	 * After collecting the initial counts using Collectors.groupingByConcurrent,
	 * the method filters out entries where the count is not greater than 1 using
	 * the .filter(entry -> entry.getValue() > 1) operation. Only the entries with a
	 * count greater than 1 are further processed.
	 * 
	 * The final result is a filtered ConcurrentMap containing only those Employee
	 * instances that occur more than once in the input list, along with their
	 * corresponding counts of occurrences.
	 * 
	 * @param List<Employee>
	 * @return Map<Employee, Long>
	 */
	public static Map<Employee, Long> countAccurencsWithoutLambda(List<Employee> input) {
		Map<Employee, Long> countingMap = new ConcurrentHashMap<>();

		for (Employee employee : input) {
			countingMap.put(employee, countingMap.getOrDefault(employee, 0L) + 1);
		}

		for (Map.Entry<Employee, Long> entry : countingMap.entrySet()) {
			if (entry.getValue() <= 1) {
				countingMap.remove(entry.getKey());
			}
		}

		return countingMap;
	}

}
