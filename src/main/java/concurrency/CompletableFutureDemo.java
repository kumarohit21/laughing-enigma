package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CompletableFutureDemo {
	
	public static void main(String[] args) {
		
		List<Circle> circles = Arrays.asList(new Circle(1.4), new Circle(1.5), new Circle(1.6));
		
		
	  
		List<CompletableFuture<Double>> futures = circles.stream()
		.map(s-> CompletableFuture.supplyAsync(()->3.14 * s.getRadius()*s.getRadius()))
		.collect(Collectors.toList());
		
		futures.stream().map(f->{
			try {
				return f.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}


class Circle{
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	
}