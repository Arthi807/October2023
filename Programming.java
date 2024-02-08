package com.hackathon.exercises;

/*
 *  Create a class named 'Programming'. While creating an object of the class, 
 *  if nothing is passed to it, then the message "I love programming languages" should be printed. 
 *  If some String is passed to it, 
 *  then in place of "programming languages" the name of that String variable should be printed. 
 * 
 */
public class Programming {
	
	public Programming(String str) {
		System.out.println("I love programming languages");
	}

	public static void main(String[] args) {
		Programming program = new Programming("Love it");
		program.getClass();
		
	}

}
