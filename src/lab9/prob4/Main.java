package lab9.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Set<String>> sets = new ArrayList<>();
		
		Set<String> set1 = new HashSet<>();
		set1.addAll(Arrays.asList("A", "B"));
		
		Set<String> set2 = new HashSet<>();
		set2.add("D");
		
		Set<String> set3 = new HashSet<>();
		set3.addAll(Arrays.asList("1", "3", "5"));
		
		sets.addAll(Arrays.asList(set1, set2, set3));
		
		Set<String> output = union(sets);
		output.forEach(System.out::println);
	}
	
	public static Set<String> union(List<Set<String>> sets) {
		final Set<String> initialSet = new HashSet<String>();
		
		return sets.stream()
			.reduce(initialSet, (set, setN) -> { set.addAll(setN); return set;} );
	}

}
