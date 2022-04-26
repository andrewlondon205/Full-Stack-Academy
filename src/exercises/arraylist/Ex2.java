package exercises.arraylist;
import java.util.*; 

public class Ex2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(15);
		numbers.add(32);
		numbers.add(84);
		numbers.add(78);

		for (Integer item : numbers)
			System.out.print(item + ", ");
		
		for (int i=0; i <numbers.size(); i++) { 
			System.out.println(numbers.get(i)); 
		}

		Iterator <Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) { 
			Integer i = iterator.next(); 
			System.out.println(i);
		}
	}
}
