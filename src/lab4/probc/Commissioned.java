package lab4.probc;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	double commission;
	double baseSalary;
	List<Order> orders = new ArrayList<Order>();
	
	@Override
	public double calcGrossPay() {
		double grossPay = baseSalary + getCommissionedAmount();
				
		return grossPay;
	}
	
	private double getCommissionedAmount() {
		double amount = orders.stream().mapToDouble(Order::getOrderAmount).sum();
		
		return amount;
	}

}
