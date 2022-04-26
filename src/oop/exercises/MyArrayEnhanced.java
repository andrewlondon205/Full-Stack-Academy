package oop.exercises;
import java.util.*;

public class MyArrayEnhanced {
	
	private ArrayList<Integer> enhanced;

	public MyArrayEnhanced() {
		enhanced = new ArrayList<Integer>(Arrays.asList(20, 14, 39, 350, 82, 100));
	}

	public void printArray() {
		System.out.println(enhanced);
	}

	public Integer findSum() {
		Integer sum = 0;
		for (Integer item : enhanced)
			sum += item;
		return sum;
	}

	public Double findAverage() {
		Integer add = findSum();
		Double average = Double.valueOf(add) / enhanced.size();
		return average;
	}

	public Integer findMaximum() {
		Integer max = 0;
		for (Integer number : enhanced)
			if (number > max)
				max = number;
		return max;
	}

	public Integer findMinimum() {
		Integer min = enhanced.get(0);
		for (Integer item : enhanced)
			if (item < min)
				min = item;
		return min;
	}

	public void reverseArray() {
		Collections.reverse(enhanced);
	}

	public ArrayList<Integer> firstLast() {
		ArrayList<Integer> output = new ArrayList<Integer>(
				Arrays.asList(enhanced.get(0), enhanced.get(enhanced.size() - 1)));
		return output;
	}

	public static void main(String[] args) {
		MyArrayEnhanced me = new MyArrayEnhanced();
		System.out.println(me.findSum());
		System.out.println(me.findAverage());
		System.out.println(me.findMinimum());
		System.out.println(me.findMaximum());
		me.printArray();
		me.reverseArray();
		me.printArray();
		System.out.println(me.firstLast());

	}

}
