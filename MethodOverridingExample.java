package com.java.methodoverriding;


public class MethodOverridingExample 
{
	public void BankDeposit(int intAmount)
	{
		System.out.println("Amount deposited: " +intAmount);
	}
	public int BankInterest(int intInterest)
	{
		System.out.println("Bank Interest: " +intInterest);
		return (intInterest);
	}
	

}
