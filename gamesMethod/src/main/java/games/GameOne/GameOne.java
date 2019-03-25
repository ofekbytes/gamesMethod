package games.GameOne;

import java.util.ArrayList;
import java.util.Random;

public class GameOne implements ICard
{

//	private int playOne = 0;
//	private int playTwo = 0;	
	
	//constructor
	public GameOne() 
	{
//		generateRandomcard();
		
		for(int i=0; i<6; i++)
		CardRandomTest();
	}
	
	public String generateRandomcard()
	{
		
		int intRandomNumber= 0;
		String stReturn = "";
	//	intMaxNumber ++;
		
		intRandomNumber = (int) (Math.random()* intMaxNumber);
		System.out.println(intRandomNumber);
//		System.out.println("\nRandom number is (0-" + intMaxNumber + " == " + intRandomNumber);
//		switch(intMaxNumber)
		
		return stReturn;
	}
	
	
	public void CardRandomTest()
	{
		Random random = new Random();
		int max=42, min=1;
		
		
		int randomNumber = random.nextInt(max + 1 - min) + min;
		
//		System.out.println("Random number is: " + randomNumber);
		System.out.print(" ," + randomNumber);
		
		
	}
	
	/**
	 * cardTest()
	 */
	public void CardTest()
	{
		System.out.println("cards are ");
		System.out.println(" " + p + " , " + q + " , " + k + " , " + a );
		
		if (a > q)
			System.out.println(	"a > q == " +  (a > q) 
							+ "  p  > q == " + (p > q) 
							+ " a > 14 == " + (a > 14) 
							+ " a = 14 == " + (a == 14)
							);		
	}

	
	
}
