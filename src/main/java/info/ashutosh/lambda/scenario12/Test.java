package info.ashutosh.lambda.scenario12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Logic.groupEmployeeByDepartmentAndFindHighestSalaryOfCorespondingDepartment(createDummyEmployees());

	}

	public static List<Employee> createDummyEmployees() {
		List<Employee> employees = new ArrayList<>();

		Department dept1 = new Department(1, "HR");
		Department dept2 = new Department(2, "Finance");
		Department dept3 = new Department(3, "IT");
		Department dept4 = new Department(4, "Null");

		Employee emp1 = new Employee(101L, "John", 600L);
		emp1.setDept(dept1);

		Employee emp2 = new Employee(102L, "Alice", 7500001L);
		emp2.setDept(dept2);

		Employee emp3 = new Employee(103L, "Bob", 55000L);
		emp3.setDept(dept1);

		Employee emp4 = new Employee(104L, "Carol", 80000L);
		emp4.setDept(dept3);

		Employee emp5 = new Employee(105L, "David", 70000L);
		emp5.setDept(dept2);

		Employee emp6 = new Employee(106L, "Emma", 60000L);
		emp6.setDept(dept1);

		Employee emp7 = new Employee(107L, "Frank", 65000L);
		emp7.setDept(dept3);

		Employee emp8 = new Employee(108L, "Grace", 72000L);
		emp8.setDept(dept2);

		Employee emp9 = new Employee(109L, "Henry", 589000L);
		emp9.setDept(dept1);

		Employee emp10 = new Employee(110L, "Ivy", 70000L);
		emp10.setDept(dept3);
		
		Employee emp11 = new Employee(111L, "Null", 2L);
		emp11.setDept(dept4);
		
		Employee emp12 = new Employee(112L, "Null", 01L);
		emp12.setDept(dept4);

		employees.addAll(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12));

		return employees;
	}

}
