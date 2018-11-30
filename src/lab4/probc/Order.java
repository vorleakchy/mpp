package lab4.probc;

import java.util.Date;

public class Order {
	int orderNo;
	Date orderDate;
	double orderAmount;
	Commissioned commissioned;
	
	public Order(int orderNo, Date orderDate, double orderAmount, Commissioned commissioned) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
}
