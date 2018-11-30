package lab4.probc;

public class Hourly extends Employee {
	double hourlyWage;
	double hoursPerWeek;
	
	public Hourly(double hourlyWage, double hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public double calcGrossPay() {
		double grossPay = hourlyWage * hoursPerWeek * 4;
		
		return grossPay;
	}
	

}
