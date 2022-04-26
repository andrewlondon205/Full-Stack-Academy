package exercises.arraylist;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		
		List <Integer> numb = new ArrayList<Integer>(); 
		numb.add(3);
		numb.add(8);
		numb.add(9);
		numb.add(12);
		numb.add(421);
		
		System.out.println(numb);
		numb.add(0, 30);
		System.out.println(numb);
	}

}
