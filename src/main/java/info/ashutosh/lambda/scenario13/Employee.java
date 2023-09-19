package info.ashutosh.lambda.scenario13;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Employee {
	private Long id;
	private String name;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
