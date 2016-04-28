//Spanish Number Game v1.1.1
//Code by Ethan MacDonald on 4/27/16 . 4/28/16
//Checks a users spelling of a randomly generated Spanish number against proper spelling.
//Eventually I'd like it to be able to look up a spelling based a user input. 

package spanishSpelling;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int test = userInput.nextInt();
		int s = test%10;
		//System.out.println(s);
		//System.out.println((test-s)/10);
		System.out.println(numToText(test));
		
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
	
	//method which turns a number 0-10000 into Spanish text
	public static String numToText(int input){
		//handles 0-9
		if(input<10){
			System.out.println("0-9"); //for testing
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
			System.out.println("11-15"); //for testing
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
			System.out.println("10-90 whole"); //for testing
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
			System.out.println("16-99 mixed"); //for testing
			String partOne = "";
			String partTwo ="";
			
			int secondDigit = input%10;
			int firstDigit = input-secondDigit;
			
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
			returnString = partOne + " y "+ partTwo;	
		}
		//handles 100-900 whole
		else if(input>99 && input<901 && input%100 ==0){
			System.out.println("100-900 whole"); //for testing
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
			System.out.println("101-999 mixed"); //for testing
			
			
			
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
		
		
		
		
		
		String placeholder = ""; return returnString;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}










































