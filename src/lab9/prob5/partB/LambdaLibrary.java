package lab9.prob5.partB;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lab9.prob5.partA.Employee;

public class LambdaLibrary {
	public final static TriFunction<List<Employee>, Integer, Character, String> EMPLOYEE_NAME_FILTERED =
			(employees, salary, letter) ->
				employees.stream()
				.filter(e -> e.getSalary() > salary)
				.filter(e -> e.getLastName().charAt(0) > letter)			
				.sorted(Comparator.comparing(Employee::getFirstName))
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.collect(Collectors.joining(", "));
}
