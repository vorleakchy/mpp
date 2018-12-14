package lab10.prob1.soln2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testAsString() {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 90000),
				  new Employee("Joe", "Cummings", 760000),
		          new Employee("Joe", "Stevens", 200000));
		
		String output = Main.asString(emps);
				
		assertEquals("Joe Stevens", output);
	}

	@Test
	void testSalaryGreaterThan100000ReturnTrue() {
		Employee e = new Employee("Joe", "Stevens", 200000);
		
		boolean output = Main.salaryGreaterThan100000(e);
		
		assertEquals(true, output);
	}
	
	@Test
	void testSalaryGreaterThan100000ReturnFalse() {
		Employee e = new Employee("Joe", "Stevens", 90000);
		
		boolean output = Main.salaryGreaterThan100000(e);
		
		assertEquals(false, output);
	}
	
	@Test
	void testLastNameAfterM() {
		Employee e = new Employee("Joe", "Stevens", 200000);
		
		boolean output = Main.lastNameAfterM(e);
		
		assertEquals(true, output);
	}
	
	@Test
	void testFullName() {
		Employee e = new Employee("Joe", "Davis", 90000);
		
		String output = Main.fullName(e);
		
		assertEquals("Joe Davis", output);
	}
}
