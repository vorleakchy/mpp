package standardtest.may2017.prob2;

public class LendingItem {
	private int numberCopiesInLib;

	public Integer getNumCopiesInLib() {
		return numberCopiesInLib;
	}

	public void setNumCopiesInLib(int numberCopiesInLib) {
		this.numberCopiesInLib = numberCopiesInLib;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof LendingItem)) return false;
		LendingItem item = (LendingItem)obj;
		
		return this == item;
	}
	
}
