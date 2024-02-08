package com.hackathon.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class integerCheck {
	
	static int[] nums = new int[4];
	static int check =0;
	
	public static void checkInteger() {
		
		for( int i=0; i<4; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter your number:");
			 check = scan.nextInt();
			 nums[i]=check;
			//System.out.println("The entered number is: " + check);
				
			
			
		}
		for( int i = 0; i < nums.length; i++) {
			
			System.out.print("," + nums[i]);
			
			if ( nums[i] == nums[i + 1]) {
				System.out.println("The numbers are equal:" + nums[i] + "/" + nums[i+1]);
			} else {
				System.out.println("The numbers are NOT equal:" + nums[i] + "/" + nums[i+1]);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		checkInteger();

	}

}
