package com.hackathon.exercises;

public class stringExercises {
	
	/*String str1 = "Hello";  

    String str2 = "Hello"; 

Explain these two statements, and  when i update the str1 = "hellojava" what will happens 

*/
	
	
	public static void stringUpdate() {
		String str1 = "Hello";
		String str2 = "Hello";
		
		str1 = "hellojava";
		
		System.out.println(str1 + "\n" + str2);
	}
	
	public static int characterOccurence() {
		char match = 'a';
		String a = "alpha";
		int count= 0; 
		
		for ( int i =0; i <a.length(); i++) {
			if(a.charAt(i) == match) {
				count++;
				
			}
			
		}System.out.println("there is a match in the charcaters" + ": " +  match + "=" + count  );
		 return count;
		
	}
	
	public static void palindrome() {
		//String  str = " A man, a plan, a canal: Panama";
		//String str = "Was it a car or cat I saw?";
		String str = "Malayalam";
		String ReversedString = "";
		
		//remove spaces and comma 
		String outputString = str.replaceAll("[,\\s:]", "");
		System.out.println("Original String without whitespace and special characters: " + outputString);
		
		for( int i = outputString.length()-1 ; i >=0 ; i--) {
			
		//Concatenated characters in the reverse loop using the += operator to build the reversed string.
			 ReversedString = ReversedString +  outputString.charAt(i);
			
		}
		System.out.print("Reversed String: " + ReversedString);
		System.out.println();
		
		// checking if the string is a palindrome
		if (outputString.equalsIgnoreCase(ReversedString)) {
	        System.out.println("The string is a Palindrome! " + str);
	    } else {
	        System.out.println("The string is not a Palindrome!");
	    }
	}
	

	public static void main(String[] args) {
		
		stringUpdate();
		characterOccurence();
		palindrome();
	}

}

/* stringUpdate();
 * In java string is ummutable meaning in this case str1 will create a string object pointing to "Hello" and 
 * since str2 value is also "Hello" which already exist in the string pool, str2 also points to the same object
 * When you update str1 to "hellojava" as the value of str1 is changed, 
 * it will create a new string object with the new value -hellojava
 */
