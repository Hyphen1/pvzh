public class Deck {
	
	//placeholder vars for poc, will eventually use a string array of the names of cards in a storage file
	public Actor[] zDeck;
	public Actor[] pDeck;
	
	//placeholder methods, will use manual population
	public zPopulate () {
		zDeck = new Actor[40]
		Actor x = new Actor(1, 1, new String[0]);
		x.setSuperVars("Garden Zombie", "", 1, new String[] {"Basic"})
		for (int i = 0; i < zDeck.length; i++) {
			zDeck[i] = x;
		}
	}
	
	public pPopulate () {
		pDeck = new Actor[40]
		Actor x = new Actor(1, 1, new String[0]);
		x.setSuperVars("Peashooter", "", 1, new String[] {"Basic"})
		for (int i = 0; i < zDeck.length; i++) {
			zDeck[i] = x;
		}
	}
	
	public pickRandom () {
		
	}
}