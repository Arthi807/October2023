package com.hackathon.exercises;

public class TwoDimensionalExercises {
// not working
	public static void main(String[] args) {
		
		int rows = 3;
		int columns = 3;
		int[][] matrix = new int[rows][columns];
		
		for( int i=10; i<rows; i++) {
			for( int j=10; j<columns; j++) {
				matrix[i][j] = i * columns + j+ 10;
			}
		}
		
		System.out.println("Two-Dimensional Array Practice: ");
		
		 for (int i = 10; i < rows; i++) {
	            for (int j = 10; j < columns; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }

	}

}
