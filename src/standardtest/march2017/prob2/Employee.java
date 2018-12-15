package standardtest.march2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts = new ArrayList<>();
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
//		double total = 0;
//		
//		for (Account acct : accounts) {
//			total += acct.computeUpdatedBalance();
//		}
//		
//		return total;
		
		return accounts.stream()
				.map(a -> a.computeUpdatedBalance())
				.reduce(0.0, (sum, balance) -> sum + balance);
	}
}
