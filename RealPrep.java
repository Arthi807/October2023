package com.hackathon.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RealPrep {
	//nput "ad13 ch56 im4" separate num and alpha  
	
	public static boolean alphaNum() {
		String Original = "ad13 ch56 im4";
		String digits = Original.replaceAll("\\d", "");
		
		//retrieve digits from the string
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(Original);
		
		//use String builder to print the digits
		StringBuilder digits1 = new StringBuilder();
		
		while(matcher.find()) {
			digits1.append(matcher.group());
		}
		//print original string 
		System.out.print(Original + ": is the original string" +"\n");
		
		//remove digits
		System.out.print(digits + ": is the original string without digits " + "\n");
		
		System.out.print(digits1 + ": is the original string with digits retrieved using string builder" + "\n");
		
		return false;
	
}
	

	public static void main(String[] args) {
		 alphaNum();

	}

}
