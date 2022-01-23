package streamer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamOps {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Map<Integer, Integer> numberSquareMap = list.stream().collect(Collectors.toMap((val) -> val, (val) -> val * val));
		
		System.out.println(numberSquareMap);
		
		
	}

}
