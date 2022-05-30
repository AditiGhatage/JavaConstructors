package com.java.methodoverriding;
// super is used to refer immediate parent class instance variable

public class Engineering 
{
	String strDepartment = "Computer";
	String strDept = "Chemical";

}

class Department extends Engineering
{
	String strDepartment = "Mechanical";
	String strDept = "Civil";
	
	public void printDept()
	{
		System.out.println("My Department is: "+strDepartment);
		System.out.println("Another Department is: " +super.strDepartment);
		System.out.println("Third Dept is: "+strDept);
		System.out.println("Fourth Dept is: "+super.strDept);
	}
}
