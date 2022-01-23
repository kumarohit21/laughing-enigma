package GenericInheritance;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	
	List<T> boxes = new ArrayList<>();
	
	public void add(T t) {
		boxes.add(t);
	}

}
