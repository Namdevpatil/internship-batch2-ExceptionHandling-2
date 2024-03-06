package com.javaUserDefinedExceptions;

public class TestOperationsClass {

	public static void main(String[] args) {
		
		BankOperations bankOperations = new BankOperations();
		
		try 
		{
			bankOperations.withdrawAmount(50000, 60000);
		} 
		catch (InsufficientFundsException e) 
		{
			System.out.println(e.getMessage());
		}

	}

}
