package standardtest.march2018.prob2;

public class Course {
	private String courseTitle;
	private String primaryProfessor;
	
	public Course(String title, String primaryProfessor) {
		super();
		this.courseTitle = title;
		this.primaryProfessor = primaryProfessor;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public String getPrimaryProfessor() {
		return primaryProfessor;
	}

	@Override
	public String toString() {
		return courseTitle + ": " + primaryProfessor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseTitle == null) ? 0 : courseTitle.hashCode());
		result = prime * result + ((primaryProfessor == null) ? 0 : primaryProfessor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseTitle == null) {
			if (other.courseTitle != null)
				return false;
		} else if (!courseTitle.equals(other.courseTitle))
			return false;
		if (primaryProfessor == null) {
			if (other.primaryProfessor != null)
				return false;
		} else if (!primaryProfessor.equals(other.primaryProfessor))
			return false;
		return true;
	}
}
