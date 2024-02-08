package com.hackathon.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
	
	/* Test cases on the below java code:
	 * TC1: Method should accept integer as input from the user
	 * TC2: Create an integer array in random order
	 * TC3: Check if 7 is present in the user input, if present, program should output as "BOOM"
	 * TC4: Check if 7 is not present in the user input, if not present, program should output as "7 not found in the array"
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int userEntry = userInput.nextInt();
		
		int [] array = new int[userEntry];
		
		for(int i=0; i<userEntry; i++) {
			
			System.out.println("Enter the value" + (i+1) + ":");
			array[i] = userInput.nextInt();
			
		}
		
		userInput.close();
		
		System.out.println("The elements in the array are:");
		for( int i=0; i<userEntry; i++) {
			System.out.print(array[i]);
			if(i <userEntry- 1) {
				System.out.print(",");
			}
			if( array[i] == 7) {
				System.out.println("BOOM");
			}
			else if (array[i] != 7) {
				System.out.println("7 is not present");
			}
		}
		System.out.print("]");
	}

}
