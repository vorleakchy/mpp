package standardcodingtest.prob2;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	@Override
	public String getAccountID() {
		return acctId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}
}
