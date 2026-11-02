package games;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int secretNumber = random.nextInt(100) + 1;
		
		System.out.println(" --NUMBER GUESSING GAME-- ");
		System.out.println("Guess a number between 1 and 100");
		
		System.out.print("Enter your guess: ");
		
		int guess = input.nextInt();
		int attemps = 1;
		
		while (guess != secretNumber)
		{
			if (guess > secretNumber)
			{
				System.out.println("Guess too high");
			}
		
			else if (guess < secretNumber)
			{
				System.out.println("Guess too low");
			}
			
			attemps++;
			System.out.println("Enter your next guess: ");
			guess = input.nextInt();
			
		}
		
		System.out.println("Correct!");
		System.out.println("You guessed the number in " + attemps + " attemps.");
		
		input.close();
	}
}