package finalshare.FinalTextBasedRPG.entities;

import finalshare.FinalTextBasedRPG.events.*;

public interface Npc{
	
	/*
	Don't want to use the monster class, or simply need something more advanced?
	well, we have the NPC interface, implement it whenever you need a more
    advanced entity.
	
	it is also highly recommended that you follow the following model when declaring an NPC:
	Npc npc = new genericNpc("Name", hp);
	
	if you have doubts about how to implement, or where to implement the NPC interface,
    go to the Entity Samples.
	*/
	
	public boolean verifyHp();
	public boolean isAgressive(boolean isAgressive);
	public void eventTrigger(Events event);
	public int attack(int random);
	
	
	public void setHp(int hp);
	public int getHp();
	
	public String getName();
	
	public void setStrength(byte strength);
	public byte getStrength();
}
