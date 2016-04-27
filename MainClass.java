//Spanish Number Game v1.1
//Code by Ethan MacDonald on 4/27/16
//Checks a users spelling of a randomly generated Spanish number against proper spelling.
//Eventually I'd like it to be able to look up a spelling based a user input. 

package spanishSpelling;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int test = userInput.nextInt();
		numToText(test);
		
	}
	//shared arrays:
	//0-9
	public String[] singlesArray = new String[]{"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	//11-15
	public String[] teensArray = new String[]{"once","doce","trece","catorce","quince"};
	//10-90 whole
	public String[] doublesArray = new String[]{"diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
	//100-1000 whole
	public String[] triplesArray = new String[]{"ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos","mil"};
	
	//method which turns a random number 0-10000 into Spanish text
	public static String numToText(int input){
		
		//handles 0-9
		if(input<10){
			System.out.println("0-9"); //for testing
			
			
			
		}
		//handles 11-15
		else if(input>10 && input<16){
			System.out.println("11-15"); //for testing
			
			
			
		}
		//handles 10-90 whole
		else if(input>9 && input<91 && input%10 ==0){
			System.out.println("10-90 whole"); //for testing
			
			
			
		}
		//handles 16-99 mixed
		else if(input>15 && input<100){
			System.out.println("16-99 mixed"); //for testing
			
			
			
		}
		//handles 100-900 whole
		else if(input>99 && input<901 && input%100 ==0){
			System.out.println("100-900 whole"); //for testing
			
			
			
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
		
		
		
		
		
		String placeholder = ""; return placeholder;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}










































