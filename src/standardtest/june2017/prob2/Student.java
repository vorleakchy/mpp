package standardtest.june2017.prob2;

abstract public class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public abstract double computeGpa();
	
	public String getName() {
		return name;
	}
	
	
}
