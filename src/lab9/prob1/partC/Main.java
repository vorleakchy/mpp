package lab9.prob1.partC;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Integer> myIntStream1 = Stream.of(1, 2, 3, 4, 5, 6, 7);
		Stream<Integer> myIntStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7);
		
		Integer min = myIntStream1.min((Integer i1, Integer i2) -> i1.compareTo(i2)).get();
		Integer max = myIntStream2.max((Integer i1, Integer i2) -> i1.compareTo(i2)).get();
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
