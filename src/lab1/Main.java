package lab1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 // EREDITARIETA, TIPO STATICO VI DICE QUALI METODI (O VAR) POTETE INVOCARE 
		
		 Person person = new Person(); 
		 person.speak();
			
		 Person pstudent = new Student(); 
		 pstudent.speak();
		 
		 Person p = PersonFactory.getNewPerson(); 
		 p.speak();
		
	     Scanner input = new Scanner(System.in);
	     System.out.print("Are you a student or teacher? ");
	     String p_type = input.next();
	     HumanBeing p7 = PersonFactory.getNewPerson(p_type);
	     p7.speak();
	     
	     
	     Person p1 = new Person("Ramai","Alejandria","M","AWNDU123",25,"3896349819");
	     Person p2 = new Person("John", "Thompson","M","DMKAK234",17,"99343141521"); 
	     Person p3 = new Person("Andrea","King","F","21321DW",34,"842193419"); 
	     Person p4 = new Person("Jodie","Lynne","F","89213FKCN",45,"891230219"); 
	     
//	     Person [] array = {p1,p2,p3,p4}; 
//	     Persona.getMaggiorenni(array); 
//	     Persona.getMinorenni(array);
//	     Persona.getMaschi(array);
//	     Persona.getFemmine(array);

	}

}
