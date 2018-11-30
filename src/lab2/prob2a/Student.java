package lab2.prob2a;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	public Student(String name) {
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}
	
	public String getName() {
		return name;
	}
	
	public GradeReport getGradeReport() {
		return gradeReport;
	}
}
