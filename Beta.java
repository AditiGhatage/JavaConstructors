package com.java.methodoverriding;

public class Beta extends Alpha
{
	private int intyok = 98;
	public void input()
	{
		System.out.println("The new number is: "+intyok);
		super.input();
	}
	public void output()
	{
		System.out.println("This is child class");
		super.output();
	}

}
