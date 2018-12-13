package lab9.prob1.partB;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> names = Stream.of("Bill", "Thomas", "Mary");
		
		String output = names.collect(Collectors.joining(", "));
		
		System.out.println(output);
	}

}
