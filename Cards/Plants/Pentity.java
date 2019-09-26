public class Pentity extends Actor {
	public int lane;
	public int order; //1 is front, 2 is back - think of it as the order they get hit in
	
	public Pentity(int l, int o) {
		lane = l;
		order = o;
	}
	
	public setSuperVars(int a, int h, String[] x) {
		super(a, h, x);
	}
	
	public setGrandparentVars() {
		super.setSuperVars(String n, String d, int c, String[] t)
	}
}