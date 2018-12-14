package standardcodingtest.prob2.partA;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		
		return list.stream()
			.filter(stuent -> stuent.getGpa() > 3.0)
			.filter(student -> student.getMajor().equals(Majors.CS))
			.collect(Collectors.toList());
	}
}
