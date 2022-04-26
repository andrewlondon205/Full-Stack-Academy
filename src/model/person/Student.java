package model.person;

public class Student extends Person{
	
	private String id_student;
	private String section;
	private int year; 
	
	public Student () { 
		
	}
	
	public Student(String name, String last_name) {
		super(name, last_name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printIdentity() { 
		System.out.println("I am a student instead");
	}
	

}
