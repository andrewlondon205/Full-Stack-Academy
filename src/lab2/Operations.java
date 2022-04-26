package lab2;
import java.util.*;

public class Operations {
	
	private List <Integer> myarray;
	private List <String> requests; 
	private Integer input; 
	
	public Operations () {
		myarray = new ArrayList <>();
		requests = new ArrayList <> (); 
		input = 0; 
	}
	
	public Integer getInput() {return input; }

	public void insertNumber (int input) {
		myarray.add(Integer.valueOf(input)); 
	}
	
	public void printArraySize() {
		System.out.println("The size of the array is :" + myarray.size());
	}
	
	public void addRequests(String rq) { 
		requests.add(rq); 
	}

	public void printEndsWithO () { 
		for (String item : requests) { 
			if (item.endsWith("o"))
				System.out.print(item + " ");
		}
		System.out.println();
	}
	
	public void printSmallest() { 
		Integer smallest = myarray.get(0); 
		for (Integer item : myarray) {
			if (item < smallest) 
				smallest = item; 
		}
		System.out.println("The smallest number is : " + smallest);
	}
	
	public void printLargest() { 
		Integer largest = 0; 
		for (Integer item : myarray) {
			if (item > largest) 
				largest = item; 
		}
		System.out.println("The largest number is : " + largest);
	}
	
	public List <Integer> getArray (List <Integer> numbers, int inp) { 
		numbers.add(Integer.valueOf(inp)); 
		return numbers; 
	}

}
