package standardtest.march2017.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
//		double total = 0;
//		
//		for (Employee employee : list) {
//			total += employee.computeUpdatedBalanceSum();
//		}
//		
//		return total;
		
		return list.stream()
				.mapToDouble(Employee::computeUpdatedBalanceSum)
				.sum();
	}
}
