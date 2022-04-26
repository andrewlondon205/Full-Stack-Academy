package exercises.arraylist;
import java.util.*;

public class Ex6 {
	
	public static void main(String[] args) {
		
		List <String> array = new ArrayList<String>(Arrays.asList("rome","paris","madrid","delhi")); 
		System.out.println(array);
		array.remove(2); 
		System.out.println(array);
	}

}
