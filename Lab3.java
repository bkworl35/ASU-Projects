// Author : Brandon Worley 
// Filename: Lab3.java
// Specification : Practice with Scanner Class
// For : CSE 110 Lab # 3
// Time Spent:1 H 33 MIN
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        double HW = 0;
        double midterm = 0;
        double finalexam = 0;
        int i = 0;
      
        // -->
        // Declare a loop control variable i
        
        // -->

        while ( i <= 2 ) {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
        	
        	if ( i == 0 )
        		{
        		System.out.print("Enter your homework grade: ");
        		HW = scanner.nextDouble();
        		if ( HW < 0 || HW > 100) {
        			System.out.print("Please enter a number between 0 and 100: ");
        		} else 
        			{
        			i++; 
        		}
            // if i is 1, asks for the midterm exam grade
        	if  ( i == 1 ) 
        		{
        		System.out.print("Enter your midterm exam grade: ");
        		midterm = scanner.nextDouble();
        		if ( midterm < 0 || midterm > 100) {
        			System.out.print(" Please enter a number between 0 and 100: ");
        		} else {
        			i++;
        		}
        			
        		}
        	}
        	
        	// if i is 2, asks for the final exam grade
        	if  ( i == 2 )
        		{
        		System.out.print(" Enter your final exam grade: ");
        		finalexam = scanner.nextDouble();
        		if ( finalexam < 0 || finalexam > 200)  { 
        			System.out.print(" Please enter a number between 0 and 200: ");
        		} else {
        			i++;
        		}
        		}
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
        	
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.
            // -->

            

            // The other two if-else statments go here
            // -->
        }

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total = (HW * 0.25) + (midterm * 0.25) + 
        		((finalexam/200) * 50);

        // Show the weighted total and tell the user s/he passed or not
        System.out.println(" Your weighted total is: " + weighted_total );
        // -->
        if (weighted_total >= 50) {
            // Print "the student PASSED the class."
        	System.out.println(" Student PASSED the class " );
        } else {
            // Print "the student FAILED the class."
        	System.out.println(" Student FAILED the class " );
        }

        scanner.close();

    }  // End of main


	private static boolean finalexam(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean midterm(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean HW(int i, int j) {
		// TODO Auto-generated method stub
		return false; 
	} } // End of class
