/**
 * 
 */
package quizpack;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class ClassMain {

	/**
	 * @param args
	 * 
	 * Register a participant

	Displays the Question
	
	Take user input  the option string A, B, C, D  
	
	If input is correct answer increment the level of the player and set prize money for regarding level. 
	
	If he/she reaches to level 15 Display “You Won the Quiz and Highest Price money”
	
	
	If input is wrong answer and he below the level 5 display “Sorry you lost the Quiz”
	
	If the level is above 5 and below 10 set prize money to 10000
	
	If the level is above 10 set prize money to 320000
	
	
	If the user input is “quit” should display the  participant name “choose to quit” and display price money.


	 */

	static HashMap<Integer, Integer> score; // to hold levels and prize money
	WriteQuiz wq;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz quiz = new WriteQuiz();

		/* hard coding the questoins */
		quiz.addQuestion(new Question(
				"Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks",
				1, "B"));
		quiz.addQuestion(new Question("who inventedtelephone*A.grahambell*B.hemanth*c.langley.*D.none", 2, "A"));
		quiz.addQuestion(
				new Question("who invented c programming*A.grahambell*B.Dennisritche*c.langley.*D.none", 3, "B"));

		quiz.registerParticipant("hemanth", 24, "96037");
		quiz.registerParticipant("hema", 23, "99767");

		displayQuestion(quiz);

	}

	private static void displayQuestion(Quiz quiz) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		score = new HashMap<>();
		System.out.println("for quit please enter quit");
		System.out.println("Enter choice");
		String choice = in.nextLine();
		if (choice.equalsIgnoreCase("question")) {
			System.out.println("Question");
			System.out.println(quiz.getNextQuestion());
			System.out.println("choose correct option");
			String choose = in.nextLine();
			boolean result = quiz.lockAnswer(quiz.getNextQuestion(), choose);
			if (result == true) {
				int level = quiz.getCurrentLevel();
				score.put(level++, quiz.getPrizeMoney());
			} else if (result == false) {
				for (Entry<Integer, Integer> itr : score.entrySet()) {
					if (itr.getKey() < 5) {
						System.out.println("Sorry you lost the Quiz");
					} else if (itr.getKey() > 5 && itr.getKey() < 10) {
						score.put(itr.getKey(), 10000);
					} else if (itr.getKey() > 10) {
						score.put(itr.getKey(), 32000);
					}
				}
			}
		}else if(choice.equalsIgnoreCase("quit")) {
			Participant part = null;
			System.out.println(part.name+","+quiz.getPrizeMoney());
		}

		in.close();
	}
}
