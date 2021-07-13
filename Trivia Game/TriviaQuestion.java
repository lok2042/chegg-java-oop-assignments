package practiceProblems;

public class TriviaQuestion {
	
	private String question;
	private String answer;
	private int value;
	
	public TriviaQuestion(String question, String answer, int value) {
		this.question = question;
		this.answer = answer;
		this.value = value;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
