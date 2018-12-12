package lab8.prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {

	public static void main(String[] args) {
		Good good = new Good();
		
		System.out.println(good.countWords(Folks.friends, 'N', 'D', 4));
	}

	public int countWords(List<String> words, char c, char d, int len) {
		return words.stream()
				.filter(word -> word.length() == len)
				.filter(word -> word.contains("" + c))
				.filter(word -> !word.contains("" + d))
				.collect(Collectors.toList())
				.size();
	}
}
