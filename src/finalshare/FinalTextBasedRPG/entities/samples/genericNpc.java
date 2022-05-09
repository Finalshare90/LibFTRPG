
package finalshare.FinalTextBasedRPG.entities.sample;

import java.util.Random;

import finalshare.FinalTextBasedRPG.entities.Npc;
import finalshare.FinalTextBasedRPG.entities.Player;
import finalshare.FinalTextBasedRPG.events.Events;

public class genericNpc extends Player implements Npc{

	Random r = new Random();
	
	public genericNpc(String nome, int hp) {
	super(nome, hp);
	}
	
	@Override
	public boolean verifyHp() {
		
		return super.verifyHp();
	}
	
	@Override
	public int attack(int random) {
		
		int damage = super.punch(random);
		
		return damage;
		
	}
	/*
	seems to be a useless method, but... trust me it is very
	useful to give a special trigger for each event in your
	game with an npc
	 */
	@Override
	public void eventTrigger(Events event) {
		int RandomNumber = r.nextInt(10);
		event.eventTrigger(RandomNumber);	
	}
	@Override
	public boolean isAgressive(boolean isAgressive) {
		return isAgressive;		
	}

	@Override
	public int getHp() {
		return super.getHp();
	}
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public byte getStrength() {
		return super.getStrength();
	}
	
	@Override
	public void setStrength(byte Strength) {
		super.setStrength(Strength);
	}
	
	
	
	public void setHp(int hp){
		super.setHp(hp);
	}
}
