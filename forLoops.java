package com.hackathon.exercises;

public class forLoops {
 static int first;
 static int second;
 
	// fibonacci series - 1,1,2,3,5,8,13,21
	
	public static void fibonacci(int x) {
		
		 first = 0;
		 second = 1;
		
		 System.out.print(first + "," + second);
		 
		for ( int i=2; i<=x; i++) {
			
			int next = first + second;
			System.out.print("," + next);
			
			first = second;
			second = next; 
		
		} 
		
		
	}
	
	public static void main(String[] args) {
		
		fibonacci(9);
		
		

	}

}
