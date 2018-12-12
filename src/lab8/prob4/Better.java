package lab8.prob4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Better {

	final Function<String, Predicate<String>> containsLetter = letter -> name -> name.contains(letter);
	final Function<String, Predicate<String>> notContainsLetter = letter -> name -> !name.contains(letter);
	final Function<Integer, Predicate<String>> equalsLength = len -> word -> word.length() == len; 
	
	final List<String> result = Folks.friends.stream()
			.filter(containsLetter.apply("N"))
			.filter(notContainsLetter.apply("D"))
			.filter(equalsLength.apply(4))
			.collect(Collectors.toList());
	
	public static void main(String[] args) {
		Better better = new Better();

		System.out.println(better.result.size());
	}

}
