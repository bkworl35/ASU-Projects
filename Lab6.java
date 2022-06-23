/*-------------------------------------------------------------
// AUTHOR: Brandon Worley.
// FILENAME: Lab6.java
// SPECIFICATION: 2D Array practice 
// FOR: CSE 110- Lab #6
// TIME SPENT: 1hr. 20 min.
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //int numStudents = -1;
       //int[] studentGroups = null;//arrays are objects
       //double[] studentGrades = null;
       //int numGroups = -1;  // Part 2
       //ask for number of students
       System.out.println(" How many Students do you have? : ");
       int numStudents = scanner.nextInt();


       //initialize the array based on user input
       int[] studentGroups = new int[numStudents];
       double[] studentGrades = new double[numStudents];
	   //complete the code here for part 1
       for(int i =0; i <  numStudents;  i++) {
    	   
    	   System.out.println(" [Group #] and [Grade] for Entry" + " " + (i + 1));
    	   studentGroups[i] = scanner.nextInt();
    	   studentGrades[i] = scanner.nextDouble();   
       }
       System.out.println(" ==== List of Student Records ====");
       for(int i = 0; i < numStudents; i++) {
       		System.out.println(" Group" + " " + studentGroups[i] + " " + "-" + " " + studentGrades[i] + " " + "Points");
       
       }
    	   

       // Part 2: Find the number of groups
       //if (studentGroups[i] > numGroups)  {
               //numGroups = studentGroups[i];
           //}
       //}

       // Print out the records
       // The code below is only for Part 2

       //double[] groupAverages = new double[numGroups + 1];  // Avoid group 0
       //int[] groupSizes = new int[numGroups + 1];  // Avoid group 0

       // For each student record,
       //   - find the group # and the grade, and
       //   - update groupAverages and groupSizes




       // Display the statistics of groups


       scanner.close();
    }
}
