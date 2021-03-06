//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		stop = 0;
		upperBound = 0;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Guessing Game - how many numbers? ");
		int upperBound = keyboard.nextInt();
		int number = (int) (Math.random() * (upperBound)) + 1;
		out.print("Enter a number between 1 and " + upperBound);
		int guess = keyboard.nextInt();
		int counter = 1;
		
		while (guess != number)
		{
			out.print("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			counter = counter+1;
			if (guess == number)
			{
				out.print("It took " + counter + " guesses to guess " + number+ "\n" + "You guessed wrong " + (((counter-1)*100)/counter) + " percent of the time" + "\n\nDo you want to play again?");
				String playagain = keyboard.next();
				if(playagain == "y")
				{
					playGame();
				}
				if(playagain == "n")
				{
					exit(1);
				}
			}
			
			if (guess > upperBound||guess <1)
			{
				out.print("Number out of range\n");
			}
		}
		

	}

	public String toString()
	{
		playGame();
		String output="";
		return output;
	}
}