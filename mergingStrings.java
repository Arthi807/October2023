package com.hackathon.exercises;

public class mergingStrings {

public static void main(String[] args) {
	
		//merging strings alternately
	//create a stringbuilder variable and 
	//append each character from each string alternately
	
		StringBuilder resultingString = new StringBuilder();
		
		String word1 = "abctegh";
		String word2 = "pqrrg";
		
		int maxLength = Math.max(word1.length(), word2.length());
		
		for(int i=0; i<maxLength; i++) {
			
			if(i <word1.length()) {
				resultingString.append(word1.charAt(i));
			}
			
			if( i <word2.length()) {
				resultingString.append(word2.charAt(i));
			}
			
			
		}
		
		System.out.print(resultingString.toString());
		
		

	}

}
