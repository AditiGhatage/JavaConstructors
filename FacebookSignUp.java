package com.java.FacebookAutomation;
//import java.util.Random;

public class FacebookSignUp extends Utility
{
	public void getURL(String strUrl)
	{
		System.out.println("Open Browser: " +strUrl);
	}	
	public void closeBrowser()
	{
		System.out.println("Close the browser");
	}	
	
	/*public void showMobileNumber() {
		System.out.println("Mobile number :" +showMobileNumber(null));
	
	}*/
	
	public void genderDisplay()
	{
		System.out.println("Gender: "+gender(null));
	}
	
	public void randomBirthday()
	{
		System.out.println("Birthdate is: " +randomBdate());
	}
	
	public void setRandomNumber() {
		
		System.out.println("Random Number : "+getRandomMobile(8));
	}
	public void setCurrentDate()
	{
		System.out.println("Current Date and Time(mm/dd/yyyy): " +getCurrentDate());
		System.out.println("Current Date and Time(dd/mm/yyyy): " +DateFormat());
		
	}
	
}
