package com.hackathon.exercises;
// encapuslation concept:
// this is a class -'positiveIntnegativeInt' that encapsulates multiple values as attributes/variables
// - the constructor of this class [public positiveIntnegativeInt(int x, int y)] 
//- This line declares a constructor for the Result class. 
//- A constructor is a special method that gets called when an object of the class is created. 
//- This constructor takes two parameters (value1 and value2) and
//- initializes the instance variables with the provided values.
//- [public int getx()] these methods are getter methods that can get and return the values when we need
// - 
public class positiveIntnegativeInt {
	
	private int x;
	private int y;
	
	public positiveIntnegativeInt(int x, int y) {
		
		this.x = x;
		this.y = y;	
	}
	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	// - the [positiveIntnegativeInt] method will create an object[ 'return new positiveIntnegativeInt (x,y)'] 
	//- when returning the values so it can be accessed anywhere in the classes
	public static positiveIntnegativeInt returnValues() {
		
		int x = 5;
		int y = 4;
		System.out.println(x + "\n" + y);
		return new positiveIntnegativeInt (x,y);
		
		
	}

	public static void main(String[] args) {
		
		returnValues();

	}

}
