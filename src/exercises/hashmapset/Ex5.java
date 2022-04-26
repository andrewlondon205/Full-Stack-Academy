package exercises.hashmapset;
import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		
		Set <Integer> elements = new HashSet <Integer> (Arrays.asList(1,21,42,52,9,912,9)); 
		System.out.println(elements);
		elements.clear();
		System.out.println(elements);

	}

}
