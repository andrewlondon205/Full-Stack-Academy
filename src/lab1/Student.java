package lab1;

public class Student extends Person{
	
	@Override
	public void speak () { 
		System.out.println("I am a student instead");
		
	}
	
	public double getExamsAverage() {
		return 30.0; 
	}

}
