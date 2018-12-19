package standardtest.june2017.prob2;

import java.util.*;

public class Admin {
	/**
	 * Returns the average gpa for all students in the studentList
     */
	public static double computeAverageGpa(List<Student> studentList) {
		//implement
		
		return studentList.stream()
				.mapToDouble(s -> s.computeGpa())
				.average()
				.orElse(0.0);
	}
}
