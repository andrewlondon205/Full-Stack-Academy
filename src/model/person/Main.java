package model.person;

public class Main {

	public static void main(String[] args) {
		 Person persona = new Person(); 
		 persona.printIdentity();
			
		 Person personaStudente = new Student(); 
		 personaStudente.printIdentity();
		
	     Person p1 = new Person("Ramai","Alejandria","M","AWNDU123",25,"3896349819");
	     Person p2 = new Person("John", "Thompson","M","DMKAK234",17,"99343141521"); 
	     Person p3 = new Person("Andrea","King","F","21321DW",34,"842193419"); 
	     Person p4 = new Person("Jodie","Lynne","F","89213FKCN",45,"891230219"); 
	     
	     Person [] array = {p1,p2,p3,p4}; 
	     Person.getAdults(array); 
	     Person.getJuvenile(array);
	     Person.getMales(array);
	     Person.getFemales(array);

	}

}
