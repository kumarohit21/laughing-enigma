package com.j11.practice;

public class PrimitiveCasting {

	int add(int a, int b) {
		System.out.println("Calling add(int a, int b)"); 
		return a + b;
	}
	
	Integer add(Integer a, Integer b) {
		System.out.println("Calling add(Integer a, Integer b)"); 
		return a + b;
	}
	
	double add(double a, int b) {
		System.out.println("Calling add(double a, int b)"); 
		return a + b;
	}
	
	double add(double a, double b) {
		System.out.println("Calling add(double a, double b)"); 
		return a+b;
	}
	
	double add(float a, float b) {
		System.out.println("Calling add(float a, float b)"); 
		return a+b;
	}
	
	public static void main(String[] args) {
		
		PrimitiveCasting ca = new PrimitiveCasting();
		System.out.println(ca.add(1,2));
		
		
		System.out.println(ca.add(1.0,2));
		System.out.println(ca.add(1.0,2.0));
		System.out.println(ca.add(1.0,2.0f));
		
	}
	
}
