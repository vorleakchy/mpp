package standardtest.june2017.prob2;
import java.util.*;
public class ParttimeTranscriptRecord {
private List<Double> grades = new ArrayList<>();
	
	public List<Double> getGrades() {
		return grades;
	}
	
	public void insertGrade(double grade) {
		grades.add(grade);
	}
}
