import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {

		while (true) {
			// Get user input.
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your move. Type in rock, paper or scissors: ");
			String myMove = in.nextLine();
			String computerMove = "";

			// Enter quit to break loop and end game
			if (myMove.equals("quit")) {
				System.out.println("Thanks for playing!");
				break;
			}
			// Makes sure input is valid
			else if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
				System.out.println("Not a valid move. Please type rock, paper or scissors");
			}else {

				// Generate random move from computer (0, 1, 2)
				int random = (int) (Math.random() * 3);

				if (random == 0) {
					computerMove = "rock";
				} else if (random == 1) {
					computerMove = "paper";
				} else {
					computerMove = "scissors";
				}
				// Print out player and computer moves.
				System.out.println("\nYour move: " + myMove);
				System.out.println("Computer move: " + computerMove);
			}
			// Checking for the games outcome. 
			if (myMove.equals(computerMove)) {
				System.out.println("It's a tie!");
			} else if ((myMove.equals("rock") && computerMove.equals("scissors"))
					|| (myMove.equals("scissors") && computerMove.equals("paper"))
					|| (myMove.equals("paper") && computerMove.equals("rock"))) {
				System.out.println("You won!");
			} else {
				System.out.println("You lost!");
			}
		}
	}

}
