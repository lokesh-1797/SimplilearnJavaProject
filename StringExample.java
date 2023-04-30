package com.javaprograms;

public class StringExample {
	
	public static void main(String args[])
	{
		
		String MyBatch = "My Batch Members are Brilliant";
		
		String Grade = "And Graded A";
		
		//CharAt method is used to get the exact character from the index location
		System.out.println(MyBatch.charAt(5));
		
		//This will convert my string into uppercase
		System.out.println(MyBatch.toUpperCase());
		
		//To lower
		System.out.println(MyBatch.toLowerCase());
		
		//We use contains method to check if a word is contained or present in a string
		
		System.out.println(MyBatch.contains("Dhoni"));
		
System.out.println(MyBatch.contains("ARE"));
		
		//To added two strings
		String JoinedString = MyBatch.concat(Grade);
		
		System.out.println(JoinedString);
		
		//To get the length of the string
		System.out.println(MyBatch.length());
		
		String Student1 = "malar";
		String Student2 = "Malar";
		
		if(Student1.equalsIgnoreCase(Student2))
		{
			System.out.println("Student Names are equal");
		}
		
		else
		{
			System.out.println("Student names are not equal");
	
		
		
	}

}
}
