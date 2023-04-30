package com.javaprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingExample {
	
	//Checked exception happens during your compilation time, in the scenario file IO is the excpetion thrown
		public void OpenFile() throws FileNotFoundException, InterruptedException 
		{
			
			File file = new File("D://NewFile.txt");
			
			FileInputStream ft = new FileInputStream(file);
			
			//This to hold the execution of the code for 5 seconds
			Thread.sleep(5000);
			
			
		}
		
		
		public static void main(String args[]) {
			// This exception where the program stops abrtubtly without running the next set
			// of code (unchecked exception)

			// In try block we give the code which we feeel it might throw an error during
			// running
			try {

				int a = 10;
				int b = 0;

				int c = a / b;
			}

			// We will catch the exception and execute the program further
			catch (Exception MathError) {
				System.out.println(MathError);
			}
			
			//Finally block will be execute even if the Error occurs or not 
			finally
			{
				System.out.println("Finally Code - Executing code even after Exception");
				System.out.println("The line of code after the error");

				int d = 10 + 10;

				System.out.println(d);
			}
			
			
			int e=100;
			int f=11;
			if(e>f)
			{
				throw new ArithmeticException("E is greater than f");

			}
			else
			{
				System.out.println("E is lesster than f");

			}

		}
}
