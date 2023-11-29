//H.P.Compton
//This program will be a basic text-based wordle 
package Games;

import java.util.Scanner;

public class Wordle {

	public static int playWordle() {
		Scanner in = new Scanner(System.in); // i dont close because it breaks whole program if i do / in = input

		String guess = "blank";

		int winnerOrError = 0;// this is the var that is updated by wordChecker Method 0 =wrong, 1

		int counter = 0; // this is used to tell what turn player is on

		char[] wordChar; // will hold random word string converted to chars
		char[] guessChar; // will be used to hold guess string as chars

		System.out.println("\u001B[0mWelcome to Wordle"); // the \u001B[0m because it changes the color inputs to make
															// it match rest of text
		System.out.println("------------RULES-----------");
		System.out.println("All words are 5 letters long");
		System.out.println("Green is right letter in right spot");
		System.out.println("Yellow is right letter in wrong spot");
		System.out.println("You will have 6 guesses");
		System.out.println("----------------------------");

		String word = WMethod.ranWord();// gets a random word

		wordChar = word.toCharArray(); // changes word to a char array

		while (winnerOrError != 0 || counter != 6) {

			if (counter == 0) { // first turn

				counter = counter + 1;

				System.out.println("The word has been chosen enter your first guess:");

				System.out.println(word); // used to test

				guess = in.nextLine();
				guess = guess.toLowerCase();

				guessChar = guess.toCharArray();
				winnerOrError = WMethod.wordCheck(guessChar, wordChar);

				if (winnerOrError == 1) { // winner

					break;

				} else if (winnerOrError == 2) { // done if invalid word is entered

					counter = counter - 1;

				}

			} else if (counter <= 4) { // turn 2-5

				System.out.println("Guess " + (counter + 1) + ":");

				counter = counter + 1;

				guess = in.nextLine();
				guess = guess.toLowerCase();

				guessChar = guess.toCharArray();
				winnerOrError = WMethod.wordCheck(guessChar, wordChar);

				if (winnerOrError == 1) { // winner

					break;

				} else if (winnerOrError == 2) { // done if invalid word is entered

					counter = counter - 1;

				}

			} else if (counter == 5) { // last turn

				counter = counter + 1;

				System.out.println("Last guess!");

				guess = in.nextLine();
				guess = guess.toLowerCase();

				guessChar = guess.toCharArray();
				winnerOrError = WMethod.wordCheck(guessChar, wordChar);

				if (winnerOrError == 1) { // winner

					break;

				} else if (winnerOrError == 2) { // done if invalid word is entered

					counter = counter - 1; // undos turn to allow retry with valid word

				}

			}
		}
		if (winnerOrError == 1) { // checking if won

			System.out.println("Congradulations " + word + " was correct");
			return 1;// winner

		} else {

			System.out.println("You ran out of guess the right word was " + word + ".");

		}

		return 0;// loser

	}// end wordle

}// end class