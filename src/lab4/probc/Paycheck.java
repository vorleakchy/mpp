package lab4.probc;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public Paycheck(double grossPay, Tax fica, Tax state, Tax local, 
			Tax  medicare, Tax  socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica.getValue();
		this.state = state.getValue();
		this.local = local.getValue();
		this.medicare = medicare.getValue();
		this.socialSecurity = socialSecurity.getValue();
	}

	public void print() {
		System.out.println(toString());
	}
	
	public double getNetPay() {
		return grossPay - getTotalTaxAmount();
	}
	
	private double getTotalTaxAmount() {
		double totalTax = fica + state + local + medicare + socialSecurity;
	
		return grossPay * totalTax;
	}
	
	@Override
	public String toString() {
		return "Paystub: \n "
				+ "  Gross Pay: " + grossPay + "\n"
				+ "  Fica: " + fica  + "\n" 
				+ "  State: " + state  + "\n" 
				+ "  Local: " + local  + "\n" 
				+ "  Medicare: " + medicare  + "\n" 
				+ "  Social Security: " + socialSecurity  + "\n" 
				+ "  NET PAY: " + getNetPay();
	}
}
