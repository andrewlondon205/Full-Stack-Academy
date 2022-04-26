package lab1;

public class PersonFactory {

	public static Person getNewPerson() {
		return new Student();
	}
	
	public static HumanBeing getNewPerson (String p_type) { 
		if (p_type.equals("s"))
			return new Student();
		else if (p_type.equals("p"))
			return new Person();
		else 
			return new Teacher(); 
	}
}
