import java.util.Arrays;
import java.util.Scanner;

public class TriviaGame {
	
	private Scanner askQuestionInput = new Scanner(System.in);
	private TriviaQuestion [] questions;
	private int score;
	private int questionNum;
	
	public TriviaGame(TriviaQuestion [] questions) {
		this.questions = Arrays.copyOf(questions, questions.length);
		this.score = 0;
		this.questionNum = 0;
	}
	
	public boolean askNextQuestion() {
		if(questionNum == questions.length) {
			return false;
		}
		else {
			System.out.println("Question " + (questionNum + 1));
			System.out.println("For " + questions[questionNum].getValue() + " points... " + questions[questionNum].getQuestion());
			String ans = askQuestionInput.nextLine().toLowerCase();
			
			if(ans.equals(questions[questionNum].getAnswer())) {
				System.out.println("That is correct!");
				this.score += questions[questionNum].getValue();
			}
			else {
				System.out.println("Wrong. The correct answer is " + questions[questionNum].getAnswer());
			}
			
			questionNum++;
			return true;
		}
	}
	
	public void showScore() {
		System.out.println("Your score is " + score + "\n");
	}
	
	public void restart() {
		System.out.println("Game has been restarted\n");
		questionNum = 0;
		score = 0;
	}
	
	public int getScore() {
		return score;
	}
	
}
