package model;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path; 
public class School {
	
	private List <Student> students ;
	public School () { 
	}
	
	public School (List<Student> students) {
		this.students = students; 
	}
		
	public List<Integer> getPromotedStudents ()  {
		List<Integer> promoted = new ArrayList<>();
		for (Student item : students) { 
			if (item.isPromoted()) 
				promoted.add(item.getId()); 
		}
		return promoted; 
	}
	
	public Integer getBestStudent () {
		Double max = 0.0; 
	    Integer best = 0; 
		for (Student item : students) {  
			if (item.getTotalAverage() > max) { 
				max = item.getTotalAverage();
				best = item.getId(); 
			}
			else { 
				continue; 
			}
		}
		return best; 
	}
	
	public String getStudentsInfo () { 
		String std = ""; 
		int idx = 1; 
		for (Student stud : students) { 
			std += "Student " + idx + "\n\n"; 
			std += "ID : " + stud.getId().toString() + "\n"; 
			std += "Name : " + stud.getName().toString() + "\n";
			std += "Surname : " + stud.getSurname().toString() + "\n";
			std += "Gender : " + stud.getGender().toString() + "\n";
			std += "Total Average :" + stud.getTotalAverage().toString() + "\n";
			std += "Promoted : " + stud.isPromoted() + "\n\n"; 
			idx++; 
		}		
		return std; 
	}
	
	public void saveStudentsInfo ()  {
		
		Path filename = Path.of("studinfo.txt"); 
		String content = getStudentsInfo(); 
		try {
			Files.writeString(filename, content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
