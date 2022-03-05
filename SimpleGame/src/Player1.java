
public class Player1 {
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		if(this.health < 0 || this.health > 100) {
			this.health = 100;
		}
		else {
			this.health = health;
		}
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the weapon
	 */
	public String getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void damageByGun1() {
		this.health -= 30;
		if(this.health <= 0) {
			this.health = 0;
		}
	
		System.out.println("Got hit by gun 1. Health is reduced by 30"+ ". New health is "+this.getHealth());
		if(this.health == 0) {
			System.out.println(getName()+" is dead");
		}
	}
	
	public void damageByGun2() {
		this.health -= 40;
		if(this.health <= 0) {
			this.health = 0;
		}
	
		System.out.println("Got hit by gun 2. Health is reduced by 40"+ ". New health is "+this.getHealth());
		if(this.health == 0) {
			System.out.println(getName()+" is dead");
		}
	}
}
