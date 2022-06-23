// CSE 110     : <CSE 110 Online >
// Assignment  : Assignment 4
// Author      : Brandon Worley ID # 1221104768
// Description : While Loops to build a Guesser
import java.util.Scanner;
import java.util.Random;
public class Assignment04 {

    public static void main(String[] args) {
    	System.out.println(" ----MASTERMIND-----");
    	System.out.println(" Guess the 4 digit number!:");
    	
    	Scanner scan = new Scanner(System.in);
    	Random generator = new Random();
    	
    	String newGuess;
    	int[] randomNumber = {0,0,0,0};
    	
    	randomNumber[0] = generator.nextInt(9);
    	randomNumber[1] = generator.nextInt(9);
    	randomNumber[2] = generator.nextInt(9);
    	randomNumber[3] = generator.nextInt(9);
    	
    	
    	
    	
    	String[] eachGuess;
    	int counter = 0 ;
    	int j = 0;
    	
    	while(counter != 4) {
    		System.out.println(" Guess " + " " + (j+1)+ ":");
    		newGuess = scan.nextLine();
    			j++;
    			
    		
    	eachGuess = newGuess.split("");
    	counter = 0;
    	
    		for(int i = 0; i < 4; i = i+1) {
    		
    			if(eachGuess[i].equals(Integer.toString(randomNumber[i]))) {
    			counter++;
    			}
    		}
    	
    	System.out.println(" You Matched " + counter);
    	
    	
    	
    	}
    	System.out.println(" Congratulations! You guessed the right number in " + " " +  counter + " " + "guesses");
    	System.out.println(" Would you like to play again (yes/no)? ");
    	
   }}
    

    	
    
    
    

