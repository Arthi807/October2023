package com.hackathon.exercises;

public class variableSwaps {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 10;
		
		//output -> a = 10, b = 30
		System.out.println("a value before swap is:  " + " a " +"="+ a);
		System.out.println("b value before swap is:  " + " b " +"="+ b);
		
		a = a + b; 
		// a = 40
		b = a - b;
		// b = 40 - 10 = 30
		a = a - b;
		// a = 40 - 30 = 10
		
		System.out.println("a value after swap is:  " + " a " +"="+ a);
		System.out.println("b value after swap is:  " + " b " +"="+ b);
		
		
	}

}
