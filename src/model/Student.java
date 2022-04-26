package model;
import java.util.*;

public class Student {
	
	private Integer id; 
	private String name; 
	private String surname; 
	private String gender; 
	private Map <String, List<Integer>> studmarks; 

	public Student () { 
		studmarks = new HashMap<String, List<Integer> > (); 
	}
	
	public Student (Integer id, String name, String surname, String gender) { 
		this.id = id; 
		this.name = name; 
		this.surname = surname; 
		this.gender = gender;  
		studmarks = new HashMap<String, List<Integer> > (); 
	}
	
	public void addStudentMarks (String subject, List<Integer> m) { 
		studmarks.put(subject, m ); 
	}
	
	public Double getAverageSubject(String subject) { 
		Double sum = 0.0;
		Double average; 
		List<Integer> elements = studmarks.get(subject); 
		for (Integer item : elements) 
			sum += item; 
		average = sum / elements.size(); 
		return average;
	}
	
	public Integer getHighestSubjectMark (String subject) { 
		Integer highest = 0; 
		List <Integer> numbers = studmarks.get(subject); 
		for (Integer item : numbers) { 
			if (item > highest) 
				highest = item; 
		}
		return highest; 
	}
	
	public Double getTotalAverage() {
		Double totalsum = 0.0; 
		Double totalavg; 
		for (String subject : studmarks.keySet()) { 
			Double avg = getAverageSubject(subject); 
			totalsum += avg; 
		}
		return totalsum / (studmarks.size()); 
	}
	
	public boolean isPromoted () {
		int failedsubjects = 0; 
		for (String subj : studmarks.keySet()) {
			Double avg = getAverageSubject(subj); 
			if (avg < 18) 
				failedsubjects ++; 
		}
		if (failedsubjects >= 4)
			return false; 
		return true; 
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Map<String, List<Integer>> getStudmarks() {
		return studmarks;
	}

	public void setStudmarks(Map<String, List<Integer>> studmarks) {
		this.studmarks = studmarks;
	}

}
