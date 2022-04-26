package com.academy.fullstack;
import com.academy.fullstack.model.Product; 
import com.academy.fullstack.exceptions.*;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(); 
	
		
		try {
			product.checkProductStock(15); 
			System.out.println("*** EMPTYING RESOURCES *** ");
		} catch(InsufficientStock e) { 
			System.out.println(e.getMessage());
		} finally {
			System.out.println("*** FINALLY BLOCK ***");
		}
		
		System.out.println("*** STOP ***");
	}
}
