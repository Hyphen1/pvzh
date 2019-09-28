import java.util.*;
import java.lang.Math;
import PVZH;

public class Deck {
	
	//placeholder vars for poc, will eventually use a string array of the names of cards in a storage file
	public Card[] zDeck;
	public Card[] pDeck;
	
	//placeholder methods, will use manual population - using generator to create cards with stats +- 1 of sun cost
	public zPopulate () {
		zDeck = new Card[40]
		Random r = new Random();
		int baseval = r.nextInt(7);
		int mod1 = (int)(Math.random()*3 - 1.5)
		int mod2 = (int)(Math.random()*3 - 1.5)
		Actor x = new Actor(baseval + mod1, baseval + mod2, new String[0]);
		x.setSuperVars("Random Zombie", "", 1, new String[] {"Basic"})
		for (int i = 0; i < 21; i++) {
			zDeck[i] = x;
		}
		
		tr = 
		for (int i = 31; i < 41; i++) {
			zDeck[i] = tr;
		}
	}
	
	public pPopulate () {
		pDeck = new Card[40]
		Random r = new Random();
		int baseval = r.nextInt(7);
		int mod1 = (int)(Math.random()*3 - 1.5)
		int mod2 = (int)(Math.random()*3 - 1.5)
		Actor x = new Actor(baseval + mod1, baseval + mod2, new String[0]);
		x.setSuperVars("Random Plant", "", baseval, new String[] {"Basic"})
		for (int i = 0; i < 31; i++) {
			zDeck[i] = x;
		}
		
		tr = 
		for (int i = 31; i < 41; i++) {
			zDeck[i] = tr;
		}
	}
	
	public int zPickRandom () {
		Random r = new Random();
		return zDeck[r.nextInt(40)];
	}
	
	public int pPickRandom () {
		Random r = new Random();
		return pDeck[r.nextInt(40)];
	}
}