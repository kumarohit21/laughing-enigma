package com.j11.ipractive.nheritance;

public class ChildA extends Parent {


	
	
	public static void main(String[] args) {
		Parent ca = new ChildA();
		ca.sayHello();
		
		ChildB pa = new ChildB();
		pa.sayHello(); 
	}
}



class ChildB extends Parent {

	
}