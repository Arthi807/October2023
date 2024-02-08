package com.hackathon.exercises;

public class anagram1 {

	public static void main(String[] args) {
		
		//check if string is an anagram - listen. silent // spot,stop // cinema, iceman
		
		String a1 = "listen";
		int len = a1.length();
		char a = 0;
		char b = 0;
		char c =0; 
		String b1 = "";
		
			for ( int i =0; i<len -1; ) {
				
				a = a1.charAt(2);
				//System.out.println(a);
				  b = a1.charAt(0) ;
				  c = a; // -> c = s
				  a = b; // -> a = l
				  i++;
				  
				 
				  
				  //System.out.println(b1 );
				  
				  
				 
				
			}
		
			
		

	}

}
