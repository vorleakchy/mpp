package standardcodingtest.prob2.partB;

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
				.map(e -> e.computeUpdatedBalanceSum())
				.reduce(0.0, (sum, balance) -> sum + balance);
	}
}
