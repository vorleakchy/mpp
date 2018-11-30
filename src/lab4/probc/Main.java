package lab4.probc;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		Hourly hourly = new Hourly(70, 40);
		Salaried salaried = new Salaried(8000);
		Commissioned commissioned = new Commissioned(10, 5000);
				
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1, new Date(), 100, commissioned));
		orders.add(new Order(2, new Date(), 100, commissioned));
	
		commissioned.orders = orders;
		
		employees.add(hourly);
		employees.add(salaried);
		employees.add(commissioned);
		
		hourly.calcCompensation(11, 2018).print();;
		salaried.calcCompensation(11, 2018).print();;
		commissioned.calcCompensation(11, 2018).print();;
	}

}
