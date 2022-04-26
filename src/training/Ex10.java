package training;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in); 
		
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0; 
		
		System.out.println("Enter the text please");
			String s = input.nextLine();
			
		for (int k=0; k<s.length();k++) { 
			if (Character.isLetter(s.charAt(k))) 
				letter ++;
			else if (Character.isDigit(s.charAt(k))) 
				number ++; 
			
			else if (Character.isSpaceChar(s.charAt(k))) 
				space ++;
			else 
				other ++; 
			
		}
		
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("number: "+number);
		System.out.println("other: "+other);

	}

}
