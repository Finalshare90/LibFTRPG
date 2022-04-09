package finalshare.FinalTextBasedRPG.events.sample;

import finalshare.FinalTextBasedRPG.entities.Monster;
import finalshare.FinalTextBasedRPG.events.Events;

public class MonsterEvent extends Events{

	private Monster monster;
	
	/* 
	broke constructor, if you try use this shit, the events will return
	a nice NullPointerException, soo... use monster setter instead, i will
	resolve that problem later.
	*/
	MonsterEvent(Monster monster){
		this.monster = monster;
	}
	
	@Override
	public int badEvent(int hp, int xp, int coins) {

		System.out.println("you see something like a :" + monster.getName() + " in the bushes, "
							+ "\n but without lucky, after inspect a few bushes around you "
							+ "finded " +  monster.getName() + " prepare yourself for a battle!");
		
		return coins;
		
	}@Override
	public int goodEvent(int hp, int xp, int coins) {
		
		xp = getXp() + 10;
	
		System.out.println("you see something like a: " + monster.getName() + " in the bushes "
							+ "\n but lucky, after inspect a few bushes around you, you dont"
							+ "\n finded nothing" + "\n you have earned 10 of xp");
		
		return xp;
		
	}@Override
	public int neutralEvent(int hp, int xp, int coins) {
		
		System.out.println("you see something like a:" + monster.getName() + "in the bushes"
				+ "but you just ignored him, and keept your path");

		
		return 0;
		
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
}
