package com.java.singleton;

public class TestSingletonExample 
{

	public static void main(String[] args) 
	{
			SingletonExample objSingletonExample = SingletonExample.getInstance();

			objSingletonExample.displayMsg();
			//objSingletonExample.getInstance();
	}

}


