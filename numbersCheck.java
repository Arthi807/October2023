package com.hackathon.exercises;

import java.util.Scanner;

public class numbersCheck {

	public static boolean numbers() {
		
		boolean var = false;
		
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your first double variable: ");
			double variable = scan.nextDouble();
			
			
			System.out.println("Enter your second double variable: ");
			double variable1 = scan.nextDouble();
			
			if( variable >0 && variable <10) {
				var = true;
			}
			System.out.println(var);
		
			if( variable1 >0 && variable1 <10) {
				var = true;
			}
			System.out.println(var);
		
		return var;
		
		
		
	}
	public static void main(String[] args) {
		numbers();

	}

}
