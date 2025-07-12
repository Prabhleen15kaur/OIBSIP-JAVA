import java.util.Random;
import java.util.Scanner;

public class guessgame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// Generate a random number between 1 and 100
		int numberToGuess = random.nextInt(100) + 1;
		int userGuess = 0;
		int attempts = 0;

		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("A random number between 1 and 100 have been picked for you. Can you guess it?");
        System.out.println("\ninstructions:");
        System.out.println("1. Just enter the number you think is the answer and then check if the answer is correct or incorrect.");
        System.out.println("2. You can try it as many times as you want.");


		while (userGuess != numberToGuess) {
			System.out.print("\nEnter your guess: ");
          
		
			userGuess = sc.nextInt();
			attempts++;

			if (userGuess < numberToGuess) {
				System.out.println("Too low!!!! Try again.\n");
			} else if (userGuess > numberToGuess) {
				System.out.println("Too high!!!! Try again.\n");
			} else {
				System.out.println("\nCongratulations!!! The number you guessed is right. \nThe number is guessed in " + attempts + " attempts.");
                System.out.println("Well Done!!!");
			}
		}

		sc.close();
	}

}