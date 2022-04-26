package exercises.hashmapset;
import java.util.*;

public class Ex1 {

private static Map <String, Integer> dictionary = new HashMap <String,Integer> (); 
	
	public static void insertElement (String name, Integer mark) { 
		dictionary.put(name, mark); 
	}
	
	public static void printDictionary () {
		System.out.println(dictionary);
	}
	
	public static void getDictSize() { 
		System.out.println(dictionary.size());
	}
	
	public static void emptyDictionary() { 
		dictionary.clear();
	}
	
	public static boolean isDictEmpty() { 
		return dictionary.isEmpty(); 
	}
	
	public static boolean doesKeyExist(String key) { 
		return dictionary.containsKey(key);
	}
	
	public static boolean doesValueExist(Integer value) { 
		return dictionary.containsValue(value);
	}
	
	public static Integer getValue(String k) {
		return dictionary.get(k);
	}
	
	public static void getAllKeys() { 
		for (String it : dictionary.keySet())
			System.out.println(it);
	}
	
	public static void main(String[] args) {
		insertElement("Ramai",25); 
		insertElement("Andrew",35); 
		insertElement("John",40); 
		insertElement("Jodie",22);
		printDictionary(); 
		getDictSize(); 
//		emptyDictionary(); 
		printDictionary(); 
		System.out.println(isDictEmpty());
		System.out.println(doesKeyExist("Kevin"));
		System.out.println(doesValueExist(22));
		System.out.println(getValue("Ramai"));
		getAllKeys(); 
		
	}

}
