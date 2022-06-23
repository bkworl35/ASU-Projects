// AUTHOR: Brandon Worley 
// FILENAME: Lab2.java
// SPECIFICATION: practice with string/ string comparison 
// FOR: CSE 110 - Lab # 2
// TIME SPENT: ~2 hours

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		String firstName= "";
		String lastName= "";
		String fullName= "";
		int nameLength= 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	
	// Solution Guide: 
	//1. Prompt user for info and store input
	//2. Get the full name from user input and store it in Upper Case
	//3. Get Length 
	//4. Compare Strings using ==
	//5. Compare strings using .equals method

	
		System.out.println("Enter your first name");
		firstName = keyboard.nextLine();
		System.out.println("Your first name is:" + firstName);
	
		System.out.println("Enter your last name");
		lastName = keyboard.nextLine();
		System.out.println("Your last name is: " + lastName);
		
	
	
	// Here I have completed step one and now moving to step 2 
	
		String str1= firstName + " " + lastName; 
		fullName = str1.toUpperCase();
		System.out.println(" Your full name is: " + fullName);
	
	// This step completes step 2 for the solution ==>
	
		nameLength = str1.length();
		System.out.println(" Your name has: " + nameLength + " characters ");
	
	// This step completes step 3 for the solution ==>
	
		String title1 = new String("cse110");
		String title2 = "cse110";
	 
	
		if ( title1 == title2 ) {
			System.out.println(" String comparison using "==" sign works ");
		
		} else{
				System.out.println(" String comparison using "==" does NOT work");
		}
	// Step 4 complete
		if ( title1.equals(title2) ) { 
			System.out.println("String comparison using 'equals' method works ");
		
		} else {
				System.out.println("String comparison using 'equals' method does NOT work");
		}
	//Step 5 complete
		
		
		
		
	}
}
