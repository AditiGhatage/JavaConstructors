package com.java.FacebookAutomation;

public class TestFacebookSignUp {

	public static void main(String[] args) 
	{
		FacebookSignUp objutility = new FacebookSignUp();
		objutility.getURL("https://www.facebook.com/");	
		objutility.showFName();
		objutility.showLName();		
		//objutility.showMobileNumber();
		objutility.showGender();
		objutility.genderDisplay();
		objutility.randomBirthday();
		objutility.setPassword();
		objutility.setRandomNumber();
		objutility.getDateTime();
		objutility.closeBrowser();
		//objutility.randomDate(null, null);
		objutility.setCurrentDate();
		objutility.DateTime();
		
		
	}
}
