package com.hackathon.exercises;

public class strinexer {
	
	public static void WhatDoIDo(String str)
	{
	String result = "";
	for (int i = 0; i < str.length(); i++)
	{
	if (!result(str.charAt(i)))
	{
	result  = result + str.charAt(i);
	}
	}
	 
	System.out.println(result);
	}

	private static boolean result(char charAt) {
		
		return false;
	}

	public static void main(String[] args) {
		WhatDoIDo("churro");
		
	}

}
