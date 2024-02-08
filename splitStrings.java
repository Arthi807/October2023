package com.hackathon.exercises;

public class splitStrings {

	public static void main(String[] args) {
		
		String a = "listentome";
		
		String[] b = a.split("");
		
		System.out.println("Split string is:");
		
		for ( String word: b) {
			System.out.print(word + " ");
		}
		

	}

}

/** Create an empty array and use split method to build the array 
 *  use for-each loop to iterate in the array and print the split string
 */

