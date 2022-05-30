package com.java.FacebookAutomation;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
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
	if(Math.random() > 1) gender  = "MALE";
	else gender = "FEMALE";
	return (gender);
	}
	
	public void showGender()
	{
		String strGender[]= {"Female", "Male", "Custom"};
		System.out.println("Gender is: "+strGender[randomname.nextInt(strGender.length)]);
	}
	
	
	/*public String showMobileNumber(String strMobileNumber) 
	{
		Random rd=new Random();
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
		return strMobileNumber = str[7]+str[1]+str[0]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9];
	}*/
	
	public void setPassword() {
		String strPassword = "AbcRt345";
		System.out.println("Password is :" +strPassword);
	}	
	

    public LocalDate randomBdate() 
    {
        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
	}
	    
	    //Random Mobile number
    public static String getRandomMobile(int intLength)
    {
    	String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
			
			int intNum= (int) Math.floor(Math.random()*allowChars.length());
			randomString+=allowChars.substring(intNum, intNum+1);
		}
		
		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};
		
		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		
		return strRandomDigit+randomString;
    }
    
	public String getDateTime()
	{
		String strDate = new SimpleDateFormat("E dd/mm/yyyy 'at' HH:mm:ss a zzz").format(Calendar.getInstance().getTime());
		System.out.println("Date and time : "+strDate);
		return strDate;
	}
	//mm/dd/yyyy format date
	public String getCurrentDate()
	{
		Date objDate = new Date();
		SimpleDateFormat objsimple = new SimpleDateFormat();
		String strCurrentDate = objsimple.format(objDate);
		//System.out.println("Date: "+strCurrentDate);
		return strCurrentDate;
	}
	
	public String DateFormat()
	{
		Date objDateT = new Date();
		SimpleDateFormat objsimpledate = new SimpleDateFormat("dd/MM/yyyy mm:HH:ss zzz");
		String strCurrentDate = objsimpledate.format(objDateT);
		//String strDate = objsimpledate.format(objDateT);
		return strCurrentDate;
	}
	
	public void DateTime()
	{
		Date objdate = new Date();
		SimpleDateFormat objDateText = new SimpleDateFormat("yyyy/MM/dd zzz");
		String strDate = objDateText.format(objdate);
		System.out.println("Date in format (yyyy/MM/dd): " +strDate);
	}
	
	
}
