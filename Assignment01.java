// CSE 110: Class # 90548
// Assignment: Assignment 01
// Author: Brandon Worley -ID # 1221104768
// Description: Coding demonstrating knowledge of variables and scanners

import java.util.Scanner;

public class Assignment01 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		//Inputs
		// 1) Numbers of pizzas purchased
		// 2) Numbers of slices per pizza
		// 3) Number of Adults 
		// 4) Number of children
		// Outputs
		// 1) Total number of slices of pizza
		// 2) Total number of slices that will be given to the adults 
		// 3) Total number of slices available for children 
		// 4) Number of slices each child will get 
		// 5) Number of slices left over
		
	//First Step is to define the variables and constants in the solution
		
		int totalPizzas = 0;
		int totalSlices = 0;
		int totalAdults = 0;
		int totalChildren = 0;
		final int SLICESPERADULT = 2;
		
		
	// Next Step is to record input with a prompt and then print out the integer value for response
		
		System.out.println(" Enter number of pizzas purchased");
		totalPizzas = scan.nextInt();
		
		System.out.println(" Enter number of slices per pizza" );
		totalSlices = scan.nextInt();
		
		System.out.println(" Enter number of adults " );
		totalAdults = scan.nextInt();
		
		System.out.println(" Enter number of children ");
		totalChildren = scan.nextInt();
		
	// Next Step I had to define my variables for my outputs
		
		int leftoverPizzaSlices = 0;
		int slicesforChildren = 0;
		int slicesGiventoAdults = 0;
		int slicesGiventoChildren = 0;
		int totalSlicesofPizza = 0;
		
	// Next Step I defined the new variables as expressions with operators that compute the input data received
		
		slicesGiventoAdults = totalAdults * SLICESPERADULT;
		totalSlicesofPizza = totalSlices * totalPizzas; 
		slicesforChildren = (totalSlicesofPizza - slicesGiventoAdults);
		slicesGiventoChildren = (slicesforChildren / totalChildren); 
		leftoverPizzaSlices = ( slicesforChildren % (totalChildren * slicesGiventoChildren)) ;
		
	// Last Step I output my expressions that computed the input data 
		
		System.out.println(" Total number of slices of pizza: " + totalSlicesofPizza);
	
		
		System.out.println(" Total number of slices given to adults: " + slicesGiventoAdults);
		
		System.out.println(" Total number of slices available for children: " + (slicesforChildren));
		
		System.out.println(" Number of slices each child will get: " + slicesGiventoChildren);
		
		System.out.println(" Number of slices leftover: " +  leftoverPizzaSlices );
		
		
	}
	
}
