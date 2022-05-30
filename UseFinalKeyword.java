package com.java.methodoverriding;

public class UseFinalKeyword 
{
	final int intlength = 9;
	final int intwidth = 5;
	
	public void display()
	{
		System.out.println("Length of rectangle is: " +intlength);
		System.out.println("Length of rectangle is: " +intwidth);
	}
	final void area()
	{
		int intarea = intlength*intwidth;
		System.out.println("Area of rectangle is: " +intarea);
	}

}
