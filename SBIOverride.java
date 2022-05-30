package com.java.methodoverriding;

public class SBIOverride extends MethodOverridingExample
{
	public void BankDeposit(int intAmount)
	{
		//use of super keyword
		super.BankDeposit(2000);
		System.out.println("Amount Deposited in SBI is: " +intAmount);
			
	}
	public int BankInterest(int intInterest)
	{
		super.BankInterest(4);
		return intInterest;
	}

}
