import PVZH;

public class Zombiephase {
	
	public Actor zombie;
	
	public Zombiephase() {
		zombie = new Actor(1, 1, new String[0]);
		zombie.setSuperVars("", "", 0, new String[0]);
	}
	
	public Zombiephase(Zentity z) {
		zombie = z;
	}
	
	public placeActor(int l, int o) {
		Field.placeZentity(zombie, l, o);
	}
}