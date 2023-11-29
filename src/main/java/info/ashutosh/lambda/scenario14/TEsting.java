package info.ashutosh.lambda.scenario14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.EqualsAndHashCode;

public class TEsting {
	public static void main(String[] args) {
		
		Department HR= new Department("HR");
		Department IT= new Department("IT");
		
		List<Employeer> employees = Arrays.asList(
				
				new Employeer(1L, "John", HR),
				
				new Employeer(2L, "Alice", IT), 
				new Employeer(2L, "Alice", IT), 
				
				new Employeer(3L, "Bob", HR),
				new Employeer(3L, "Bob", HR),
				
				new Employeer(4L, "Eve", IT),
				new Employeer(5L, "Eve", HR));

		// Group employees by department
		Map<Department, List<Employeer>> employeesByDepartment = employees.stream()
				.distinct()
				.collect(Collectors.groupingBy(Employeer::getDepartment));

//		System.out.println(employeesByDepartment);

		// Print the result
		employeesByDepartment.forEach((department, empList) -> {
			System.out.println("Department: " + department.getName());
			System.out.println("Employees: " + empList);
//			empList.forEach(employee -> System.out.println(employee.getName()));
			System.out.println();
		});
	}
}

/**
 * This Employee Class Have Employee Details and the Department(s) in which employee working.
 * 
 * @author Ashutosh.info
 * neha
 */
@EqualsAndHashCode
 class Employeer {
	private Long id;
	private String name;
	private Department department;

	public Employeer(Long id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "\n\tEmployeer [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	

}

 @EqualsAndHashCode
class Department {
	private String name;

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	
}
