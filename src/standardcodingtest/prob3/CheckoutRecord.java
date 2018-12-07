package standardcodingtest.prob3;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> entries = new ArrayList<CheckoutRecordEntry>();
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		entries.add(entry);
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return entries;
	}
	
}
