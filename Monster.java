// CSE 110     : CSE 110 Online
// Assignment  : Assignment07
// Author      : Brandon Worley ID # 1221104768
// Description : Creating a Monster Class with different Methods 

class Monster {
	

		private String name;
		private int healthScore;
		private Weapon weapon;

		public Monster(String name, int healthScore, Weapon weapon) {
		this.name = name;
		this.healthScore = healthScore;
		this.weapon = weapon;
		}

		public String getName() {
			return name;
		}
		public int attack(Monster monster) {
			int randomInt =(int)(Math.random() * ((weapon.getMaxDamage() - 0) + 1)) + 0;
			monster.healthScore-=randomInt;
			if(monster.getHealthScore()<0)
			monster.healthScore=0;
			return randomInt;
		}
		public int getHealthScore() {
			return healthScore;
		}

		public String getWeaponName(){
			return this.weapon.getName();
		}

		
}
