package lab8.prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Best {

	final QuadFunction<List<String>, String, String, Integer, Integer> wordCount = 
			(list, letter1, letter2, length) -> 
				list.stream().filter(word -> word.contains(letter1) 
											&& !word.contains(letter2)
											& word.length() == length)
				.collect(Collectors.toList())
				.size();
	
	public static void main(String[] args) {
		Best best = new Best();
		
		System.out.println(best.wordCount.apply(Folks.friends, "N", "D", 4));
	}

}
