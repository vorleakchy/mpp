package lab10.prob1.soln1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 90000),
				  new Employee("Joe", "Cummings", 760000),
		          new Employee("Joe", "Stevens", 200000));
		
		String output = Main.asString(emps);
				
		assertEquals("Joe Stevens", output);
	}

}
