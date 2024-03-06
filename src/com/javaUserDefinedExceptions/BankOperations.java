package com.javaUserDefinedExceptions;

public class BankOperations
{
	
	public void withdrawAmount(double balanceAmount, double withdrawingAmount)throws InsufficientFundsException
	{
		if(withdrawingAmount > balanceAmount)
		{
			throw new InsufficientFundsException("Insufficient Funds in your account.");
		}
		else
		{
			System.out.println(withdrawingAmount+" amount withdrawn from account is successfull.");
		}
	}

}
