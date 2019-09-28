public class Zentity extends Actor {
	public int lane;
	public int order; //1 is front, 2 is back - think of it as the order they get hit in - not useful for zombies, mostly for plant teamup
	
	public Zentity(int l, int o) {
		lane = l;
		order = o;
	}
	
	public setSuperVars(int a, int h, String[] x) {
		super(a, h, x);
	}	
	
	public setGrandparentVars(String n, String d, int c, String[] t) {
		super.setSuperVars(n, d, c, t);
	}
}