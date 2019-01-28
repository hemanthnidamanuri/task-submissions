/**
 * 
 */
package quizpack;

import java.util.ArrayList;

/**
 * @author hemanth
 *
 */
public class WriteQuiz implements Quiz{
	
	int count,level,score;
	String participant;
	Question[] qs;
	String question;
	
	@Override
	public void addQuestion(Question q) {
		// TODO Auto-generated method stub
		qs = new Question[2];
		for (int i = 0; i < qs.length; i++) {
			qs[i] = new Question(q.question, q.level, q.correctanswer);
		}
	}

	@Override
	public Participant registerParticipant(String name, int age, String phone) {
		ArrayList<Participant> lis = new ArrayList<>();
		Participant part = null;
		return part.name;
		
	}

	@Override
	public int getCurrentLevel() {
		// TODO Auto-generated method stub
		
		Question q = new Question();
		return q.level;
	}

	@Override
	public Question getNextQuestion()throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		int i = 0;
		i++;
		return qs[i];
		
		
	}

	@Override
	public boolean lockAnswer(Question q, String answer) {
		// TODO Auto-generated method stub
		if (q.correctanswer.equalsIgnoreCase(answer)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int getPrizeMoney() {
		// TODO Auto-generated method stub
		Question q = null;
		if (q.level==1) {
			return 1000;
		}else if(q.level==2){
			return 2000;
		}else {
			return 10000;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.question;
	}

}
