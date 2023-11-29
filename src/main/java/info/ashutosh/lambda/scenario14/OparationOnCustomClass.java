package info.ashutosh.lambda.scenario14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class OparationOnCustomClass {

	private static List<Employee> dummyEmpoyees() {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1L, "Name-1"));
		employees.add(new Employee(1L, "Name-1"));
		employees.add(new Employee(1L, "Name-11"));

		employees.add(new Employee(2L, "Name-2"));
		employees.add(new Employee(2L, "Name-2"));

		employees.add(new Employee(3L, "Name-3"));
		employees.add(new Employee(3L, "Name-3"));

		employees.add(new Employee(4L, "Name-4"));

		employees.add(new Employee(5L, "Name-5"));
		employees.add(new Employee(5L, "Name-55"));
		employees.add(new Employee(5L, "Name-54"));

		employees.add(new Employee(6L, "Name-5"));

		employees.add(null);
		return employees;
	}

	public static void main(String[] args) {
		List<Employee> employees = removeDuplicateEmployee(dummyEmpoyees());
		System.out.println("Removed Duplicates : "+ employees);
		
		Map<Employee, Long> findAccurences = findDuplicateEmployeeAccurences(dummyEmpoyees());
		System.out.println("Count Accurence: "+findAccurences);
		
		List<Employee> findDuplicateEmployeeAccurencesCustomSorted = findDuplicateEmployeeAccurencesCustomSorted(employees);
		System.out.println(findDuplicateEmployeeAccurencesCustomSorted);
	}

	private static List<Employee> removeDuplicateEmployee(List<Employee> list) {

		List<Employee> collect = list.stream()
				.filter(n -> n == null ? false : true)
				.distinct()
				.collect(Collectors.toList());

		return collect;
	}

	private static Map<Employee, Long> findDuplicateEmployeeAccurences(List<Employee> list) {
		Map<Employee, Long> collect = list.stream()
				.filter(n -> n == null ? false : true)
//				.sorted((a,b)->a.getName().compareTo(b.getName()))
				.collect(
						Collectors.groupingBy(
								Function.identity(),
								Collectors.counting()));

		return collect;
	}
	
	private static  List<Employee> findDuplicateEmployeeAccurencesCustomSorted(List<Employee> list) {
		List<Employee> collect = list.stream()						// start stream
				.filter(n -> n == null ? false : true)				// filter null
				.distinct()											// removes duplicates
				.sorted((a,b)->-a.getName().compareTo(b.getName()))	// custom sorting
				.collect(Collectors.toList());						// collect as list

		return collect;
	}

}

@Getter
@Setter
@RequiredArgsConstructor
//@EqualsAndHashCode
class Employee implements Comparable<Employee> {

	private final Long id;
	private final String name;

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}
		if (obj == null || getClass() == obj.getClass()) {
			return true;
		}
		Employee e = (Employee) obj;
		return Objects.equals(this.id, e.getId()) && Objects.equals(this.name, e.getName());

	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee e) {

		return this.id.compareTo(e.id);

	}

}
