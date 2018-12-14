package standardtest.may2017.prob2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		
		for (LibraryMember member : members) {
			List<CheckoutRecordEntry> entries = member.getCheckoutRecord().getCheckoutEntryList();
			
			for (CheckoutRecordEntry entry : entries) {
				if (entry.getLendingItem().equals(item)) {
					phoneNums.add(member.getPhone());
					break;
				}
			}
		}
		
		Collections.sort(phoneNums);
		
		return phoneNums;
	}
}
