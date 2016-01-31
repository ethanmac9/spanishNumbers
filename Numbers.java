//Class which handles the logic.
//Code by Ethan MacDonald. 10/27/15 - 10/29/15

//Handles logic for assigning a Spanish number to a randomly generated numeral.

import java.util.*;
class Numbers {
	//Assigns randomNum a random number between 0 and 100.
		public static int generateRandomNum(){
			return (int) (Math.random() * 101);
		}
	//Handles random numbers that are less than 16, meaning each has an unique Spanish word.
	public static String lessThan16(int randomNum){
		String spanishNum = null;
		switch(randomNum){
			case 0: spanishNum = "cero";
				break;
		
			case 1: spanishNum = "uno";
				break;	
				
			case 2: spanishNum = "dos";
				break;
				
			case 3: spanishNum = "tres";
				break;
				
			case 4: spanishNum = "cuatro";
				break;
				
			case 5: spanishNum = "cinco";
				break;
				
			case 6: spanishNum = "seis";
				break;
				
			case 7: spanishNum = "siete";
				break;
				
			case 8: spanishNum = "ocho";
				break;
				
			case 9: spanishNum = "nueve";
				break;
				
			case 10: spanishNum = "deiz";
				break;
				
			case 11: spanishNum = "once";
				break;
			
			case 12: spanishNum = "doce";
				break;
			
			case 13: spanishNum = "trece";
				break;
			
			case 14: spanishNum = "catorce";
				break;
			
			case 15: spanishNum = "quince";
				break;
			} 
		return spanishNum;
		}
	//Handles random numbers from 16-99, meaning non multiples of 10 need a "y".
	public static String greaterThan15(int randomNum){
		String spanishNum = "default";
		String multOfTen = "default";
		String partOne = "default";
		String partTwo = "default";
		//Separates randomNum into its two digits.
		int secondDigit = randomNum % 10;
		int firstDigit = (randomNum - secondDigit) / 10;
		//Handles multiples of 10.
		if(secondDigit == 0){
			switch(firstDigit){
			
			case 2 : multOfTen = "veinte";
				break;
				
			case 3 : multOfTen = "treinta";
				break;
			
			case 4 : multOfTen = "cuarenta";
				break;
			
			case 5 : multOfTen = "cincuenta";
				break;
			
			case 6 : multOfTen = "sesenta";
				break;
			
			case 7 : multOfTen = "setenta";
				break;
			
			case 8 : multOfTen = "ochenta";
				break;
			
			case 9 : multOfTen = "noventa";
				break;
			}
			spanishNum = multOfTen;
		}
		//Handles other numbers.
		else if(secondDigit != 0){
		//Sets the first digit of a compound number.
			switch(firstDigit){
			case 2 : partOne = "veinte";
				break;
			
			case 3 : partOne = "treinta";
				break;
			
			case 4 : partOne = "cuarenta";
				break;
			
			case 5 : partOne = "cincuenta";
				break;
			
			case 6 : partOne = "sesenta";
				break;
			
			case 7 : partOne = "setenta";
				break;
			
			case 8 : partOne = "ochenta";
				break;
			
			case 9 : partOne = "noventa";
				break;
			} 
		//Sets the second digit of each compound number.
			switch(secondDigit){
			case 1: partTwo = "uno";
				break;	
				
			case 2: partTwo = "dos";
				break;
				
			case 3: partTwo = "tres";
				break;
				
			case 4: partTwo = "cuatro";
				break;
				
			case 5: partTwo = "cinco";
				break;
				
			case 6: partTwo = "seis";
				break;
				
			case 7: partTwo = "siete";
				break;
				
			case 8: partTwo = "ocho";
				break;
				
			case 9: partTwo = "nueve";
				break;
			}
			spanishNum = partOne + " y " + partTwo;
		}
		return spanishNum;
	}
	/*//Uncomment for bug fixing. 
	public static void main(String[] args) {
		int randomNum = 99;
		System.out.println(greaterThan15(randomNum));
	} */
}





