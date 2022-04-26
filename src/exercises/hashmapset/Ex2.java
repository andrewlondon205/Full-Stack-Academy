package exercises.hashmapset;
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Set <Integer> myset = new HashSet <Integer> (Arrays.asList(2,9,10,52,9,912,9)); 
		for (Integer item : myset) 
			System.out.println(item);

	}

}
