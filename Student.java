/*-------------------------------------------------------------
//AUTHOR: Brandon Worley
//FILENAME: Student.java
//SPECIFICATION: A template file for the Student class.
//FOR: CSE110 Lab 8
//-----------------------------------------------------------*/
public class Student {
	private String sFullName, sAsuID;
	private double sGrade;
	
	private int numOfUpdates = 0;
	private int numOfAccessed = 0;
	
	public Student(String sFirstname, String sLastname, String fullName, String sAsuID2, double sGrade2) {
		sFullName = null;
		sAsuID = null;
		sGrade = -1.00;
	
	}
	Student(String sFullName, String sAsuID, double d) {
		this.sFullName = sFullName;
		this.sAsuID = sAsuID;
		this.sGrade = d;
	}
	
	public String toString() {
	    return "[Name: " + this.sFullName + ", ASUID: " + this.sAsuID+", Grade: "+this.sGrade+"]";
	}

	//Setters
	public void setName(String sFullName) {
		this.sFullName = sFullName;
		numOfUpdates++;
	}
	public void setId(String sid) {
		this.sAsuID = sid;
		numOfUpdates++;
	}
	public void setGrade(double sGrade) {
        this.sGrade = sGrade;
        numOfUpdates++;
	}
	//Getters
	public String getFullname() {
        numOfAccessed++; 
        return this.sFullName;
    }
	public String getAsuID() {
         numOfAccessed++; 
         return this.sAsuID;
	}
	public double getGrade() {
        numOfAccessed++;
        return this.sGrade;
    }
	//Methods that return the access or update amounts
	public double getNumOfAccessed() {
        numOfAccessed++;
        return this.numOfAccessed;
	}
	public double getNumOfUpdates(){
        numOfAccessed++;
        return this.numOfUpdates;
    }
	// equals operation method
	public boolean equals(Student s){
        
        if(this.sFullName.equalsIgnoreCase(s.getFullname()))
            return true;
        else if(this.sAsuID == s.getAsuID())
            return true;
        else if(this.sGrade == s.getGrade())
            return true;
        else 
        	return false;
   }		
}
	

