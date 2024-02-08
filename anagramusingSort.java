package com.hackathon.exercises;

import java.util.Arrays;

public class anagramusingSort {

	public static void main(String[] args) {
		
		char[] str1 = {'l','i','s','t','e','n'};
		char[] str2 = {'s','i','l','e','n','t'};
		
		boolean isAnagram = true;
		
		int l1 = str1.length;
		int l2 = str2.length;
		
			if(l1 != l2) {
				isAnagram = false;
			}
		
		 Arrays.sort(str1);
		 Arrays.sort(str2);
		 
		 for ( int i =0; i<l1 ; i++) {
			 if(str1[i] != str2[i]) {
				 isAnagram = false;
			 }
			 
		 }
		 System.out.println("The two strings are anagrams: " + Arrays.toString(str1) + "\n" + Arrays.toString(str2));

	}

}


/* find if the length is same using .length method
 * sort the two strings and check if characters are the same in both strings
 * Print the sorted strings and visually check the character matches
 * use boolean variable to check if the length is same and char are same
 * use for loop to check if strings match using if block statement
 */
