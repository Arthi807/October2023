package Bubble_sort;

//import java.util.Arrays;

public class bubbleSort_exercise {
	
	public void program1(int[] array) {
		
		
		int temporary; 
		int arrLength = array.length; 
		
		for ( int i=0; i<arrLength; i++) {
				
			for ( int j =0; j <arrLength -1; j++) {
				
				if(array[j] > array[j+1]) {
					temporary = array[j];
					array[j] = array[j+1];
					array[j+1] = temporary;
				}	
				
			}
		}	
	
	}
	
	public static void main(String[] args) {
		
		int [] array = {20, 4, 6, 70, 10};
		
		bubbleSort_exercise arrObject = new bubbleSort_exercise();
		arrObject.program1(array);
		//System.out.println(Arrays.toString(array) + " Sorted Array");
		for(int i=0; i<array.length; i++) {
		System.out.print(array[i] + "Array");
		
		
	}

}
}
