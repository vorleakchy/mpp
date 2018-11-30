package lab4.probc;

public class Paycheck {
	double grossPay;
	double fica;
	double state;
	double local;
	double medicare;
	double socialSecurity;
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public void print() {
		
	}
	
	public double getNetPay() {
		return grossPay - getTotalTaxAmount();
	}
	
	private double getTotalTaxAmount() {
		return grossPay * getTotalTaxPercentage() / 100;
	}
	
	private double getTotalTaxPercentage() {
		return fica + state + local + medicare + socialSecurity;
	}
}
