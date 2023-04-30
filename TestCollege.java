package com.javaprograms;

public class TestCollege {
	
	public static void main(String args[]) { 
		System.out.println(InterfaceCollege.CollegeName); 
		//Here wer create an object for an interface with respect to CSE implmeente class 
		InterfaceCollege cse = new InterfaceExampleComputerScience();
		cse.studentDetails(); 
		cse.StudentResults(); 
		InterfaceCollege ece = new InterfaceExampleECE();
		ece.studentDetails();
		ece.StudentResults(); }
	}


