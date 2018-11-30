package lab4.probc;

public abstract class Employee {
	int empId;
	int month;
	int year;
	
	public void print() {
		
	}
	
	public Paycheck calcCompensation(int month, int year) {
		this.month = month;
		this.year = year;
		
		return new Paycheck(calcGrossPay(), 23, 5, 1, 3, 7.5);
	}
	
	public abstract double calcGrossPay();
}
