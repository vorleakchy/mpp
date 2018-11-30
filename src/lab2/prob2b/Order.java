package lab2.prob2b;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNum;
	private List<OrderLine> lineItems;
	
	public Order() {
		this.lineItems = new ArrayList<OrderLine>();
	}
	
	public void addLineItem(String itemName) {
		OrderLine lineItem = new OrderLine(itemName, this);
		lineItems.add(lineItem);
	}
	
	public String getOrderNum() {
		return orderNum;
	}
	
	public List<OrderLine> getLineItems() {
		return lineItems;
	}
}
