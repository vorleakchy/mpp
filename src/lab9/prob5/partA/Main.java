package lab9.prob5.partA;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// your stream pipeline here

		String result = list.stream()
			.filter(e -> e.getSalary() > 100_000)
			.filter(e -> e.getLastName().charAt(0) > 'M')			
			.sorted(Comparator.comparing(Employee::getFirstName))
			.map(e -> e.getFirstName() + " " + e.getLastName())
			.collect(Collectors.joining(", "));
		
		System.out.println(result);
	}

}
