package com.java.methodoverriding;
// Use of super with constructors
public class Games 
{
	/*void inDoorGames()
	{
		System.out.println("Indoor games can be different types.");
	}*/
	
	String strChess= "Chess";
	void inDoorGames(String strGames)
	{
		strGames = strChess;
		System.out.println("Indoor game is : "+strGames);
	}
	
	void outDoorGames()
	{
		System.out.println("Outdoor games are good for health.");
	}
	
	String strKabaddi="Kabaddi";
	void outDoorGames(String strOutDoor)
	{
		strOutDoor = strKabaddi;
		System.out.println("Outdoor game is : "+strOutDoor);
	}
}
 