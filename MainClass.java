//Spanish Number Game
//Code by Ethan MacDonald. 10/27/15 - 10/29/15
//Gives the user a numeral and the user inputs the Spanish equivalent. **as of 10/27/15 works with 0-16** All working now! :D 10/29/15

import java.util.*;
public class MainClass {	
static Scanner userInput = new Scanner(System.in);
	
	//Main method.
	public static void main(String[] args) {
		//Begins the game.
		System.out.println("This is a simple game where you input the \nSpanish spelling of the numeral you are given.");
		System.out.println("When you want to stop playing, type 'quit'.");
		System.out.println("===============================================");
		
		int quit = 0;
		int numCorrect = 0;
		int totalNum = 0;
		String usersAnswer;
		//Main game loop.
		while(quit == 0){
			
			//Assigns randomNum its spanishNum.
			String spanishNum = "default";
			int randomNum;
			randomNum = Numbers.generateRandomNum();
			if(randomNum <= 15){
				spanishNum = Numbers.lessThan16(randomNum);
			} else if(randomNum > 15 && randomNum != 100) {
				spanishNum = Numbers.greaterThan15(randomNum);
			} else if (randomNum == 100){
				spanishNum = "ciento";
			} else {
				System.out.println("Somthing went wrong :/");
			}
			
			//Asks the user for the Correct spanishNum, says whether correct or incorrect.
			System.out.print(randomNum + " : "); usersAnswer = userInput.nextLine();
			if(usersAnswer.equals(spanishNum)){
				System.out.println("Correct!");
				numCorrect++;
			} else if(usersAnswer.equals("quit")){
				quit = 1;
				System.out.println("===============================================");
				System.out.println("Thanks for playing!");
				System.out.println("You got " + numCorrect + " correct out of " + totalNum + ".");
			} else {
				System.out.println("Incorrect!");
				System.out.println("The correct answer was: " + spanishNum + "!");
			}
			totalNum++;
		}
		/* //Uncomment for bug fixing.
		System.out.println(spanishNum);
		System.out.println(randomNum);
		*/
	}
}









