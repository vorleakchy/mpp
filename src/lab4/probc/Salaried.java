package lab4.probc;

public class Salaried extends Employee {
	double salary;

	@Override
	public double calcGrossPay() {
		return salary;
	}
}
