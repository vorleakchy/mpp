package lab9.prob1.partB;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				Arrays.asList("Bill", "Thomas", "Mary")
					.stream()
					.collect(Collectors.joining(", ")));
	}

}
