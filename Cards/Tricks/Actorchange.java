public Statchange extends Action {
	
	public Statchange() {
		ArrayList<String> tgts = new ArrayList<String>();
		tgts.add('a');
		super(tgts);
	}
	
	public void changeZentityAtk(Field f, Zentity z, int newAtk) {
		f.zombies[f.zombies.indexOf(z)].atk = newAtk;
	}
	
	public void changePentityAtk(Field f, Pentity p, int newAtk) {
		f.plants[f.plants.indexOf(p)].atk = newAtk;
	}
	
	public void alterZentityAtk(Field f, Zentity z, int deltaAtk) {
		f.zombies[f.zombies.indexOf(z)].atk += deltaAtk;
	}
	
	public void alterPentityAtk(Field f, Pentity p, int deltaAtk) {
		f.plants[f.plants.indexOf(p)].atk += deltaAtk;
	}
	
	public void destroyZ(Field f, Zentity z) {
		f.zombies.remove(z);
	}
	
	public void destroyP(Field f, Pentity p) {
		f.plants.remove(p);
	}
}