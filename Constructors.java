package com.java.constructors;

public class Constructors 
{
	int intId;
	String strName;
	//Constructor without parameters//default constructor
	 void displayInfo()
	 {
		 System.out.println(+intId+ " " +strName);
	 }
	
	 //Parameterized constructor
	 int intRollNo;
	 String strStudName;
	 void Student(int intI, String strname)
	 {
	 intRollNo = intI;
	 strStudName = strname;
	 }
	
	 void displayInformation()
	 {
		 System.out.println(+intRollNo+ " " +strStudName);
	 }
	 
	 
}
