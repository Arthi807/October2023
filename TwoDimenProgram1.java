package com.hackathon.exercises;

public class TwoDimenProgram1 {

	/*
	 * Write a Java program to find the average score of two students in three papers.
	 *  NOTE: Given, score of first student is 60, 55 and 70 while score of the second student is 80, 60 and 41.
	 *  i.e. int[][] score = { {60, 55, 70}, {80, 60, 41} }; 
	 */
	
	public static void StudentScores() {
		int[][] scoreA = {{60,55,70},
				          {80,60,41}};
		
		double sumA = 0;
		double sumB = 0;
		double average1 = 0;
		double average2 = 0;
		
		//finding average of both students using for loop
		for( int i=0; i<scoreA.length-1; i++) {
			sumA = scoreA[i][0] + scoreA[i][1]+ scoreA[i][2];
			System.out.print(sumA + " : is the sum of three subjects of Student1" + "\n");
			average1 = sumA /3;
			System.out.print(average1 + ": is the average of the three subjects of Student1");
			
		}
		
		System.out.println("\n");
		
		for( int j =1; j<scoreA.length ; j++) {
			sumB = scoreA[j][0] + scoreA[j][1]+ scoreA[j][2];
			System.out.print(sumB + " : is the sum of three subjects of Student2" + "\n");
			average2 = sumB / 3;
			System.out.print(average2 + ": is the average of the three subjects of Student2");
		}
		
	}
	
	/* Given an array of integers, print only odd numbers array[]={3,8,6,14,5,17,19} 
	 */
	
	public static void  Oddnumbers() {
		
		int[] givenArray = {3,8,6,14,5,17,19};
		int[] OddArray = new int[givenArray.length];
		
		for( int i = 0; i<givenArray.length; i++) {
			
			if( givenArray[i] % 2 != 0) {
				OddArray[i] = OddArray[i] + givenArray[i];
				System.out.print("," + OddArray[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		//StudentScores();
		Oddnumbers();
		
		

	}

}
