package lab4.probc;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("01", LocalDate.now(), 100));
		orders.add(new Order("02", LocalDate.now(), 100));
		
		Hourly hourly = new Hourly("001", 70, 40);
		Salaried salaried = new Salaried("002", 8000);
		Commissioned commissioned = new Commissioned("003", 10, 5000, orders);		
		
		employees.add(hourly);
		employees.add(salaried);
		employees.add(commissioned);
		
		hourly.calcCompensation(11, 2018).print();;
		salaried.calcCompensation(11, 2018).print();;
		commissioned.calcCompensation(11, 2018).print();;
	}

}
