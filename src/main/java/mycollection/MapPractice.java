package mycollection;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {

		Product bike = new Product("E-Bike", "Bike with battery");
		Product receBike = new Product("Road Bike", "Bike for competetion");

		Map<String, Product> productMap = new HashMap<>();
		productMap.put(bike.getName(), bike);
		productMap.put(receBike.getName(), receBike);
		
		System.out.println(productMap.get(receBike.getName()));

	}
}

class Product {
	private String name;
	private String description;

	public Product(String name, String description) {

		this.name = name;
		this.description = description;

	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {

		return this.description;
	}
	
	public String toString() {
		
		return "[name= "+name+", description= " + description+"]";
		
	}
}