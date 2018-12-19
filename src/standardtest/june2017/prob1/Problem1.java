package standardtest.june2017.prob1;
import java.util.Arrays;
import java.util.stream.*;
import java.util.List;
public class Problem1 {
	
	//Returns a list of those strings which belong to both of the two input lists
	public static List<String> elementsInBoth(List<String> list1, List<String> list2) {
		//implement
		return list1.stream()
				.filter(s -> list2.contains(s))
				.collect(Collectors.toList());
	}
	
	//Returns a list, in sorted order, of the zipcodes, of those Customers 
	//who live in a city whose name contains 6 or more characters,
	//but which does not contain the letter 'e'. Your output list should not contain
	//duplicate elements.
	public static List<String> getZipsOfSpecialCustomers(List<Customer> list) {
		//implement
		return list.stream()
				.filter(c -> c.getCity().length() >= 6)
				.filter(c -> !c.getCity().contains("e"))
				.map(c -> c.getZip())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	
	//test methods
	public static void main(String[] args) {
		testFirstMethod();
		testSecondMethod();
	}
	private static void testFirstMethod() {
		List<String> list1 = Arrays.asList(new String[]{"friend", "tree", "bike", "bat"});
		List<String> list2 = Arrays.asList(new String[]{"tree", "strong", "bike", "weak"});
		//Expected output: [tree, bike]
		System.out.println("Strings occurring in just one of the two lists: " + elementsInBoth(list1, list2));
	}
	private static void testSecondMethod() {
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Oskaloosa", "54672");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "10 Adams", "Fairfield", "52556");
		Customer cust7 = new Customer("Tom", "211 Blake Ave", "Oskaloosa", "54672");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6, cust7);
		//Expected output: [54672, 57532]
		System.out.println("Zipcodes of Customers whose city name has length > 6 but does not contain the letter 'e': " + getZipsOfSpecialCustomers(list));
	}
}
