import PVZH;

public class Plantphase {
	
	public Actor plant;
	
	public Plantphase() {
		plant = new Actor(1, 1, new String[0]);
		plant.setSuperVars("", "", 0, new String[0]);
	}
	
	public Plantphase(Zentity z) {
		plant = z;
	}
	
	public placeActor(int l, int o) {
		Field.placeZentity(plant, l, o);
	}
}