package Games;

import java.util.Random;
import java.util.Scanner;

public class HOL {

	public static int playHOL() {

		Scanner in = new Scanner(System.in);
		Random random = new Random();

		int upper = -1;
		int dif; // Difficulty

		System.out.println("");
		System.out.println("Welcome to higher or lower would you like to play");

		System.out.println("1: Easy mode (1-25)");
		System.out.println("2: Medium mode (1-50)");
		System.out.println("3: Hard mode (1-100)");

		do {

			dif = in.nextInt();

			if (dif == 1) {
				upper = 25;
			} else if (dif == 2) {
				upper = 50;
			} else if (dif == 3) {
				upper = 100;
			} else {
				System.out.println("The number you entered is not valid");
			}
		} while (upper == -1);

		System.out.println("I've picked a random number between 1 and " + upper + ".");
		System.out.println("Try to guess it.");

		int number = random.nextInt(upper);
		int tries = 0;
		int guess = 0;

		do {
			tries = tries + 1;

			System.out.print("Enter your guess: ");
			guess = in.nextInt();

			if (guess < 1 || guess > 100) {

				System.out.println("Your guess is out of bounds");

			} else if (guess < number) {

				System.out.println("Higher. Try again.");

			} else if (guess > number) {

				System.out.println("Lower. Try again.");

			} else {

				System.out.println("You are correct you guessed it in " + tries + " tries");

				return 1;

			}

		} while (tries != 10);

		if (tries == 10) {
			System.out.println("Sorry you ran out of guesses. The number was " + number);
		}
		return 0;

	}// end HOL

}
