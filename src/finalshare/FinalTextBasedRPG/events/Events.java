package finalshare.FinalTextBasedRPG.events;

public abstract class Events {
	
	private int hp, xp, coins;
	
	
	
	/*
	 you can choose if you gonna use any attribute here.
	 Let your creativity be free!
	 if you dont know how to use any of this methods, go to MonsterEvent.java
	 
	 friendly warning: i am giving all of the liberty for you do your own event system,
	 so... you dont need to follow exactly what i code in MonsterEvent.java, but is recommended
	 to follow my steps, bacause you know, the logic that i used to structure the Monster class 
	 can be way different that you understood.
	*/
	public abstract int goodEvent(int hp, int xp, int coins);
	public abstract int neutralEvent(int hp, int xp, int coins);
	public abstract int badEvent(int hp, int xp, int coins);
	
	/*
	do whatever you want to trigger the events, but as the library dev
	i highly recommend you to use the code below in the implementation class:
	*/
	public void eventTrigger(int random){
		/* 
		 Also, use a random number 0 and 10
		 */
		if(random < 3){
			goodEvent(this.hp, this.xp, this.coins);
		}else if(random > 4 && random != 6) {
			neutralEvent(this.hp, this.xp, this.coins);
		}else if(random >= 6) {
			badEvent(this.hp, this.xp, this.coins);
			}
		}
		
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public int getCoins() {
		return coins;
	}
	public int getHp() {
		return hp;
	}
	public int getXp() {
		return xp;
	}
}
