package finalshare.FinalTextBasedRPG.entities;

public class Monster {

	private int hp;
	private int xp = 0;
	private byte strength = 0; 
	private byte level;
	
	
	public String name;
	
	
	/*
	Dont worry about modify strength, 
	strenght will change automaticly when 
	Xp hits level * necessaryXp.
	*/
	public Monster(String name, int hp,int xp){
		this.hp = hp;
		this.name = name;
		this.xp = xp;
	}
	
	public int verifyHp(){
		int xp = this.xp;
		
		//verify hp and give xp:D
		if(this.hp < 1){
			return xp;
		}
		//if he dont die, no xp:(
	return 0;
	}
	
	//also, the necessaryXp can be used to define difficulty in your game.
	public void verifyXp(int necessaryXp){
		if(xp == level * necessaryXp){
			strength++;
		}
	}
	
	//put something random here
	public int genericAttack(int random){
		int dmg = 0;	
		
			dmg = random * strength;
			System.out.println(name + "used simple attack!");			
		return dmg;	
		/*
		more complex combat system soon!
		*/	
	}

	
	//Getters and setters, yk, the usual.
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStrength() {
		return strength;
	}

	public byte getLevel() {
		return level;
	}
}
