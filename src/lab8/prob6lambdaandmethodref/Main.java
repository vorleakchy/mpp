package lab8.prob6lambdaandmethodref;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		evaluator();
	}
	
	public static void evaluator() {
		Employee emp = new Employee("John Smith", 160_000);
		Apple apple = new Apple(0.4);
		
		// Example
		Function<String, String> toUpper1 = s -> s.toUpperCase();
		Function<String, String> toUpper2 = String::toUpperCase;
		System.out.println(toUpper1.apply("hello"));
		System.out.println(toUpper2.apply("hello"));
		
		// A.
		Function<Employee, String> getName1 = e -> e.getName();
		Function<Employee, String> getName2 = Employee::getName;
		System.out.println(getName1.apply(emp));
		System.out.println(getName2.apply(emp));
		
		// B.
		BiConsumer<Employee, String> setName1 = (e, s) -> e.setName(s);
		BiConsumer<Employee, String> setName2 = Employee::setName;
		setName1.accept(emp, "Donal Trump 1");
		System.out.println(emp.getName());
		setName2.accept(emp, "Donal Trump 2");
		System.out.println(emp.getName());
		
		// C.
		BiFunction<String, String, Integer> compareTo1 = (s1, s2) -> s1.compareTo(s2);
		BiFunction<String, String, Integer> compareTo2 = String::compareTo;
		System.out.println(compareTo1.apply("John", "Joo"));
		System.out.println(compareTo2.apply("John", "Joo"));
		
		// D.
		BiFunction<Integer, Integer, Double> mathPow1 = (x, y) -> Math.pow(x, y);
		BiFunction<Integer, Integer, Double> mathPow2 = Math::pow;
		System.out.println(mathPow1.apply(3, 2));
		System.out.println(mathPow2.apply(3, 2));
	
		// E.
		Function<Apple, Double> getWeight1 = a -> a.getWeight();
		Function<Apple, Double> getWeight2 = Apple::getWeight;
		System.out.println(getWeight1.apply(apple));
		System.out.println(getWeight2.apply(apple));
		
		// F.
		ToIntFunction<String> parseInt1 = s -> Integer.parseInt(s);
		ToIntFunction<String> parseInt2 = Integer::parseInt;
		System.out.println(parseInt1.applyAsInt("1"));
		System.out.println(parseInt2.applyAsInt("1"));
		
		// G.
		EmployeeNameComparator comp = new EmployeeNameComparator();
		Employee emp1 = new Employee("John Smith", 160_000);
		Employee emp2 = new Employee("David Hanson", 170_000);
		BiFunction<Employee, Employee, Integer> compare1 = (e1, e2) -> comp.compare(e1, e2);
		BiFunction<Employee, Employee, Integer> compare2 = comp::compare;
		System.out.println(compare1.apply(emp1, emp2));
		System.out.println(compare2.apply(emp1, emp2));
	}

}
