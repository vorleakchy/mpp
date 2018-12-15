package standardtest.march2017.prob2;

public class CheckingAccount extends Account {
	private String acctId;
	private double monthlyFee;
	private double balance;
	
	public CheckingAccount(String acctId, double fee, double startBalance) {
		this.acctId = acctId;
		this.monthlyFee = fee;
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
		return balance - monthlyFee;
	}
}
