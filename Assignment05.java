// CSE 110     : <CSE 110 Online >
// Assignment  : Assignment 4
// Author      : Brandon Worley ID # 1221104768
// Description : Building Methods

public class Assignment05 {

    public static void main(String[] args) {
        // Codes below will test your methods:
        displayGreeting();
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);
        average= averageLength("test","test21", "testtest");
        System.out.println(average);
        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
        System.out.println(stars);
        stars = maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);

    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    static void displayGreeting() {
    		  
    		 	 System.out.println ("Hello, and welcome! ");
    }
    
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    static void displayText(String test) {
    	System.out.println(test);
    	
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    static void printTotal(int x, int y, int z) {
    	System.out.print(x + y + z);
    }
    
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    static int getTotal( int num1, int num2, int num3) {
    	return num1 + num2 + num3 ;	
    }
    
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    
    static double getAverage(int num1, int num2, int num3) {
    	return( num1 + num2 + num3) / 3;
    	
    }
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    static double averageLength(String word1, String word2, String word3) {
    	return (word1.length() + word2.length() + word3.length())/3;
    }
    
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    static int lengthOfShortest(String word1, String word2) {
    			
    	if( word2.length() > word1.length()) {
    		return word1.length();
    	} else {
    		return word2.length();
    	}
			
    
    
    	
    }
 
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
	static String stringOfStars(String word) {
		int star = word.length();
		char asterisk = '*';
		String result = "";
		for(int x = 0; x < star; x++) {
            result += asterisk;
        }
		return result;
	}
    
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
   static String maxStringOfStars(String word1, String word2) {
   		if(word1.length() > word2.length()) {
   			return stringOfStars(word1);
   			}  else {
   			return stringOfStars(word2);
   			}
   		}
   		
   		
    	
   
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
   static String midStringOfStars(String word1, String word2, String word3) {
	   if(word1.length() > word2.length()) {
		   return stringOfStars(word1);
		   
	   }
		return stringOfStars(word3);
		}
	



}