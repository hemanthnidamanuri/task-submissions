/**
 * 
 */
package quizpack;

/**
 * @author hemanth
 *
 */
public class Question {

	String question,correctanswer;
	int level;
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question(String question,int level,String correctanswer) {
		// TODO Auto-generated constructor stub
		this.question = question;
		this.level = level;
		this.correctanswer = correctanswer;
	}
}
