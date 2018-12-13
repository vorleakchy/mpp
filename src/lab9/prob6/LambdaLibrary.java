package lab9.prob6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public final static TriFunction<List<Employee>, Integer, Character, Long> EMPLOYEE_COUNT =
			(employees, salary, letter) ->
				employees.stream()
					.filter(e -> e.getSalary() > salary)
					.filter(e -> e.getLastName().charAt(0) > letter)
					.count();
				
	public final static TriFunction<List<Employee>, Integer, Character, String> SORTED_FULL_NAME =
			(employees, salary, letter) ->	
				employees.stream()
					.filter(e -> e.getSalary() > salary)
					.filter(e -> e.getFirstName().charAt(0) < letter)
					.sorted(Comparator.comparing(Employee::getFullName))
					.map(e -> e.getFullName())
					.collect(Collectors.joining(", "));
}
