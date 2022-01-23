package polymorph;

public class EnhancedCalc extends Calculator {

	public double add(double a, int b) {
		System.out.println("Enhanced Version");

		return a + b;

	}

	public double add(long a, int b) {
		System.out.println("Enhanced Version");

		return a + b;

	}

	public double add(long a, long b) {
		System.out.println("Enhanced Version");

		return a + b;

	}

	public long add(int a, long b) {
		System.out.println("Enhanced Version");

		return a + b;

	}

	public double add(float a, float b) {
		System.out.println("Enhanced Version");

		return a + b;

	}

	public double add(double a, double b) {
		System.out.println("Enhanced Version");

		return a + b;

	}

}
