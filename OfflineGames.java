package com.java.methodoverriding;

public class OfflineGames extends Games 
{

	public OfflineGames() 
	{
		super.inDoorGames(strChess);
		System.out.println("Offline games are of two types: ");
		super.outDoorGames(strKabaddi);
	}

}
