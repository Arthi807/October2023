package com.hackathon.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largestNum {
	
	
	/*
	 *  Write a Java program to find the k largest elements
	 *  in a given array of length n. 
	 *  Elements in the array can be in any order.
	 *  Here, "k" is number of result you want to check, and 
	 *  "n" is length of an array.

		Example: if k=3, then it will find first three largest number from array.
	 */

	
	public static void CheckNum() {
		
		int[] elements = {2,5,1,0,6};
		int n = elements.length;
		int k =3;
		
		//sort the array in ascending order
		/*for( int i=0; i<n-1; i++) {
			
			if( elements[i] > elements[i + 1]) {
				int temp = elements[i +1];
				elements[i + 1] = elements[i];
				elements[i] = temp;
			}  
		}*/
			Arrays.sort(elements);
			System.out.println( " "+ Arrays.toString(elements));
		for( int i= n-1; i>= n-k; i--) {
			System.out.print(elements[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		
		CheckNum( );

	}

}
