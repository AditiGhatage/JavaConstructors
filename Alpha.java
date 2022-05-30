package com.java.methodoverriding;
// super keyword used to invoke immediate parent class method
public class Alpha 
{
	private int intextra = 34;
	
	public void input()
	{
		System.out.println("The number is : "+intextra);
	}
	public void output()
	{
		System.out.println("This is overriding method. ");
	}
}
