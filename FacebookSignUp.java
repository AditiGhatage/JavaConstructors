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
		System.out.print("\nClose the browser");
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
		System.out.println("Birthdate is: " +randomBday());
	}
	
}
