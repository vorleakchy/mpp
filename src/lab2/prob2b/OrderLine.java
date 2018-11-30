package lab2.prob2b;

public class OrderLine {
	private String name;
	private Order order;
	
	public OrderLine(String name, Order order) {
		this.name = name;
		this.order = order;
	}
	
	public String getName() {
		return name;
	}
	
	public Order getOrder() {
		return order;
	}
}
