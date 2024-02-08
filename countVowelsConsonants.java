package com.hackathon.exercises;

public class countVowelsConsonants {

	
	public static void countVandC() {
		String word = "aeltwikhofu";
		int len = word.length();
		
		char vowel = 0;
		char consonant = 0;
		
		int countV =0;
		int countC =0;
		
		for( int i=0; i<len; i++) {
			
			if (word.charAt(i) == 'a'|| word.charAt(i)=='e'||word.charAt(i) == 'i'||word.charAt(i) =='o'||  word.charAt(i)=='u'){
				vowel = (char) (vowel + word.charAt(i));
				countV = word.charAt(i);
				System.out.println(countV);
				System.out.println(vowel + " is a vowel" );
				
			} else {
				consonant = (char) (consonant + word.charAt(i));
				countC = word.charAt(i);
				System.out.println(vowel + " is a consonant" );
			}
			
	}
		System.out.println("vowel count:" + countV);
		System.out.println("consonant count:" + countC);
	
	
	}
	public static void main(String[] args) {
		countVandC();

	}

}
