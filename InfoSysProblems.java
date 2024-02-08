package com.hackathon.exercises;

import java.util.Scanner;

public class InfoSysProblems {

	/*	Print prime numbers till the given number. - 15
	 * 2. Input "ad13 ch56 im4" separate num and alpha  
	 * 
	 */
	
	
	public static void primeNumbers() {
		//int[] numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = obj.nextInt();
		
		boolean isPrime = true;
		
		if( num <= 1) {
			System.out.println("Give me a number more than 1");
		}
		for (int i=2; i<=num /2; i++) {
			
			if( num % i == 0){
				isPrime = false;
				break;
			} 
			
		}
		if (isPrime ){
			System.out.println("The number is a prime number: " + num);
			
		} else {
			System.out.println("The number is NOT a prime number: " + num);
		}
		
	
	}
	public static void main(String[] args) {
		primeNumbers();

	}

}
