package lab2;
import java.util.*;

public class OperationsTest {
	
	public static void main(String[] args) {
		
		Operations o = new Operations (); 
		Scanner sc = new Scanner(System.in); 
		List <Integer> array = new ArrayList<Integer> (Arrays.asList(5,9,10,400)); 
		
		while (true) { 
			System.out.println("Add a number please");
			int n = sc.nextInt(); 
			if (n != -1)
				o.insertNumber(n);
			else
				break;
		}
		
		o.printLargest();
		o.printSmallest();
		o.printArraySize();
		
		System.out.println("Now enter any number, please");
		int input = sc.nextInt();
		for (int k=0; k<input; k++) { 
			System.out.println("Enter the name of your friend");
			String in = sc.next(); 
			o.addRequests(in);
		}
		
		o.printEndsWithO();
		System.out.println("Now enter the last number, please");
		int lastinput = sc.nextInt();
		System.out.println(o.getArray(array, lastinput));
	}

}
