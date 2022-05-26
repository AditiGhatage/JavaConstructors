package com.java.singleton;

public class SingletonExample 
{	

	private static SingletonExample objInstance = new SingletonExample();

	private SingletonExample() 
	{ //Private Constructor

	}

	public static SingletonExample getInstance() 
	{
		return objInstance;
	}

	public void displayMsg() 
	{
		System.out.println("Hello, I am Siri.. !");
	}

}


