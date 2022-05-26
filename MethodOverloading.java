package com.java.constructors;

public class MethodOverloading 
{
	public void employeeNumber(int intNumber)
	{
		System.out.println("Employee Id Number is: "+intNumber);
	}
	
	public void employeeNumber(String strNumber)
	{
		System.out.println("Employee number is:" +strNumber);
	}
	
	public void employeeNumber(long longdigit)
	{
		System.out.println("Employee number :"+longdigit);
	}
	
}
