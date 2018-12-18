package lab11.prob1.partB;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
//		nums.add(3.14); // Compile error, because 3.14 is double trying to add to the list of subtype extends Number, it preserves type safety
	}

}
