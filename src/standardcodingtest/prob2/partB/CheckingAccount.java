package standardcodingtest.prob2.partB;

public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String acctId;
	
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
