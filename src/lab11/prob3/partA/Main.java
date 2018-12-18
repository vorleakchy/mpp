package lab11.prob3.partA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
//		nums.add(3.14); // Compile error

	}

	public static double sum(Collection<? extends Number> nums) {
		double s = 0;
		
		for (Number num : nums)
			s += num.doubleValue();
		
		return s;
	}
}
