package lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	static final Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
		list.forEach(s -> System.out.println(s.toUpperCase()));
		
		list.stream().map(String::toUpperCase).forEach(System.out::println);;
	}
}