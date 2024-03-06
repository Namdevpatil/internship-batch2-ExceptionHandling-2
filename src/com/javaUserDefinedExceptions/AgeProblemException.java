package com.javaUserDefinedExceptions;

public class AgeProblemException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	public AgeProblemException(String exceptinName) 
	{
		super(exceptinName);
	}
	
}
