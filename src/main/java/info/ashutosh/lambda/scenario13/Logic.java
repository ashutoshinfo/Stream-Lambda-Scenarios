package info.ashutosh.lambda.scenario13;

import java.util.List;
import java.util.stream.Collectors;

public class Logic {

	public static void removeDuplicateObject(List<Employee> employees) {
		List<Employee> uniqueEmployees = employees.stream()
                .distinct() // Remove duplicates based on equals and hashCode
                .collect(Collectors.toList());

		uniqueEmployees.forEach(System.out::println);

	}

}
