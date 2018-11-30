package lab4.probc;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	double commission;
	double baseSalary;
	List<Order> orders;
	
	public Commissioned(double commission, double baseSalary) {
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();
	}
	
	@Override
	public double calcGrossPay() {
		return baseSalary + getCommissionedAmount();
	}
	
	private double getCommissionedAmount() {
		double totalOrderAmount = 0;
		
		for (Order order : orders) {
			if (order.orderDate.getYear() == this.year && order.orderDate.getMonth() == this.month)
				totalOrderAmount += order.orderAmount;
		}
		
		return (commission * totalOrderAmount) / 100;
	}

}
