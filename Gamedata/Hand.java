import PVZH;

public class Hand {
	public List<Actor> hand;
	
	public Hand() {
		hand = new ArrayList<Actor>();
	}
	
	public void discard(int index) {
		hand.remove(index);
	}
	
	public void add(Actor a) {
		hand.add(a);
	}
}