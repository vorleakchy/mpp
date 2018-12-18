package lab11.prob1.partA;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
//		List<Number> nums = ints; // Compile error, because ints is a List<Integer> trying to assign to a List<Number>, it's not covariant.
//		nums.add(3.14);
	}

}
