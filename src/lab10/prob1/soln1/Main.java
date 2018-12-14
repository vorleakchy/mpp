package lab10.prob1.soln1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		printEmps(emps);				               
	}
	
	private static void printEmps(List<Employee> emps) {
		System.out.println(asString(emps));
	}
	
	public static String asString(List<Employee> emps) {
		return emps.stream()
				.filter(e -> e.getSalary() > 100000)
				.filter(e -> e.getLastName().charAt(0) > 'M')
				.map(e -> fullName(e))
				.sorted()
				.collect(Collectors.joining(", "));
	}
	
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
