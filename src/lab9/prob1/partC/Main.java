package lab9.prob1.partC;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(1, 2, 3, 4, 5, 6, 7);
		
		IntSummaryStatistics stats = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println("Min: " + stats.getMin());
		System.out.println("Max: " + stats.getMax());
	}
}
