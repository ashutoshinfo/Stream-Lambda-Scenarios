package info.ashutosh.lambda.scenario12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Logic {

	public static void groupEmployeeByDepartmentAndFindHighestSalaryOfCorespondingDepartment(List<Employee> employees) {

		// Map<Department, List<Employee>>
		Map<Department, Optional<Long>> highestSalariesByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept,
						Collectors.mapping(
								Employee::getSalary, 
								Collectors.minBy(Comparator.naturalOrder()))));

		System.out.println(highestSalariesByDepartment);

		// Print the highest salaries by department
		for (Entry<Department, Optional<Long>> entry : highestSalariesByDepartment.entrySet()) {
			Department department = entry.getKey();
			Long highestSalary = entry.getValue().orElse(0L); // Default to 0 if no employees in the department
			System.out.println("Department: " + department.getName() + ", Highest Salary: " + highestSalary);
		}

	}

}
