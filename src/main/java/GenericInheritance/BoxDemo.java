package GenericInheritance;

public class BoxDemo {

	public static void main(String[] args) {
		Box<Number> numberBox = new Box<>();
		
		numberBox.add(new Integer(3));
		
	}
}
