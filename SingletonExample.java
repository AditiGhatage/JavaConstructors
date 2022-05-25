package com.java.singleton;

public class SingletonExample 
{	

	private static SingletonExample objInstance = new SingletonExample();

	SingletonExample() 
	{ //Private Constructor

	}

	public SingletonExample getInstance() 
	{
		if(objInstance == null) 
		{
			objInstance = new SingletonExample();
		}
		return objInstance;
	}

	public void displayMsg() 
	{
		System.out.println("Hello, I am Siri.. !");
	}

}


