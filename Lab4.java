/*-------------------------------------------------------------
// AUTHOR: Brandon Worley 
// FILENAME: Lab4.java
// SPECIFICATION: Practice with Loop Switch 
// FOR: CSE 110- Lab #4
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

// Import Scanner class
import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {
        // Declare some variables you need
        // -->
    	
    	int choice = 1;
    	
    	int a;
    	int b;
    	int x;
    	int n = 1;
    	int sum = 0;
    	int digit = 1;
    	
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	do {
            // Display the menu
            displayMenu();

            // Ask the user for one option
            // -->
           System.out.println(" Please choose one option from the following menu : ");
         choice = scan.nextInt();
        
            

            switch (choice) {
                // Define four cases for different options. Don't forget "break".
                // -->
            case 1 :
            	System.out.println(" Enter a number : ");
            	int sumofInt = scan.nextInt();
            	for (a=1 ; a<= sumofInt; a++)
            		sum = sum + a;
            	
            	System.out.println(" The sum of " + " " + 1 + " " + "to" + " " + sumofInt + " " + "is" 
            			+ " " + sum);
            
            break;
            
            case 2  :
            	System.out.println(" Enter a number : ");
            	int fact = scan.nextInt();
            	for(b = fact; b> 1; b--)
            		n = n*b;
            	System.out.println(" The factorial of " + " " + fact + " " + "is" + " " + n );
            break;
            
            case 3  :
            	System.out.println(" Enter a number : ");
            	int firstDigit = scan.nextInt();
            	for ( x=1 ; x>= 10;)
            		digit = x/=10;
            		
            	System.out.println(" The leftmost digit of" + " " + firstDigit + " " + "is" + " " + digit);  
            break;
            
            
            	
            	
            }
        } while (choice != 4);
        System.out.println(" Bye "); {
        	
        }}

    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
   
    
    }
}