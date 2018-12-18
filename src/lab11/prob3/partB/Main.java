package lab11.prob3.partB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Object> objs = new ArrayList<Object>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(3);
//		double dbl = sum(ints); // Compile error
	}

	public static double sum(Collection<? extends Number> nums) {
		double s = 0;
		
		for (Number num : nums)
			s += num.doubleValue();
		
		return s;
	}

}
