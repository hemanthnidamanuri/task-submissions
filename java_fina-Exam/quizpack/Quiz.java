/**
 * 
 */
package quizpack;

/**
 * @author hemanth
 *
 */
public interface Quiz
{
	
	// addQuestion adds the question given in the parameter and adds it to the questions array
	void addQuestion(Question q);

	// The quiz begins with the registration of the participant
	// Participant name, age in years, phone number and friend's phone number are the parameters
	// an instance of the participant should be created and returned
	Participant registerParticipant(String name, int age, String phone);

	// getCurrentLevel returns the current level the participant is playing
	// It should return a value between 1 - 15 inclusive
	int getCurrentLevel();

	// getNextQuestion returns the next question for the participant to answer
	// The question object has the question text along with options A B C and D
	Question getNextQuestion();

	// lockAnswer accepts the question object and the participants answer
	// Checks if the answer is correct and returns true.
	// If the answer is incorrect it returns false.
	// It also updates the participant's
	boolean lockAnswer(Question q, String answer);

	// getPrizeMoney returns the current prize money the participant is awarded
	// For example, if he/she answered level 6 then Rs. 20,000 is the prize money.
	int getPrizeMoney();

}