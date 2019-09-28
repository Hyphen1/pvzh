import java.util.*;
import PVZH;

public class Actor extends Card {
	public int atk;
	public int hp;
	public List<Cardproperties> props;
	
	public Actor() {
		atk = 0;
		hp = 0;
		props = new ArrayList<Cardproperties>();
	}
	
	public Actor(int a, int h) {
		atk = a;
		hp = h;
	}
	
	public Actor(int a, int h, String[] x) {
		atk = a;
		hp = h;
		props = new ArrayList<Cardproperties>();
		
		//add every String in x as the id of a property
		for (int i = 0; i < x.length; i++;) {
			props.add(new Cardproperties(x[i]);
		}
	}
	
	public boolean isActor() {
		return true
	}
	
	public setSuperVars(String n, String d, int c, String[] t) {
		super(n, d, c, t);
	}
	
	public void activateStrikethrough() {
		Cardproperties strikethrough = new Cardproperties('s');
		props.add(strikethrough);
	}
}