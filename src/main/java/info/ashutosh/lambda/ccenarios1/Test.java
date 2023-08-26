package info.ashutosh.lambda.ccenarios1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		System.out.println(Logic.countAccurencsLambda2(createDummyEmployees()));
		System.out.println(Logic.countAccurencsWithoutLambda(createDummyEmployees()));

	}

	public static List<Employee> createDummyEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1L, "John"));
		employees.add(new Employee(1L, "John"));
		employees.add(new Employee(1L, "John"));
		employees.add(new Employee(2L, "Alice"));
		employees.add(new Employee(3L, "Bob"));
		employees.add(new Employee(4L, "Alice"));
		employees.add(new Employee(5L, "John"));
		employees.add(new Employee(6L, "Eve"));
		employees.add(new Employee(3L, "Bob"));
		employees.add(new Employee(8L, "Charlie"));
		return employees;
	}

}
