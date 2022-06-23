// CSE 110     : 
// Assignment  : 
// Author      : Brandon Worley 
// Description : <of the file contents>

import java.util.Scanner;

public class Assignment02 {
    
   public static void main(String[] args) {
        // declare and instantiate a Scanner
    Scanner scan = new Scanner(System.in);

        // declare and initialize variables
      double length;
      int lanes;
      int depth;
      int daysleft ;
    
    
        
        // collect inputs
      System.out.println("Length of road project (miles) : ");
      length = scan.nextDouble();
      
      System.out.println("Number of lanes : ");
      lanes = scan.nextInt();
      
      System.out.println("Depth of asphalt (inches) : ");
      depth = scan.nextInt();
      
      System.out.println("Days to complete project : ");
      daysleft = scan.nextInt();
  
   
        
        // compute required values
      /**
      * Next I have to create formulas for the desired outputs needed 
       * Truck loads of Asphalt = total amount of Asphalt needed/ 5 tons (10,000lbs) 
       * 	total amount of asphalt in cubic feet = 	length * 5280 * 12 * (depth/12)
       * 	total weight of asphalt = 150 * 
       * Stop lights =  # of intersections (= to # of whole miles) + # of lanes * 2
       * Conduit pipes = (5280ft in mile) (Total length(miles to feet) / 24ft) 
       * Crew Members needed = math.roundUp(crewMember formula) 
       * Cost of Asphalt = truck loads of asphalt * 1000
       * Cost of Stop lights = stop lights * $25,000
       * Cost of Conduit Pipes =  conduit pipes * $500
       * Cost of Labor = (8 (hours) * $25) = $200 * input(number of days left to complete) * 
       * 	Crew members needed
       * Total Cost of project = math.sum() of 4 costs   
       *   
        */
     
     
       
      double intersections = (Math.floor(length));
      
      double amountofAsphalt = length * 5280 * 12 * (depth/12) * 150;
      
      double numofTrucks = Math.round(amountofAsphalt / 10000) * 3;
      
     
      
      double conduits = ((length * 5280) / 24);
      
      double crewMember = Math.round(( 50 * length * lanes) / daysleft );
      
      double stoplights = (intersections + lanes) * 2;
      
      double asphaltCost = numofTrucks * 1000;
      
      double stoplightsCost = stoplights * 25000;
      
      double conduitsCost = conduits * 500;
      
      double laborCost = Math.ceil(crewMember) * 8 * 25 * daysleft;
      
      double totalCost = asphaltCost + stoplightsCost + conduitsCost + laborCost;
      
      	// display results
      System.out.println("--- Amount of Materials Needed --- ");
      System.out.println(" Truckloads of Asphalt   :" + numofTrucks);
      System.out.println(" Stoplights              :" + stoplights);
      System.out.println(" Conduit pipes           :" + conduits);
      System.out.println(" Crew members needed     :" + crewMember);
      
      System.out.println("--- Cost of Materials ------------ ");
      System.out.println(" Cost of Asphalt         :" + "$" + asphaltCost);
      System.out.println(" Cost of Stoplights      :" + "$" + stoplightsCost);
      System.out.println(" Cost of Conduit pipes   :" + "$" + conduitsCost);
      System.out.println(" Cost of Labor           :" + "$" + laborCost);
      
      System.out.println("--- Total Cost of Project -------- ");
      System.out.println(" Total cost of project   :" + "$" + totalCost);
         

    }

}