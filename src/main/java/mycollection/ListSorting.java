package mycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorting {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("Gajraula");
		cities.add("Moradabad");
		cities.add("Bijnor");
		cities.add("Meerut");
		cities.add("Ghaziabad");
		cities.add("Lucknow");
		// prior to java 8
		Collections.reverse(cities);
		System.out.println(cities);
		Collections.sort(cities, Collections.reverseOrder());
		System.out.println(cities);
		cities.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.valueOf(o2.length()).compareTo(Integer.valueOf(o1.length()));
			}
		});
		System.out.println(cities);
		
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

		// java 8 version
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		sortedList = list.stream().sorted((o1,o2)->Integer.valueOf(o2.length()).compareTo(Integer.valueOf(o1.length()))).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
	}
}
