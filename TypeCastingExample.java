package com.javaprograms;

public class TypeCastingExample {
	
	public static void main(String args[])
	{
		
		int a = 10;
		
		//Widening - Casting Down
		
		long b = a;
		
		System.out.println(b);
		
		float c = b;
		
		System.out.println(c);
		
		//Up casting - Narrowing
		
		double d  = 100.60;
		
		int x = (int)d;
		
		System.out.println(x);
		
	}

}
