package com.javaprograms;

public class IfElseExample {

	public static void main(String[] args) {
		
		int a,b,c;
		a=10;
		b=20;
		c=30;
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a>c)
		{
			System.out.println("a is greater than C");
		}
		else
		{
			System.out.println("checked all conditions");
		}
		
		if(a<b)
		{
			System.out.println("Inside nested if");
			
			if(a<c)
			{
				System.out.println("A is lesser than c in Nested if");
			}
		}

	}

}
