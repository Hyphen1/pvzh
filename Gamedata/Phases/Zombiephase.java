import PVZH;

public class Zombiephase {
	
	public Actor zombie;
	public boolean status;
	
	public Zombiephase() {
		zombie = new Actor(1, 1, new String[0]);
		zombie.setSuperVars("", "", 0, new String[0]);
		status = true;
	}
	
	public Zombiephase(Zentity z) {
		zombie = z;
		status = true;
	}
	
	public placeActor(int l, int o) {
		Field.placeZentity(zombie, l, o);
	}
	
	public void endPhase() {
		status = false;
	}
}