package com.java.FacebookAutomation;

public class TestFacebookSignUp {

	public static void main(String[] args) 
	{
		Utility objutility = new Utility();
		objutility.getURL("https://www.facebook.com/");
		objutility.showFName();
		objutility.showLName();
		objutility.showMobileNumber();
		objutility.setPassword();	
		objutility.closeBrowser();
		//objutility.generatePassword(1);
	}
}
