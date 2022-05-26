package com.java.FacebookAutomation;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Utility
{
	Random randomname = new Random();

	public String showFName() 
	{
		String strFName[] = {"Aditi","Raghav","Rohan","Rina","Sangita","Aishwarya","Santosh","Sangram","Shivani"};
		System.out.println("First Name is :" +strFName[new Random().nextInt(strFName.length)]);
		return null;
	}	
	public String showLName()
	{
		String strLName[] = {"Ghatage","Patil","Done","Jadhav","Desai","Sawant","Kulkarni","Deshpande","Deshmukh"};
		System.out.println("Last Name is :" +strLName[new Random().nextInt(strLName.length)]);
		return null;		
	}
	
	public String gender(String gender)
	{
	if(Math.random() > 0.5) gender  = "MALE";
	else gender = "FEMALE";
	return (gender);
	}
	
	public void showGender()
	{
		String strGender[]= {"Female", "Male", "Custom"};
		System.out.println("Gender is: "+strGender[randomname.nextInt(strGender.length)]);
	}
	
	
	public String showMobileNumber(String strMobileNumber) 
	{
		Random rd=new Random();
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
		return strMobileNumber = str[7]+str[1]+str[0]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9];
	}
	
	public void setPassword() {
		String strPassword = "AbcRt345";
		System.out.println("Password is :" +strPassword);
	}	
	
	public void phoneNumber()
	{
		Random generator = new Random();
		int num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
        /*num1 = generator.nextInt(6) + 2;
        num2 = generator.nextInt(999) - 2 ; //must form an even number between 000-
        num3 = generator.nextInt(6000); //must be between 0000-5999*/
        num0 = 9;
        num1 = 1;
        num2 = generator.nextInt(5) + 5;
        num3 = generator.nextInt(9) + 10;
        num4 = generator.nextInt(10);
        num5 = generator.nextInt(5) + 11;
        num6 = generator.nextInt(10);
        num7 = generator.nextInt(3);
        num8 = generator.nextInt(5);
        num9 = generator.nextInt(10);
        System.out.print("Mobile Number: ");
        System.out.print(num0);
        System.out.print(num1);
        System.out.print("-" + num2);
        System.out.print(num3);
        System.out.print(num4);
        System.out.print(num5);
        System.out.print(num6);
        System.out.print(num7);
        System.out.print(num8);
        System.out.print(num9);
        
	}

	    public LocalDate randomBday() 
	    {
	        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
	
	    }
	
	     
}
