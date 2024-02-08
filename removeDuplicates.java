package com.hackathon.exercises;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {

	
	public static void duplicateRemove() {
		
		int[] n = {1,1,2};
		int result = 0;
		int[] r = new int[3];
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n.length; i++) {
			set.add(n[i]);
			if(!set.contains(n[i])) {
				result = n[i];
				r[i] = result;
			}
		}
		
		for( int uniqueElement: set) {
			r[result++] = uniqueElement;
		}
		System.out.println(" " + Arrays.toString(r));
		
	}
	public static void main(String[] args) {
		duplicateRemove();

	}

}
