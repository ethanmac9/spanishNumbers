//Spanish Number Game v1.2.1
//Code by Ethan MacDonald on 4/27/16 . 4/28/16 . 4/29/16 . 5/1/16 . 5/16/16
//Checks a users spelling of a randomly generated Spanish number against proper spelling.
//Eventually I'd like it to be able to look up a spelling based a user input. 

package spanishSpelling;
import java.util.*;
public class MainClass2 {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean run = true;
		int numCorrect = 0;
		int numWrong= 0;
		int total= 0;
		String rawInput = "default";
		
		//Prints some info at the beginning
		System.out.println("Welcome to Spanish Number by Ethan! (v1.2.1 working 0-999)");
		System.out.println("You will be given a number, then you write the spanish.");
		System.out.println("(Type exit or quit when you are finished)\n(You can type update to get an update on your progress)");
		System.out.println("==========================================");
		
		//Main loop
		do{
			int randomNum = generateRandomNum();
			System.out.print(randomNum + " : ");
			rawInput = userInput.nextLine();
			String input = rawInput.toLowerCase();
			String text = numToText(randomNum);
			//System.out.println(text); // for testing
			
			if(input.equals(text)){
				System.out.println("Correct!");
				numCorrect++;
			}
			else if(input.equals("quit") || input.equals("exit")){
				System.out.println("==========================================");
				System.out.println("\n\nThanks for playing!");
				System.out.println("Correct: "+ numCorrect);
				System.out.println("Wrong:   "+ numWrong);
				System.out.println("Total:   "+ total);
				run =false;
			}
			else if(input.equals("update")){
				System.out.println();
				System.out.println("Correct: "+ numCorrect);
				System.out.println("Wrong:   "+ numWrong);
				System.out.println("Total:   "+ total);
				System.out.println("The answer is: " + text);
				System.out.println();
			}else{
				System.out.print("Incorrect! ");
				System.out.println("The correct answer was: \n"+ text);
				System.out.println();
				numWrong++;
			} total++;
		}while(run);
	}
	//shared arrays:
	//0-9
	public static String[] singlesArray = new String[]{"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	//11-15
	public static String[] teensArray = new String[]{"once","doce","trece","catorce","quince"};
	//10-90 whole
	public static String[] doublesArray = new String[]{"diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
	//100-1000 whole
	public static String[] triplesArray = new String[]{"ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos","mil"};
	
	public static String returnString = "";
	
	//Assigns randomNum a random number between 0 and 999.
	public static int generateRandomNum(){
		return (int) (Math.random() * 1000);
	}
	
	//method which turns a number 0-10000 into Spanish text
	public static String numToText(int input){
		//easter eggs
		if(input == 232323){System.out.println("Spagetti Monster hath Praise!");}
		else if(input == 23232323){System.out.println("Squinto hath Praise!");}
		
		//handles 0-9
		else if(input<10){
			//System.out.println("0-9"); //for testing
			//switch statement directly relates single array to the single digits
			switch(input){
				case 0: returnString = singlesArray[0];
					break;
				case 1: returnString = singlesArray[1];
					break;
				case 2: returnString = singlesArray[2];
					break;
				case 3: returnString = singlesArray[3];
					break;
				case 4: returnString = singlesArray[4];
					break;
				case 5: returnString = singlesArray[5];
					break;
				case 6: returnString = singlesArray[6];
					break;
				case 7: returnString = singlesArray[7];
					break;
				case 8: returnString = singlesArray[8];
					break;
				case 9: returnString = singlesArray[9];
					break;
			}
		}
		//handles 11-15
		else if(input>10 && input<16){
			//System.out.println("11-15"); //for testing
			//switch statement directly relates the teen array to the teen numbers with unique names
			switch(input){
				case 11: returnString = teensArray[0];
					break;
				case 12: returnString = teensArray[1];
					break;
				case 13: returnString = teensArray[2];
					break;
				case 14: returnString = teensArray[3];
					break;
				case 15: returnString = teensArray[4];
					break;
			}
		}
		//handles 10-90 whole
		else if(input>9 && input<91 && input%10 ==0){
			//System.out.println("10-90 whole"); //for testing
			//switch statement directly relates doubles array to the double digit numbers
			switch(input){
				case 10: returnString = doublesArray[0];
					break;
				case 20: returnString = doublesArray[1];
					break;
				case 30: returnString = doublesArray[2];
					break;
				case 40: returnString = doublesArray[3];
					break;
				case 50: returnString = doublesArray[4];
					break;
				case 60: returnString = doublesArray[5];
					break;
				case 70: returnString = doublesArray[6];
					break;
				case 80: returnString = doublesArray[7];
					break;
				case 90: returnString = doublesArray[8];
					break;
			}
		}
		//handles 16-99 mixed
		else if(input>15 && input<100){
			//System.out.println("16-99 mixed"); //for testing
			//the first and second part of a 16-99 mixed
			String partOne = "";
			String partTwo ="";
			//splits the input into its two digits(although the second stays a double digit)
			int secondDigit = input%10;
			int firstDigit = input-secondDigit;
			//switch statement directly relates the singles array to the second digit and word
			switch(secondDigit){
				case 0: partTwo = singlesArray[0];
					break;
				case 1: partTwo = singlesArray[1];
					break;
				case 2: partTwo = singlesArray[2];
					break;
				case 3: partTwo = singlesArray[3];
					break;
				case 4: partTwo = singlesArray[4];
					break;
				case 5: partTwo = singlesArray[5];
					break;
				case 6: partTwo = singlesArray[6];
					break;
				case 7: partTwo = singlesArray[7];
					break;
				case 8: partTwo = singlesArray[8];
					break;
				case 9: partTwo = singlesArray[9];
					break;
			}
			//switch statement directly relates the doubles array to the first digit and word
			switch(firstDigit){
				case 10: partOne = doublesArray[0];
					break;
				case 20: partOne = doublesArray[1];
					break;
				case 30: partOne = doublesArray[2];
					break;
				case 40: partOne = doublesArray[3];
					break;
				case 50: partOne = doublesArray[4];
					break;
				case 60: partOne = doublesArray[5];
					break;
				case 70: partOne = doublesArray[6];
					break;
				case 80: partOne = doublesArray[7];
					break;
				case 90: partOne = doublesArray[8];
					break;
			}
			returnString = partOne + " y "+ partTwo; //returns the text properly formatted	
		}
		//handles 100-900 whole
		else if(input>99 && input<901 && input%100 ==0){
			//System.out.println("100-900 whole"); //for testing
			//switch statement directly relates the triples array to the triple digit numbers
			switch(input){
				case 100: returnString = triplesArray[0];
					break;
				case 200: returnString = triplesArray[1];
					break;
				case 300: returnString = triplesArray[2];
					break;
				case 400: returnString = triplesArray[3];
					break;
				case 500: returnString = triplesArray[4];
					break;
				case 600: returnString = triplesArray[5];
					break;
				case 700: returnString = triplesArray[6];
					break;
				case 800: returnString = triplesArray[7];
					break;
				case 900: returnString = triplesArray[8];
					break;
			}
		}
		//handles 101-999 mixed
		else if(input>100 && input<1000){
			//System.out.println("101-999 mixed"); //for testing
			//the first, second and third parts of a 101-999 mixed
			String partOne = "";
			String partTwo ="";
			String partThree = "";
			//splits the input into its three digits
			int thirdDigit = input%10;									//example: 12(3) in 123
			int secondDigit = ((input-thirdDigit)/10)%10;				//example: 1(2)3 in 123
			int firstDigit = (((input-thirdDigit)/10)-secondDigit)/10;	//example: (1)23 in 123
			//sets up for testing of teen numbers
			String lastTwoDigitsString = ""+ secondDigit + thirdDigit; 		//combines the last two like 2+3 = 23
			int lastTwoDigitsInt = Integer.parseInt(lastTwoDigitsString);	//changes that back to an int
			//System.out.println(lastTwoDigitsInt); //for testing
			
			//handles format of a three digit number that does not have zeros or teens
			if(secondDigit != 0 && thirdDigit != 0 && lastTwoDigitsInt>15){
				//System.out.println(thirdDigit);
				//System.out.println(secondDigit); //for testing
				//System.out.println(firstDigit);
				switch(thirdDigit){
					case 0: partThree = singlesArray[0];
						break;
					case 1: partThree = singlesArray[1];
						break;
					case 2: partThree = singlesArray[2];
						break;
					case 3: partThree = singlesArray[3];
						break;
					case 4: partThree = singlesArray[4];
						break;
					case 5: partThree = singlesArray[5];
						break;
					case 6: partThree = singlesArray[6];
						break;
					case 7: partThree = singlesArray[7];
						break;
					case 8: partThree = singlesArray[8];
						break;
					case 9: partThree = singlesArray[9];
						break;					
				} 
				switch(secondDigit){
					case 1: partTwo = doublesArray[0];
						break;
					case 2: partTwo = doublesArray[1];
						break;
					case 3: partTwo = doublesArray[2];
						break;
					case 4: partTwo = doublesArray[3];
						break;
					case 5: partTwo = doublesArray[4];
						break;
					case 6: partTwo = doublesArray[5];
						break;
					case 7: partTwo = doublesArray[6];
						break;
					case 8: partTwo = doublesArray[7];
						break;
					case 9: partTwo = doublesArray[8];
						break;
				}
				switch(firstDigit){
					case 1: partOne = triplesArray[0];
						break;
					case 2: partOne = triplesArray[1];
						break;
					case 3: partOne = triplesArray[2];
						break;
					case 4: partOne = triplesArray[3];
						break;
					case 5: partOne = triplesArray[4];
						break;
					case 6: partOne = triplesArray[5];
						break;
					case 7: partOne = triplesArray[6];
						break;
					case 8: partOne = triplesArray[7];
						break;
					case 9: partOne = triplesArray[8];
						break;
				}
				returnString = partOne + " " + partTwo + " y " + partThree;
			}
			//handles format of the hundred and ones
			else if(secondDigit == 0 && thirdDigit != 0 && (lastTwoDigitsInt>15 || lastTwoDigitsInt<11)){
				switch(thirdDigit){
					case 0: partThree = singlesArray[0];
						break;
					case 1: partThree = singlesArray[1];
						break;
					case 2: partThree = singlesArray[2];
						break;
					case 3: partThree = singlesArray[3];
						break;
					case 4: partThree = singlesArray[4];
						break;
					case 5: partThree = singlesArray[5];
						break;
					case 6: partThree = singlesArray[6];
						break;
					case 7: partThree = singlesArray[7];
						break;
					case 8: partThree = singlesArray[8];
						break;
					case 9: partThree = singlesArray[9];
						break;					
				} 
				switch(firstDigit){
					case 1: partOne = triplesArray[0];
						break;
					case 2: partOne = triplesArray[1];
						break;
					case 3: partOne = triplesArray[2];
						break;
					case 4: partOne = triplesArray[3];
						break;
					case 5: partOne = triplesArray[4];
						break;
					case 6: partOne = triplesArray[5];
						break;
					case 7: partOne = triplesArray[6];
						break;
					case 8: partOne = triplesArray[7];
						break;
					case 9: partOne = triplesArray[8];
						break;
				}
				returnString = partOne + " " + partThree;
			}
			//handles the format of hundred and tens
			else if(secondDigit != 0 && thirdDigit == 0 && (lastTwoDigitsInt>15 || lastTwoDigitsInt<11)){
				switch(secondDigit){
					case 1: partTwo = doublesArray[0];
						break;
					case 2: partTwo = doublesArray[1];
						break;
					case 3: partTwo = doublesArray[2];
						break;
					case 4: partTwo = doublesArray[3];
						break;
					case 5: partTwo = doublesArray[4];
						break;
					case 6: partTwo = doublesArray[5];
						break;
					case 7: partTwo = doublesArray[6];
						break;
					case 8: partTwo = doublesArray[7];
						break;
					case 9: partTwo = doublesArray[8];
						break;
				}
				switch(firstDigit){
					case 1: partOne = triplesArray[0];
						break;
					case 2: partOne = triplesArray[1];
						break;
					case 3: partOne = triplesArray[2];
						break;
					case 4: partOne = triplesArray[3];
						break;
					case 5: partOne = triplesArray[4];
						break;
					case 6: partOne = triplesArray[5];
						break;
					case 7: partOne = triplesArray[6];
						break;
					case 8: partOne = triplesArray[7];
						break;
					case 9: partOne = triplesArray[8];
						break;
				}
				returnString = partOne + " " + partTwo;	
			}
			//handles the format of hundred and teens
			else if(secondDigit != 0 && thirdDigit != 0 && (lastTwoDigitsInt<15 || lastTwoDigitsInt>11)){
				switch(firstDigit){
					case 1: partOne = triplesArray[0];
						break;
					case 2: partOne = triplesArray[1];
						break;
					case 3: partOne = triplesArray[2];
						break;
					case 4: partOne = triplesArray[3];
						break;
					case 5: partOne = triplesArray[4];
						break;
					case 6: partOne = triplesArray[5];
						break;
					case 7: partOne = triplesArray[6];
						break;
					case 8: partOne = triplesArray[7];
						break;
					case 9: partOne = triplesArray[8];
						break;
				}
				switch(lastTwoDigitsInt){
					case 11: partTwo = teensArray[0];
						break;
					case 12: partTwo = teensArray[1];
						break;
					case 13: partTwo = teensArray[2];
						break;
					case 14: partTwo = teensArray[3];
						break;
					case 15: partTwo = teensArray[4];
						break;
				}
				returnString = partOne + " " + partTwo;	
			}
			
			
			
			
		}
		//handles 1000-10000 whole
		else if(input>999 && input<10001 && input%1000 ==0){
			System.out.println("1000-10000 whole"); //for testing
	
			
			
		}
		//handles 1001-9999 mixed
		else if(input>1000 && input<10000){
			System.out.println("1001-9999 mixed"); //for testing
			
			
			
		}
		//handles 10000+, which should be an impossible input
		else{System.out.println("Spooky Scarry Error Code 23! \nNumber probaly exceeded 10000\n(which really shouldn't happen)");}
		
		
		return returnString;
	}	
}
