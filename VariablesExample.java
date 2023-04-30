package com.javaprograms;

public class VariablesExample {
	
	int a=11;
	
	public void print()
	{
		int a=15;
		System.out.println("this is print function");
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		int a=20;
		// TODO Auto-generated method stub
		VariablesExample obj1= new VariablesExample();
		
		obj1.print();
		System.out.println(obj1.a);
		

	}

}
