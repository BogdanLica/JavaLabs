public class GuessingGame
{
	public static void main(String[] args)
	{
		
		Integer numberToGuess = new Integer(0);
		Integer guessedNumber = new Integer(0);
		Toolbox myToolbox = new Toolbox();
		
		System.out.println("Let's start the game");
		guessedNumber = myToolbox.readIntegerFromCmd();
		numberToGuess = myToolbox.getRandomInteger(10);
		// Return a random number between 1 and 10
		//System.out.println(numberToGuess);
		

		if(numberToGuess.equals(guessedNumber))
		{
			System.out.println("That was the number");
		}
		else
		{
			System.out.println("Try next time");
			if(numberToGuess.compareTo(guessedNumber) < 0) 
			{// check if numberToGuess < guessedNumber

				System.out.println("THe guessed number was too high");
			}
			else
			{// check if numberToGuess > guessedNumber

				System.out.println("THe guessed number was too low");
			}
		}
	}
}

