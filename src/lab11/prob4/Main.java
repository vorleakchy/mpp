package lab11.prob4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intNums = Arrays.asList(3, 5, 6, 2, 4, 1);
		System.out.println(secondSmallest(intNums));
		
		List<Double> doubleNums = Arrays.asList(4.0, 2.0, 3.0, 5.0, 1.0, 6.0);
		System.out.println(secondSmallest(doubleNums));
		
		List<Integer> intOneNums = Arrays.asList(1);
		System.out.println(secondSmallest(intOneNums));
	}

	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		if (list.size() < 2) return null;
		
		T firstSmallest = list.get(0);
		T secondSmallest = list.get(1);
		
		for (T ele : list) {
			if (ele.compareTo(firstSmallest) < 0) {
				secondSmallest = firstSmallest;
				firstSmallest = ele;
			}
			else if (ele.compareTo(secondSmallest) < 0 && ele != firstSmallest) {
				secondSmallest = ele;
			}
		}
		
		return secondSmallest;
	}

}
