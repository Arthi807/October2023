package com.hackathon.exercises;

import java.util.Scanner;

public class FactorialNonRecursive {
	
	// logic: n! = n * [(n-1)!]
	// 

	public static void  main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = scanner.nextInt();
		
		
		if ( n == 1) {
			System.out.println("Factorial cannot be done beyond this point");
		}
		
		float c = 1;
		for (int i= 1; i <=n ; i++) {
			  c = c * i;
		}
		System.out.println("Factorial of the number is: " + c);
		scanner.close();
	
		
	

}

}
