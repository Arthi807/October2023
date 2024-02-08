package com.hackathon.exercises;

import java.util.Scanner;

public class ifElseLoops {
	
	public static int positive(int x) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		x = scan.nextInt();
		
		if( x < 0) {
			System.out.println("Number is a negative integer");
		} else {
			System.out.println("Number is a positive integer");
		} 
		scan.close();
		
		return x;
	}

	public static void main(String[] args) {
		ifElseLoops objectA = new ifElseLoops();
		objectA.positive(0);

	}

}
