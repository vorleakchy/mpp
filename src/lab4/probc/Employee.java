package lab4.probc;

import java.time.LocalDate;

public abstract class Employee {
	private String empId;
	int month;
	int year;
	
	public Employee(String empId) {
		this.empId = empId;
	}
	
	public void print() {
		LocalDate now = LocalDate.now();
		System.out.println(calcCompensation(now.getMonthValue(), now.getYear()));
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		
		return new Paycheck(grossPay, Tax.FICA, Tax.State, 
				Tax.Local, Tax.Medicare, Tax.SocialSecurity);
	}
	
	public abstract double calcGrossPay(int month, int year);
}
