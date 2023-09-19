package info.ashutosh.lambda.scenario13.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import lombok.ToString;

@ToString
class Employee {
    private Long id;
    private String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(1L, "Alice"),
                new Employee(2L, "Bob"),
                new Employee(2L, "Bxob"),
                new Employee(1L, "Alice"), // Duplicate
                new Employee(3L, "Charlie"),
                new Employee(2L, "Bob")    // Duplicate
        ));

        Set<Employee> uniqueEmployees = new HashSet<>(employees);

        List<Employee> result = new ArrayList<>(uniqueEmployees);

        result.forEach(System.out::println);
    }
}
