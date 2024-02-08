package com.hackathon.exercises;

import java.util.regex.Pattern;

public class stringManipulation {
	
	/*1.  "ad13 ch56 im4"
	 * Modify the previous exercise to handle spaces as well. 
	 * Retrieve and print all the digits and spaces from the string.
	 */

	public static void DigitsandSpaces(String str) {
		
		String str1 = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str1);
		
	}
	
	/*
	 * 
	 */
	
	    public static void main(String[] args) {
	    	//DigitsandSpaces("ad13 ch56 im4");
	        String name = "John";
	        int length = findNameLength(name);
	        System.out.println("Length of the name " + name + " is: " + length);
	    }

	    private static int findNameLength(String str) {
	        int length = str.length();
	        return length;
	    }
	}

	


