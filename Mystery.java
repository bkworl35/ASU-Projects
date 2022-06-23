// Practice using and creating Methods 

public class Mystery { 
	public static void main(String[] args) {
		String x = "chair";
		String y = "notes";
		String z = "table";
		String meeting = "x";
		String notes = y + meeting;
		
		meeting(x, y, z );
		meeting(y, meeting, notes);
		meeting(y + z, y + meeting, notes);
		meeting = "boring";
		meeting(meeting, "today", x);
		
	}
	
	public static void meeting(String z, String y, String x) {
		System.out.println(x + " and " + z + " like " + y);
	}
}









