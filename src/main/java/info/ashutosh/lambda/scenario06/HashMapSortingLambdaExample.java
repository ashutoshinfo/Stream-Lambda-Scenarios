package info.ashutosh.lambda.scenario06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortingLambdaExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "John", "New York"),
				new Employee(2, "Johni", "New York"), 
				new Employee(3, "Johnu", "New York"),
				new Employee(4, "Alice", "Los Angeles"), 
				new Employee(5, "Alicei", "Los Angeles"),
				new Employee(6, "Bob", "Chicago"), 
				new Employee(7, "Bobi", "Chicago"));

		Map<String, List<Employee>> collect = employees.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getCity
								)
						);

		Map<String, List<String>> employeeMap = employees.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getCity, // <- first parameter
								Collectors.mapping( // <- second parameter
										Employee::getName, 
										Collectors.toList()
										)
								)
						);

		// Print the sorted map
		System.out.println("Sorted By City : " + collect);
		System.out.println("Sorted By City : " + employeeMap);
	}
}
