package com.hackathon.exercises;

import java.util.Arrays;

public class Arrays1 {
	

	public static void main(String[] args) {
		
		int[] number = {1,2,0,5,0,6,3,0,7};
		//expected output = {1,2,5,6,3,7,0,0,0}
		
		int temp;
		int count = 0;
		
		for(int i=0; i<number.length -1; i++) {
			
			if(number[i] !=0) {
				number[count++] = number[i];
			}
			
			for(int j=0; j<number.length-1; j++) {
				if(number[j] ==0) {
					temp = number[j];
					number[j] = number[j+1];
					number[j +1] = temp;
					
				} 
			}
			
			
		}
		
		System.out.print(Arrays.toString(number) + " ");
		
			
		
	}
	

}


