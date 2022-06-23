// CSE 110     : <CSE 110 Online >
// Assignment  : Assignment 06
// Author      : Brandon Worley ID # 1221104768
// Description : Creating methods and to explore arrays

public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
    	int[] myArray = {1, 22, 333, 400, 5005, 9};
    	printArray(myArray, ", ");
    	printArray(myArray, " - ");
    	getFirst(myArray);
    	getLast(myArray);
    	getAllButFirst(myArray);
    	getIndexOfMin(myArray);
    	getIndexOfMax(myArray);
    	swapByIndex(myArray, 1, 4);
    	removeAtIndex(myArray, 3);
    	insertAtIndex(myArray, 2, 777);
    	isSorted(myArray);
    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int [] myArray, String string1) {
    	
    	int i = 0;
    	int x = 0;
    	for (i = 0; i < myArray.length; i++) {
    		x = myArray[i];
    		System.out.print(x + string1);
    	}
    }
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    
    public static int getFirst(int [] myArray) {
    	return myArray[0];
    }
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    
    public static int getLast(int [] myArray) {
    	return myArray[myArray.length - 1];
    }
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int [] myArray) {
    	int n = myArray.length;
        int[] mynewArray = new int[n-1];
        for(int i = 1; i < n; i++) {
        	mynewArray[i-1] = myArray[i];
        }
        
    	return mynewArray;
    }
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int [] myArray) {
    	int minIndex = 0;
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] < myArray[minIndex])
                minIndex = i;
        }
        return minIndex;
    }
    
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int [] myArray) {
    	int maxIndex = 0;
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] > myArray[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
    public static int [] swapByIndex(int[] myArray, int i, int x) {
        int swap = myArray[i];
        myArray[i] = myArray[x];
        myArray[x] = swap;
        return myArray;
    }
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] arr, int index) {
        int n = arr.length;
        int[] mynewArray = new int[n-1];
        for(int i = 0, x = 0; i < n; i++) {
            if(i != index) {
            	mynewArray[x] = arr[i];
                x++;
            }
        }
        return mynewArray;
    }
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex (int[] myArray, int index, int newvalue) {
        int n = myArray.length;
        int[] mynewArray = new int[n+1];
       
        int i, j;
       
        for(i = 0 ; i < index; i++) {
        	mynewArray [i] = myArray[i];
        }
        mynewArray [index] = newvalue;
        
        for(j = index + 1, i = index; i < n; i++)
        	mynewArray [j] = myArray[i];
       
        return mynewArray ;
    }
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] myArray) {
        if(myArray.length < 2)
            return true;
        else {
            for(int i = 1; i < myArray.length; i++) {
                if(myArray[i] < myArray[i-1])
                    return false;
            }
            return true;
        }
    }

}
