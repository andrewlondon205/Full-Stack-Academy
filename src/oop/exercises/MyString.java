package oop.exercises;


public class MyString {

	private String input;

	public MyString(String input) {
		this.input = input;
	}

	public boolean containsVowels() {
		for (int k = 0; k < input.length(); k++) {
			if (input.charAt(k) == 'a' || input.charAt(k) == 'e' || input.charAt(k) == 'i' || input.charAt(k) == 'o'
					|| input.charAt(k) == 'u') {
				return true;
			}
		}
		return false;
	}

	public String isOddEven() {
		int count = 0;
		for (int k = 0; k < input.length(); k++) {
			if (!Character.isSpace(input.charAt(k)))
				count++;
		}

		if (count % 2 == 0)
			return "even";
		else
			return "odd";
	}

	public int countVowel() {
		int counter = 0;
		for (int k = 0; k < input.length(); k++) {
			if (input.charAt(k) == 'a')
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		
		MyString ms = new MyString ("andrea sterbini, angelo spognardi, angelo monti"); 
		System.out.println(ms.isOddEven());
		System.out.println(ms.containsVowels());
		System.out.println(ms.countVowel());

	}

}
