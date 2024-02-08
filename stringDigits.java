package com.hackathon.exercises;

public class stringDigits {

	// how to chekc if a string contain only digits?
	
	public static boolean digits() {
		String a = "1234";
		String c = "123abcd";
		String alpha = "10890";
		
		boolean b = a.matches("\\d+");
		boolean b1 = c.matches("\\d+");
		boolean b2 = alpha.matches("\\d+");
		System.out.println(b + "\n" + b1 + "\n" + b2);
		return false;
		
	
	}
	public static void main(String[] args) {
		digits();
		
		
		
	}

}
