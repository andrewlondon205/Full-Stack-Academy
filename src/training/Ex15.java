package training;

public class Ex15 {

	public static void main(String[] args) {
		
		
		int original [] = {20, 30, 40, 50, 86}; 
		int first = original[0]; 
		int last  = original[original.length-1]; 
		int middle = ((original.length-1) / 2); 
		int [] newarray = {first, middle, last}; 
		int temp = 0; 
		for (int item : newarray) if (item > temp) temp = item; 
		System.out.println("largest " + temp);
		

	}

}
