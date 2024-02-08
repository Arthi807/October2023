package com.hackathon.exercises;

public class duplicates {

	public static void main(String[] args) {
	
		String a = "hello";
		char result = 0;
		String b = "";
		
		for( int i= a.length()- 1; i>0; i--) {
			if( a.charAt(i) == a.charAt(i-1)) {
				result = a.charAt(i);
				System.out.print("Duplicate character:" + result + "\n");
				
			} else {
				b =  a.charAt(i) + b;
				
			}
		}
		b = a.charAt(0) + b;
		System.out.print( b);

	}

}
