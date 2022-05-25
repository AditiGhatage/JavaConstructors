package com.java.FacebookAutomation;

//import java.util.Random;

public class FacebookSignUp 
{
	public void getURL(String strUrl)
	{
		System.out.println("Open Browser: " +strUrl);
	}
	
	public void closeBrowser()
	{
		System.out.println("Close the browser");
	}
	/*private static int length;
	public char[] generatePassword(int i) 
	{
		System.out.println(generatePassword(8));
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int intI = 4; intI< length ; intI++) {
	         password[intI] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	}*/
	
}
