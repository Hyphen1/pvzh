import PVZH;

public class Field {
	
	public List<Zentity> zombies;
	public List<Pentity> plants;
	
	public String laneOne;
	public String laneTwo;
	public String laneThree;
	public String laneFour;
	public String laneFive;
	
	public String[] lanes;
	
	public Field() {
		zombies = new ArrayList<Zentity>();
		plants = new ArrayList<Pentity>();
		
		laneOne = 'H';
		laneTwo = 'G';
		laneThree = 'G';
		laneFour = 'G';
		laneFive = 'W';
		
		lanes = new String[] {laneOne, laneTwo, laneThree, laneFour, laneFive};
	}
	
	public void placeZentity(Actor z, int l, int o) {
		Zentity newZ = new Zentity(l, o);
		newZ.setSuperVars(z.atk, z.hp, z.props);
		newz.setGrandparentVars(z.name, z.description, z.cost, z.tribes);
		zombies.add(newZ);
	}
	
	public void placePentity(Actor p, int l, int o) {
		Zentity newP = new Zentity(l, o);
		newP.setSuperVars(p.atk, p.hp, p.props);
		newP.setGrandparentVars(p.name, p.description, p.cost, p.tribes);
		plants.add(newP);
	}
}