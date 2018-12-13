package lab9.prob1.partA;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		IntStream ones = IntStream.generate(() -> 1).limit(5).distinct();
		ones.forEach(System.out::println);
	}
}
