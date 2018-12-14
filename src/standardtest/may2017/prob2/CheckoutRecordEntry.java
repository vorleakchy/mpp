package standardtest.may2017.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LendingItem lendingItem;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType itemType;
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		super();
		this.lendingItem = lendingItem;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.itemType = itemType;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getLendingItemType() {
		return itemType;
	}
	
	
}
