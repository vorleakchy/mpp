package lab9.prob3;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> streamString = Stream.of("a", "b", "c", "d", "e");
		streamSection(streamString, 1, 3)
		.forEach(System.out::println);
	}
	
	private static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream
				.skip(m)
				.limit(n - m + 1);
	}
}
