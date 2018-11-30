package lab4.probc;

public class Salaried extends Employee {
	double salary;

	public Salaried(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double calcGrossPay() {
		return salary;
	}
}
