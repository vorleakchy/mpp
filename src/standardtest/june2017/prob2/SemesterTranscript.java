package standardtest.june2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class SemesterTranscript {
	private List<Double> grades = new ArrayList<>();
	
	public List<Double> getGrades() {
		return grades;
	}
	
	public void insertGrade(double grade) {
		grades.add(grade);
	}
	
}
