package com.javaprograms;

public class ArrayExample {
	
	public static void main(String args[])
	{
		//Normal variable declarition

		int a = 10;
		
		//Array creation
		int array1[];
		
		array1 = new int[5];
		
		//Syntax 2
		
		int array2[] = new int[5];
		
		
		//Syntax 3
		
		int []array3;
		
		array3 = new int [10];
		
		//Syntax 4
		
		int array4[] = {10,20,30,40,50};
		
		System.out.println("The size of Array 4 is ->" +array4.length);
		
		System.out.println("The first element of Array 4 is ->" +array4[0]);
		
		//The negatvie scenario
		//System.out.println("The first element of Array 4 is ->" +array4[5]);
		
		
		System.out.println("The size of Array 2 is->" +array2.length);
		
		
		//Enhanced For loop
		
				String TeamIndia[] = {"Dhoni", "Kohli","Yuvraj","Kaif"};
				
				for(String Name:TeamIndia)
				{
					System.out.println(Name);
				}
		
	}
	

}
