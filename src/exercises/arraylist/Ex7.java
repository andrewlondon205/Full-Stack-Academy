package exercises.arraylist;
import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		
		List <Integer> array = new ArrayList<Integer> (Arrays.asList(5,9,10,400,321,232,54,899,2100)); 
		System.out.println(array.contains(12));
		System.out.println(array.contains(5)); // 
	}

}
