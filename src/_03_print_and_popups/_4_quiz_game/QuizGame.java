package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("what is 1+1");
		// 2. Ask the user a question
		if (input.equals("2")) {
			// 3. Use an if statement to check if their answer is correct
			score += 1;
			JOptionPane.showMessageDialog(null, "correct");
			// 4. if the user's answer was correct, add one to their score
		} else {
			score -= 1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer
		input = JOptionPane.showInputDialog("what is 2+49");
		if (input.equals("51")) {
		 score+=1;
		}
		// After all the questions have been asked, tell the user their final score

	}
}
