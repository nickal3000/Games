//H.P.Compton
//This is the main menu for for the game
package Games;

import java.util.Scanner;

public class MenuWordle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);// i don't close in any of the classes because it breaks everything when i
											// do

		int totalWins = 0;

		while (true) {

			if (totalWins != 0) { // only prints when wins <0

				System.out.println("You have won " + totalWins + " times!");

			}

			System.out.println("╔════════════════════════╗");
			System.out.println("║        Main Menu       ║");
			System.out.println("║        1. Wordle       ║");
			System.out.println("║        2. Higher Lower ║");
			System.out.println("║        3. Quit         ║");
			System.out.println("╚════════════════════════╝");

			System.out.print("\u001B[0mEnter your choice: "); // the \u001B[0m because it changes the color in to make
																// it match rest of text

			int choice = in.nextInt();
			in.nextLine();

			if (choice == 1) {

				totalWins = totalWins + Wordle.playWordle();// starts wordle

			} else if (choice == 2) {

				totalWins = totalWins + HOL.playHOL(); // end

			} else if (choice == 3) {

				System.out.println("Goodbye"); // end
				break;

			} else {
				System.out.println("Invalid selection");// let you redo

			}

		} // end Game loop

	}// end main

}// end class