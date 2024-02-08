package com.hackathon.exercises;

import java.util.HashSet;

public class string {

	public static void WhatDoIDo(String str) {
		
	    String result = "";
	    HashSet<Character> set = new HashSet<>();
	    for (int i = 0; i < str.length(); i++) {
	        if (!set.contains(str.charAt(i))) {
	            result += str.charAt(i);
	            set.add(str.charAt(i));
	        }
	    }
	    System.out.println(result);
	}
	public static void main(String[] args) {
		WhatDoIDo("churro");
	}

}
