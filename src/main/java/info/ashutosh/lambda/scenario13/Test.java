package info.ashutosh.lambda.scenario13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Logic.removeDuplicateObject(createDummyEmployees());

	}

	public static List<Employee> createDummyEmployees() {
		 List<Employee> employees = new ArrayList<>(Arrays.asList(
		            new Employee(1L, "Alice"),
		            new Employee(1L, "Alice"), // Duplicate
		            new Employee(2L, "Bob"),
		            new Employee(2L, "Bob"),    // Duplicate
		            new Employee(2L, "Bxob"),
		            new Employee(3L, "Charlie")
		        ));
		return employees;
	}

}
