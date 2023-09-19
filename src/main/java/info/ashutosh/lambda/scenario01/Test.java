package info.ashutosh.lambda.scenario01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

//		System.out.println(Logic.countAccurencsLambda2(createDummyEmployees()));
//		System.out.println(Logic.countAccurencsWithoutLambda(createDummyEmployees()));
		Logic.countAccurencsLambda3(createDummyEmployees());

	}

	public static List<Employee> createDummyEmployees() {
		List<Employee> employees = new ArrayList<>();
//		IntStream.range(1, 20).forEach(in->{
//			for (Long i = 1L; i <= 3L; i++) {
//				employees.add(new Employee(i, "John"));
//			}
//		});
		//System.out.println(employees);
		employees.add(new Employee(1L, "John"));
		employees.add(new Employee(1L, "John"));
		employees.add(new Employee(1L, "John"));
		
		employees.add(new Employee(2L, "Alice"));
		
		employees.add(new Employee(3L, "Bob"));
		employees.add(new Employee(3L, "Bob"));
		
		employees.add(new Employee(4L, "Alice"));
		employees.add(new Employee(4L, "Alice"));
		
		employees.add(new Employee(5L, "John"));
		employees.add(new Employee(6L, "Eve"));
		
		employees.add(new Employee(8L, "Charlie"));
		employees.add(new Employee(8L, "Charlie"));
		return employees;
	}

}
