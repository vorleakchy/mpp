package standardtest.march2018.prob2;

public class Student {
	private String firstName;
	private String lastName;
	private Transcript transcript;
	private PlanOfStudy planOfStudy;
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.planOfStudy = new PlanOfStudy();
		this.transcript = new Transcript();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public PlanOfStudy getPlanOfStudy() {
		return planOfStudy;
	}
}
