package exercises.hashmapset;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		
		Set <Integer> myset = new HashSet <Integer> (Arrays.asList(1,21,42,52,9,912,9)); 
		Set <Integer> myset2 = new HashSet <Integer> (); 
		System.out.println(myset.isEmpty());
		System.out.println(myset2.isEmpty());
	}

}
