// CSE 110     : CSE 110 Online
// Assignment  : Assignment07
// Author      : Brandon Worley ID # 1221104768
// Description : Creating a Weapon Class with different Methods

class Weapon {
	private String name ;
	private int maxDamage ;

	public Weapon() {
		name = "Point sticky" ;
		maxDamage= 1 ;
	}

	public Weapon(String WeaponName, int MaxDamage) {
		this.name = WeaponName;
		this.maxDamage = MaxDamage;
	}

	public String getName() {
		return name;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setName(String WeaponName) {
		this.name = WeaponName;
	}

	public void setmaxDamage(int MaxDamage) {
		this.maxDamage = MaxDamage;
	}
}

