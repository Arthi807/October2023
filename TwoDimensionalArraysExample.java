package com.hackathon.exercises;

public class TwoDimensionalArraysExample {

	    public static void main(String[] args) {
	        // Step 1: Declaration and Initialization
	        int rows = 3;
	        int columns = 4;
	        int[][] matrix = new int[rows][columns];

	        // Step 2: Initializing the array
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix[i][j] = i * columns + j + 1;
	            }
	        }

	        // Step 3: Printing the array
	        System.out.println("Two-Dimensional Array:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}


