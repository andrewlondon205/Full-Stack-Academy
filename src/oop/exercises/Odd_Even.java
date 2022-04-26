package oop.exercises;

public class Odd_Even {

	public static void main(String[] args) {
		
		int odd = 0; 
		int even = 0;
		int [] array = {5,7,9,2,4}; 	
		for (int element : array) { 
			if (element % 2 == 0) even ++; 
			else odd ++; 
		}
		
		System.out.println("Number of even numbers : " + even );
		System.out.println("Number of odd numbers : " + odd);

	}

}
