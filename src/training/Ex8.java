package training;
import java.util.*;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the 1st number");
		int a = input.nextInt();
		System.out.println("Enter the 2nd number");
		int b = input.nextInt();

		if (a != b)
			System.out.println(a + " != " + b);
		else
			System.out.println(a + " == " + b);

		if (a < b)
			System.out.println(a + " < " + b);
		else
			System.out.println(a + " > " + b);

		if (a <= b)
			System.out.println(a + " <= " + b);

	}

}
