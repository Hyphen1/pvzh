import PVZH;

public class Card {
	public String name;
	public String description;
	public String cost;
	public String[] tribes;
	
	public Card() {
		name = "";
		description = "";
		cost = 0;
		tribes = new String[0];
	}
	
	public Card(String n, int c) {
		name = n;
		description = "";
		cost = c;
		tribes = new String[0];
	}
	
	public Card(String n, String d, int c, String[] t) {
		name = n;
		description = d;
		cost = c;
		tribes = t;
	}
}