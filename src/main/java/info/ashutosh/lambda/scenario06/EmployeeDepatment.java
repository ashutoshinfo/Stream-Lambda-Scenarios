package info.ashutosh.lambda.scenario06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class EmployeeDepatment {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "John", "New York"),
				new Employee(2, "Johni", "New York"), 
				new Employee(2, "Johni", "New York"), 
				new Employee(3, "Johnu", "New York"),
				new Employee(4, "Alice", "Los Angeles"), 
				new Employee(5, "Alicei", "Los Angeles"),
				new Employee(6, "Bob", "Chicago"), 
				new Employee(7, "Bobi", "Chicago"));

		Map<String, Long> collect = employees.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getCity,
								Collectors.counting()
								)
						);

		Map<String, List<String>> employeeMap = employees.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getCity, // <- first parameter
								 ConcurrentHashMap::new,
								Collectors.mapping( // <- second parameter
										in->in.getId()+" : "+in.getName(), 
										Collectors.toList()
										)
								)
						);

		// Print the result
		collect.forEach((department, empList) -> {
					System.out.println("City: " + department);
					System.out.println("Employees: " + empList);
//					empList.forEach(employee -> System.out.println(employee.getName()));
					System.out.println();
				});
				
	}
}
