package com.javaExceptionPropagation;

public class Example1 {
	
	public static void getMethod3()throws Exception
	{
		throw new Exception("Exception is occurred in getMethod3()");
	}
	
	public static void getMethod2()throws Exception
	{
		Example1.getMethod3();
	}
	
	public static void getMethod1()throws Exception
	{
		Example1.getMethod2();
	}

	public static void main(String[] args) 
	{
		
		try 
		{
			Example1.getMethod1();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
