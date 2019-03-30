package gamesMethod;

import games.GameOne.GameOne;
import games.GameOne.RandomCard;


public class Games 
{
	
	public Games()
	{
		GameOne gameOne = new GameOne();
		RandomCard rc = new RandomCard();
		System.out.println(" " + rc.generateRandomCard());
	}
	
	
	public static void main(String[] args) 
	{
		
		Games games = new Games();
		
	}

}
