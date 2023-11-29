package info.ashutosh.lambda.scenario01;

import java.util.Objects;

class Employee {
	private long id;
	private String name;

	public Employee(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
	}

	@Override
	public String toString() {
		return "\nEmployee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
