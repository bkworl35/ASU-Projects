//Author : Brandon Worley
//filename: Lab1.java
//specification: averaging test scores for lab 1 project
//For: CSE 110 - Lab #1
//Time Spent: 1hr 14min
import java.util.Scanner;

public class Lab1
{
	public static void main(String[] args)
	{
	
		double test1 = 0.0;
		// The initial value is zero and to be stored as a double value I entered a decimal place 
		double test2 = 0.0;
		double test3 = 0.0;
		final double NUM_TESTS = 3.0;
		// This variable is declared as constant and is used to average the test scores 
		
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		// keyboard scanner and the declaration
	
		
		System.out.println("Please input test 1 score:");// this is my prompt command for first score
		test1 = keyboard.nextDouble();
		System.out.println("Your test 1 score is " + test1);
		
		System.out.println("Please input test 2 score:");// second test score
		test2 = keyboard.nextDouble();
		System.out.println("Your test 2 score is " + test2);
		
		System.out.println("Please input test 3 score:");// third test score
		test3 = keyboard.nextDouble();
		System.out.println("Your test 3 score is " + test3);
		
		// the scanner should have captured all three inputs and stored the values
		
		//onto the computation of averaging the scores and printing the value 
		
		double avg;
		avg = (test1 + test2 + test3)/ NUM_TESTS;
		// after reviewing casting I edited the code above to include decimal places
		System.out.println("Your average is " + avg);
		// command prints the text and average score 
	}
}


















