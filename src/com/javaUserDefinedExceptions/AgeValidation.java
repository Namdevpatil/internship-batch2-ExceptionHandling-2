package com.javaUserDefinedExceptions;

public class AgeValidation 
{
	
	//method
	public static void validatePersonAge(int personAge)throws AgeProblemException
	{
		if(personAge >= 18)
		{
			System.out.println("the person is able to cast the vote.");
		}
		else
		{
			throw new AgeProblemException("person is not have suffient age to cast the vote.");
		}
	}

}
