package model;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(1872235,"Ramai","Alejandria","M") ;
		Student s2 = new Student(1894803,"Jude Joy","Kallarakal","M") ;
		Student s3 = new Student(1904918,"Nathaniele","Tomines","M") ;
		Student s4 = new Student(1892314,"Beatrice","Borsa","F") ;
		Student s5 = new Student(1925213,"Francesca","Mencarini","F") ;
		
		s1.addStudentMarks("Combinatorics", Arrays.asList(30,30,29,30));
		s1.addStudentMarks("Programming Fundamentals", Arrays.asList(32,32,34,32));
		s1.addStudentMarks("Object Oriented Programming", Arrays.asList(30,30,30,30));
		s1.addStudentMarks("Algorithms 1", Arrays.asList(30,30,29,30));
		s1.addStudentMarks("Comp Architecture 1", Arrays.asList(30,29,28,30));
		s1.addStudentMarks("Comp Architecture 2", Arrays.asList(29,30,30,30));
		s1.addStudentMarks("Calculus 1", Arrays.asList(30,30,30,30,29));
		s1.addStudentMarks("Calculus 2", Arrays.asList(30,30,30,30,29));
		
		s2.addStudentMarks("Combinatorics", Arrays.asList(18,20,29,30));
		s2.addStudentMarks("Programming Fundamentals", Arrays.asList(25,28,26,30));
		s2.addStudentMarks("Object Oriented Programming", Arrays.asList(22,24,20,23));
		s2.addStudentMarks("Algorithms 1", Arrays.asList(18,20,25,23));
		s2.addStudentMarks("Comp Architecture 1", Arrays.asList(30,29,28,30));
		s2.addStudentMarks("Comp Architecture 2", Arrays.asList(20,18,23,24));
		s2.addStudentMarks("Calculus 1", Arrays.asList(18,18,20,30,20));
		s2.addStudentMarks("Calculus 2", Arrays.asList(25,27,23,24,21));
		
		s3.addStudentMarks("Combinatorics", Arrays.asList(24,23,18,18));
		s3.addStudentMarks("Programming Fundamentals", Arrays.asList(30,30,28,25));
		s3.addStudentMarks("Object Oriented Programming", Arrays.asList(29,28,27,28));
		s3.addStudentMarks("Algorithms 1", Arrays.asList(19,18,20,22));
		s3.addStudentMarks("Comp Architecture 1", Arrays.asList(28,29,30,30));
		s3.addStudentMarks("Comp Architecture 2", Arrays.asList(23,28,25,30));
		s3.addStudentMarks("Calculus 1", Arrays.asList(30,30,29,18,10));
		s3.addStudentMarks("Calculus 2", Arrays.asList(30,28,25,30,28));
		
		s4.addStudentMarks("Combinatorics", Arrays.asList(27,26,25,24));
		s4.addStudentMarks("Programming Fundamentals", Arrays.asList(28,29,30,22));
		s4.addStudentMarks("Object Oriented Programming", Arrays.asList(10,8,3,30));
		s4.addStudentMarks("Algorithms 1", Arrays.asList(22,21,19,18));
		s4.addStudentMarks("Comp Architecture 1", Arrays.asList(28,30,29,24));
		s4.addStudentMarks("Comp Architecture 2", Arrays.asList(27,25,24,23));
		s4.addStudentMarks("Calculus 1", Arrays.asList(25,25,24,31,30));
		s4.addStudentMarks("Calculus 2", Arrays.asList(30,30,20,20,29));
		
		s5.addStudentMarks("Combinatorics", Arrays.asList(0,18,10,3));
		s5.addStudentMarks("Programming Fundamentals", Arrays.asList(0,11,15,13));
		s5.addStudentMarks("Object Oriented Programming", Arrays.asList(10,8,13,4));
		s5.addStudentMarks("Algorithms 1", Arrays.asList(10,13,24,0));
		s5.addStudentMarks("Comp Architecture 1", Arrays.asList(10,19,8,30));
		s5.addStudentMarks("Comp Architecture 2", Arrays.asList(4,5,12,10));
		s5.addStudentMarks("Calculus 1", Arrays.asList(10,20,20,10,29));
		s5.addStudentMarks("Calculus 2", Arrays.asList(0,0,14,15,16)); 
		
		School sch1 = new School (Arrays.asList(s1,s2,s3,s4,s5)); 
	//	System.out.println(sch1.getPromotedStudents()); 
		System.out.println(sch1.getStudentsInfo());
		sch1.saveStudentsInfo();
	//	System.out.println(s1.getAverageSubject("Calculus 1"));


	}

}
