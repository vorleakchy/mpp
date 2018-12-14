package standardtest.may2017.prob2;

public class LendingItem {
	private int numberCopiesInLib;

	public Integer getNumCopiesInLib() {
		return numberCopiesInLib;
	}

	public void setNumCopiesInLib(int numberCopiesInLib) {
		this.numberCopiesInLib = numberCopiesInLib;
	}
	
	public boolean equals(LendingItem item) {
		return this == item;
	}
}
