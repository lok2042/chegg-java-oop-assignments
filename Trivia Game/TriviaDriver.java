import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {

	public final static int NUMQUESTIONS = 5;
	
	public static void main(String[] args) {
		playGame();
	}
	
	public static void playGame() {
		Scanner playGameInput = new Scanner(System.in);
		TriviaGame game = new TriviaGame(populateQuestions());
		int countGameRound = 1, scoreSum = 0;
		
		boolean hasNextQuestion = true;
		while(hasNextQuestion) {
			hasNextQuestion = game.askNextQuestion();
			
			if(hasNextQuestion)
				game.showScore();
		}
		scoreSum += game.getScore();
		
		String yesOrNo;
		boolean playAgain = true;
		
		do {
			System.out.println("Game over! Would you like to play again?");
			System.out.print("(Yes/No) : ");
			yesOrNo = playGameInput.next().toLowerCase();
			System.out.println();
			
			if(yesOrNo.equals("yes")) {
				game.restart();
				countGameRound++;
				
				hasNextQuestion = true;
				while(hasNextQuestion) {
					hasNextQuestion = game.askNextQuestion();
					
					if(hasNextQuestion)
						game.showScore();
				}
				scoreSum += game.getScore();
			}
			else {
				playAgain = false;
			}
			
		} while(playAgain);
		
		System.out.println("You played " + countGameRound + " games and your avarage score was");
		System.out.println((double) scoreSum / countGameRound + ". Thank you for playing, have a great day!");
		
		playGameInput.close();
	}
	
	public static TriviaQuestion [] populateQuestions() {
		TriviaQuestion [] questions = new TriviaQuestion[NUMQUESTIONS];
		
		try {
        	File fileObj = new File("TriviaSampleQuestions.txt");
			Scanner fileReader = new Scanner(fileObj);
			
			String question, answer;
			int point;
			for(int i = 0; i < questions.length; i++) {
				question = fileReader.nextLine();
				answer = fileReader.nextLine();
				point = Integer.parseInt(fileReader.nextLine());

				questions[i] = new TriviaQuestion(question, answer, point);
			}
			

			fileReader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}

		return questions;
	}
	
}
