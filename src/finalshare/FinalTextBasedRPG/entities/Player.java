package finalshare.FinalTextBasedRPG.entities;

public class Player{

	/**
	  @author MrFinalshare
	**/
	
	//Stats
	private int hp = 0;
	private byte strength = 0;
	private byte intelligence = 0;
	
	//Don't modify NOTHING here, just use verifyXp(); to put skill points
	 private int points = 3;
	
	//Useless for now
	public String name;
	
	
	//experience and level
	private byte level = 1;
	private int xp = 0;
	
	/*
	Economic things
	Useless for now 
	*/
	private int coins = 0;
	
	Player(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	
	
	/*
	A way to dont allow soo many exploits in your game, basically
	An ability points system
	*/
	
	public void SkillPoints(int userChoice, String defaultMsg){	
	
		/*
		 the default msg will be used in else condition too, so... 
		 use with knowledge
		*/
		
		if(points > 0) {
		switch (userChoice){
		
		/*
		 Skill points, if user choice intelligence or strength
		 points will be subtracted.
		 */
		
		case 1:
			intelligence++;
			points--;
			break;	
		case 2:
			strength++;
			points--;
			break; 
			
		default:
			// defaultMsg to put things like "wtf nerd, wdym with '69'?"
			System.out.println(defaultMsg);//and well, try found a way to make the user
			break;						  // put a skill point between 1 or 2	
				}
			}else{
				System.out.println(defaultMsg);
				//if user dont had points enough, that msg will appear
			}	
		}
	/*
	Double bad guys that you need to put in every player declaration
	(also, put in a while loop)
	*/
	
	//Verify if player is dead or not.
	public boolean verifyHp(){
		if(this.hp < 1){
			//ggez, noob
			System.out.println("Game Over!");
			
			/*
			 if player dies, he will return "true", soo...
			  know that you need to use this to end the combat,
			  or the game
			*/
			return true;
		}
		return false;
	}
	
	//Verify when your player reach the necessary XP to up
	public void verifyLevel(){
		if(this.xp >= level * 200){
			//level up, yey
			this.level++;	
			points = points + 3;
			hp = hp * level;
			
			
		}else if (this.intelligence > level) {
			if(this.xp >= level * 100){
				
				/*
				level up, but easier, cuz intelligence good,
				and makes you gain experience easier.
				also, for now, intelligence its a really great exploit, lol
				*/
				
				this.level++;
				hp = hp * level;
				
				//if you already smart, why you need to gain more skill points? nerd
				points = points + 2;
			}
		}
	}
				   //put a random number here
	public int punch(int probability){
		int damage;	
		if(probability == 0){
			damage = 0;//missed:D i recommend you to use a 7 numbers random, or the player will miss too much
		}else{
		damage = strength * probability;
		}
		return damage;
		
		/*
		more complex combat system soon!
		*/
	}
	
	
	//getters and setters funni
	public void setStrength(byte Strength){
		this.strength = Strength;
	}
	public byte getStrength(){
		return strength;
	}
	public byte getLevel() {
		return level;
	}
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
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = this.name;
	}
	public byte getIntelligence() {
		return intelligence;
	}
}

