package fundamentals;
import java.util.Scanner; 

public class HelloWorld {

	public static void main(String[] args) {
		Printer p = new Printer(); 
		p.printHello(); 
		Printer p2 = new Printer("text"); 
		// printHello(); 
		System.out.println(p2.PrinterReturn("12"));
		String s1 = p2.PrinterReturn("12"); 
		Scanner input = new Scanner(System.in); 
		System.out.println("Inserisci input:");
		String userInput = input.next();
		System.out.println("Hello \n" + userInput);
		
		
		int a = 30; 
		long b = 50L; 
		double c = 89.2;
		String string = "murderer"; 
		String empty = "";
		boolean condition = true; 
		
		
		String [] array = new String[5];
		array[0] = "stringa posizione 0"; 
		array[1] = "stringa posizione 1"; 
		array[2] = "stringa posizione 2"; 
		array[3] = "stringa posizione 3"; 
		array[4] = array[3]; 
			
		for (int k=0; k<array.length; k++) 
			System.out.println(array[k]);
		
		int counter = 0; 
		while (counter < 5) {
			//System.out.println(array[counter]);
			System.out.println("2jdi1d");
			if (counter ==2) {
				System.out.println("Numero pari");
			}
			else { 
				System.out.println("indice diverso da 2");
			}
			counter += 1; 
		}
	}
	
	public static void printHello() { 
		System.out.println("hello");
		
	}

}
