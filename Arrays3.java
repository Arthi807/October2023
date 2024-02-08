package com.hackathon.exercises;

public class Arrays3 {

	/* fix the code below
	 * Given an array of integers nums and an integer target, 
	 * return indices of the two numbers such that they add up to target. 
	You may assume that each input would have exactly one solution, 
	and you may not use the same element twice. 
	
	Input: nums = [2,7,11,15], target = 9 

	Output: [0,1] 

	Input: nums = [3,2,4], target = 6 

	Output: [1,2] 

	Asked space and complexity of the program - Time complexity is based on loops used // space complexity is based on data structures used. 
	In this program there is only 1 for loop which is o(n) time complexity and 
	data structures are not used for variables and constants so the space complexity is 0(1). 
	 */
	
	public static void Target1() {
		
		int[] nums = {3,2,4};
		int sum =0;
		int target = 6;
		
		for ( int i=0; i <nums.length; i++) {
			if ( i <nums.length -1) {
				sum = nums[i] + nums[i +1];
			}
			
			if(sum == target ) {
				System.out.print("[");
				System.out.print( "Indices of the two elements that reach the target output is : " +  i  );
				if ( i <nums.length - 1) {
					System.out.print(",");
					i = i + 1;
					System.out.print(i);
				}
				
			} 
			System.out.println();
			
			if ( sum != target && i <nums.length - 1) {
				sum = nums[i] + nums[i +1];
				System.out.print( "Indices of the two elements that reach the target output is : " +  i  );
				
				if ( i <nums.length - 1) {
					System.out.print(",");
					i = i + 1;
					System.out.print(i);
				}
				
			} else {
				System.out.print("The two numbers do not add upto target" + i);
			}
			
		}System.out.print("]");
	}
	
	public static void main(String[] args) {
		
		Target1();

	}

}
