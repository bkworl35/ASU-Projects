// CSE 110     : CSE 110 Online
// Assignment  : Assigment 08
// Author      : Brandon Worley -ID # 1221104768
// Description : Creating a Class for the Volleyball Players


public class Player {
	 private String name;
	    private double attackStat;
	    private double blockStat;

	    
	    public Player(String name, double attackStat, double blockStat) {
	        this.name = name;
	        this.attackStat = attackStat;
	        this.blockStat = blockStat;
	    }

	   
	    public String getName() {
	        return name;
	    }

	    public double getAttackStat() {
	        return attackStat;
	    }

	    public void setAttackStat(double attackStat) {
	        this.attackStat = attackStat;
	    }

	    public double getBlockStat() {
	        return blockStat;
	    }

	    public void setBlockStat(double blockStat) {
	        this.blockStat = blockStat;
	    }

	    public void printPlayerInfo(){
	        System.out.printf("%s (attack = %.2f, block = %.2f)\n",name,attackStat,blockStat);
	    }
}
