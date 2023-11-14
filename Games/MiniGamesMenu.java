package Games;

import java.util.Scanner;

public class MiniGamesMenu {

	public static void main(String[] args) {

		int totalWins = 0;

		while (true) {
			Scanner in = new Scanner(System.in);

			if (totalWins != 0) {

				System.out.println("You have won " + totalWins + " times!");

			}

			System.out.println("");

			System.out.println("Main Menu");
			System.out.println("1. Wordle");
			System.out.println("2. Higher or lower");
			System.out.println("3. Quit");

			System.out.print("Enter your choice (1-3): ");
			int choice = in.nextInt();
			in.nextLine();

			if (choice == 1) {

				totalWins = totalWins + Wordle.playWordle();

			} else if (choice == 2) {

				totalWins = totalWins + HOL.playHOL();

			} else if (choice == 3) {

				System.out.println("Goodbye");

			} else {
				System.out.println("Invalid selection");

			}

		} // end Game loop

	}// end main

}// end class