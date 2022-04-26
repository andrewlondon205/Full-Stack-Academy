package oop.exercises;
import java.util.*;

public class MyArray {
	
	private int[] sequence;

	public MyArray(int... numbers) {
		sequence = numbers;
	}

	public int findSum() {
		int sum = 0;
		for (int val : sequence)
			sum += val;
		return sum;
	}

	public double findAverage() {
		double sum = 0;
		for (int value : sequence)
			sum += value;
		return sum / sequence.length;
	}

	public int findMaximum() {
		int max = 0;
		for (int number : sequence)
			if (number > max)
				max = number;
		return max;
	}

	public int findMinimum() {
		int min = sequence[0];
		for (int number : sequence)
			if (number < min)
				min = number;
		return min;
	}

	public int[] reverseArray() {

		int[] output = new int[sequence.length];
		for (int k = sequence.length - 1, idx = 0; k > 0; k--, idx++)
			output[idx] = sequence[k];
		return output;
	}

	public int[] firstLast() {
		int[] result = { sequence[0], sequence[sequence.length - 1] };
		return result;
	}

	
	public static void main(String[] args) {
		MyArray m = new MyArray(20, 14, 39, 350, 82, 100);
		System.out.println(m.findSum());
		System.out.println(m.findAverage());
		System.out.println(m.findMaximum());
		System.out.println(m.findMinimum());
		System.out.println(Arrays.toString(m.reverseArray()));
		System.out.println(Arrays.toString(m.firstLast()));

	}

}
