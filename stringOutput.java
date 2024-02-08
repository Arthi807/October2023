package com.hackathon.exercises;

import java.util.Scanner;

public class stringOutput {

	public static void main(String[] args) {
		
		//convert int input to string output
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your integer");
		int num = userInput.nextInt();
		
		String numString = Integer.toString(num);
		System.out.println("The integer converted to string is:"  + numString );
		
		String a = "56";
		String b = numString;
		String c = a + b;
		System.out.println(c);
		
	}

}
