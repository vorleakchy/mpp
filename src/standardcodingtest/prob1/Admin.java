package standardcodingtest.prob1;

public class Admin {
	//implement
	
	private Department[] depts;
	
	public Admin(Department[] depts) {
		this.depts = depts;
	}
	
	public String hourlyCompanyMessage() {
		StringBuilder sb = new StringBuilder();
		for (Department dept : depts) {
			String name = dept.getName();
			String msg = dept.nextMessage();
			
			sb.append(format(name, msg) + "\n");
		}
		
		return sb.toString();
	}
	
	private String format(String name, String msg) {
		return name + ": " + msg;
	}
}
