package exercises.arraylist;
import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		
		List <Integer> p1 = new ArrayList<Integer>(Arrays.asList(1,5,9)); 
		List <Integer> p2 = new ArrayList<Integer>(Arrays.asList(1,5,10,452));
		List <Integer> p3 = new ArrayList<Integer>(Arrays.asList(80,100)); 
		List <Integer> p4 = new ArrayList<Integer>(Arrays.asList(100, 80));
		
		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p4));	
	}

	}


