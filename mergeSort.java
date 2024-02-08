package com.hackathon.exercises;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		
		int m = nums1.length;
		int n = nums2.length;
		
		int j = n -1;
		
		for( int i =m -1; i>=0;i-- ) {
			
			if(j<0) {
				break;
			}
			
			if(nums2[j] >= nums1[i] ) {
				nums1[i] = nums2[j];
				j--;
				
			}
			
			//System.out.print(nums1[i] + " ");
			
		}
		Arrays.sort(nums1);
		System.out.print(Arrays.toString(nums1));
		
		
	}

}
