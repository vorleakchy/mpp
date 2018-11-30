package lab4.probc;

public class Hourly extends Employee {
	double hourlyWage;
	double hoursPerWeek;
	
	@Override
	public double calcGrossPay() {
		double grossPay = hourlyWage * hoursPerWeek * 4;
		
		return grossPay;
	}
	

}
