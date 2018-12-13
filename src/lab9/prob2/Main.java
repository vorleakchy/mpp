package lab9.prob2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		printSquares(4);
	}
	
	public static void printSquares(int num) {
		String result = IntStream
			.iterate(1, n -> nextSquare(n))
			.limit(num)
//			.mapToObj(i -> ((Integer)i).toString())
			.mapToObj(Integer::toString)
			.collect(Collectors.joining(", "));
		
		System.out.println(result);
	}
	
	private static int nextSquare(int n) {
		return (int) Math.pow(Math.sqrt(n) + 1, 2);
	}

}
