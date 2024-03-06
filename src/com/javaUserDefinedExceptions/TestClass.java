package com.javaUserDefinedExceptions;

public class TestClass {

	public static void main(String[] args) {
		
		
		try 
		{
			AgeValidation.validatePersonAge(35);
		} 
		catch (AgeProblemException e)
		{
			e.printStackTrace();
		}

	}

}
